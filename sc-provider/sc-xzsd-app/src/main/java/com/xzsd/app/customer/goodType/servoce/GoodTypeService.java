package com.xzsd.app.customer.goodType.servoce;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.customer.goodType.dao.GoodTypeDao;
import com.xzsd.app.customer.goodType.entity.GoodType;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
     * @param goodType
     * @return
     */
    public AppResponse levelOneList(GoodType goodType) {
        List<GoodType> goodTypeInfo = goodTypeDao.levelOneList(goodType);
        if(null == goodTypeInfo) {
            return AppResponse.bizError("商品分类一级查询异常");
        }
        return AppResponse.success("商品分类一级查询成功", new PageInfo<GoodType>(goodTypeInfo));
    }

    /**
     * 商品分类二级查询
     * @param goodType
     * @return
     */
    public AppResponse levelTwoList(GoodType goodType) {
        List<GoodType> goodTypeInfo = goodTypeDao.levelTwoList(goodType);
        if(null == goodTypeInfo) {
            return AppResponse.bizError("商品分类二级查询异常");
        }
        return AppResponse.success("商品分类二级查询成功", new PageInfo<GoodType>(goodTypeInfo));
    }

    /**
     * 商品信息查询
     * @param goodType
     * @return
     */
    public AppResponse selectGood(GoodType goodType) {
        GoodType goodTypeInfo = goodTypeDao.selectGood(goodType);
        if(null == goodTypeInfo) {
            return AppResponse.bizError("商品信息查询异常");
        }
        return AppResponse.success("商品信息查询成功", goodTypeInfo);
    }

    /**
     * 商品评价分页查询
     * @param goodType
     * @return
     */
    public AppResponse listAssess(GoodType goodType) {
        PageHelper.startPage(goodType.getPageNum(), goodType.getPageSize());
        List<GoodType> goodTypeInfo = goodTypeDao.listAssess(goodType);
        if(null == goodTypeInfo) {
            return AppResponse.bizError("商品评价分页查询异常");
        }
        return AppResponse.success("商品评价分页查询成功", new PageInfo<GoodType>(goodTypeInfo));
    }



}
