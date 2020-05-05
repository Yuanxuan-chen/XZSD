package com.xzsd.pc.good.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.neusoft.util.UUIDUtils;
import com.xzsd.pc.good.dao.GoodDao;
import com.xzsd.pc.good.entity.Good;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Yuanxuan
 * @date 2020-04-08 上午 07:44
 */
@Service
public class GoodService {

    @Resource
    private GoodDao goodDao;


    /**
     * 商品分页查询
     * @param good
     * @return
     */
    public AppResponse listGood(Good good){
        PageHelper.startPage(good.getPageNum(), good.getPageSize());
        List<Good> goodList = goodDao.listGood(good);
        return AppResponse.success("商品分页查询成功", new PageInfo<Good>(goodList));
    }

    /**
     * 商品选择
     * @param good
     * @return
     */
    public AppResponse listGoodOfSlideshow(Good good){
        PageHelper.startPage(good.getPageNum(), good.getPageSize());
        List<Good> goodList = goodDao.listGoodOfSlideshow(good);
        return AppResponse.success("商品选择成功", new PageInfo<Good>(goodList));
    }

    /**
     * 商品详细信息查询
     * @param goodCode
     * @return
     */
    public AppResponse selectGood(String goodCode) {
        Good good = goodDao.selectGood(goodCode);
        if(null == good) {
            return AppResponse.success("无此类商品, 请重新输入", good);
        }
        return AppResponse.success("商品详细信息查询成功", good);
    }

    /**
     * 商品状态更改
     * @author Yuanxuan
     * @date 2020-04-08
     * @param good
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse stateGood(Good good) {
        //获取修改人的编码
        String updateUser = SecurityUtils.getCurrentUserId();
        good.setUpdateUser(updateUser);
        int count = goodDao.stateGood(good);
        if(0 == count) {
            return AppResponse.bizError("商品状态更改失败");
        }
        return AppResponse.success("商品状态更改成功");
    }

    /**
     * 商品创建
     * @param good
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse saveGood(Good good) {
        //获取创建人的编码
        String createUser = SecurityUtils.getCurrentUserId();
        good.setCreateUser(createUser);
        //生成随机商品编码
        good.setGoodCode(UUIDUtils.getDateRandomID());
        //商品创建
        int count = goodDao.saveGood(good);
        if(0 == count) {
            return AppResponse.bizError("商品新增失败");
        }
        return AppResponse.success("商品新增成功");
    }


    /**
     * 商品信息修改
     * @author Yuanxuan
     * @date 2020-04-08
     * @param good
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateGood(Good good) {
        //获取修改人的编码
        String updateUser = SecurityUtils.getCurrentUserId();
        good.setUpdateUser(updateUser);
        int count = goodDao.updateGood(good);
        if(0 == count) {
            return AppResponse.bizError("商品信息修改失败");
        }
        return AppResponse.success("商品信息修改成功");
    }


    /**
     * 删除商品
     * @param good
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteGood(Good good) {
        //获取修改人的编码
        String updateUser = SecurityUtils.getCurrentUserId();
        good.setUpdateUser(updateUser);
        int count = goodDao.deleteGood(good);
        if(0 == count) {
            return AppResponse.bizError("商品删除失败");
        }
        return AppResponse.success("商品删除成功");
    }

}
