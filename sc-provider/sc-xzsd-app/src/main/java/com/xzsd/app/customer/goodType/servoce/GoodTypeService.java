package com.xzsd.app.customer.goodType.servoce;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.neusoft.util.UUIDUtils;
import com.xzsd.app.customer.goodType.dao.GoodTypeDao;
import com.xzsd.app.customer.goodType.entity.GoodType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuanxuan
 * @date 2020-04-17 下午 02:30
 */
@Service
public class GoodTypeService {

    @Resource
    private GoodTypeDao goodTypeDao;


    /**
     * 商品分类一级查询
     * @author Yuanxuan
     * @date 2020-04-17
     * @return
     */
    public AppResponse levelOneList() {
        List<GoodType> goodTypeInfo = goodTypeDao.levelOneList();
        if(null == goodTypeInfo) {
            return AppResponse.bizError("商品分类一级查询异常");
        }
        return AppResponse.success("商品分类一级查询成功", goodTypeInfo);
    }

    /**
     * 商品分类二级查询
     * @author Yuanxuan
     * @date 2020-04-17
     * @param goodType
     * @return
     */
    public AppResponse levelTwoList(GoodType goodType) {
        List<GoodType> goodTypeInfo = goodTypeDao.levelTwoList(goodType);
        if(null == goodTypeInfo) {
            return AppResponse.bizError("商品分类二级查询异常");
        }
        return AppResponse.success("商品分类二级查询成功", goodTypeInfo);
    }

    /**
     * 商品信息查询
     * @author Yuanxuan
     * @date 2020-04-17
     * @param goodType
     * @return
     */
    public AppResponse selectGood(GoodType goodType) {
        //获取登录人编号
        String createUser = SecurityUtils.getCurrentUserId();
        goodType.setCreateUser(createUser);
        //浏览量加一
        goodTypeDao.browseVolumeOnePlus(goodType);
        //商品信息查询
        GoodType goodTypeInfo = goodTypeDao.selectGood(goodType);
        if(null == goodTypeInfo) {
            return AppResponse.bizError("商品信息查询异常");
        }
        return AppResponse.success("商品信息查询成功", goodTypeInfo);
    }

    /**
     * 商品评价分页查询
     * @author Yuanxuan
     * @date 2020-04-17
     * @param goodType
     * @return
     */
    public AppResponse listAssess(GoodType goodType) {
        List<GoodType> goodTypeInfo = goodTypeDao.listAssess(goodType);
        if(null == goodTypeInfo) {
            return AppResponse.bizError("商品评价分页查询异常");
        }
        return AppResponse.success("商品评价分页查询成功", goodTypeInfo);
    }


    /**
     * 商品评价
     * @author Yuanxuan
     * @date 2020-04-17
     * @param goodType
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse saveAssess(GoodType goodType) {
        //变更订单状态
        int state = goodTypeDao.orderSate(goodType);
        if (0 == state) {
            return AppResponse.bizError("订单状态修改失败");
        }
        //获取当前登录人的userCode
        String createUser = SecurityUtils.getCurrentUserId();
        //商品评价
        List<GoodType> assessList = new ArrayList<>();
        for (int i = 0; i < goodType.getGoodCodeList().size(); i++){
            GoodType assess = new GoodType();
            //set评价编码
            assess.setAssessCode(UUIDUtils.getUUID());
            //set评价人
            assess.setCreateUser(createUser);
            //set商品编号
            assess.setGoodCode(goodType.getGoodCodeList().get(i));
            //set评价等级
            assess.setAssessRank(goodType.getAssessRankList().get(i));
            //set评价内容
            if(goodType.getAssessContentList() != null && goodType.getAssessContentList().size() > 0) {
                assess.setAssessContent(goodType.getAssessContentList().get(i));
            }
            //add商品评价汇总
            assessList.add(assess);
        }
        //商品评价
        int count = goodTypeDao.saveAssess(assessList);
        if(0 == count) {
            return AppResponse.bizError("商品评价异常");
        }
        return AppResponse.success("商品评价成功, 数量为: " + count);
    }

}
