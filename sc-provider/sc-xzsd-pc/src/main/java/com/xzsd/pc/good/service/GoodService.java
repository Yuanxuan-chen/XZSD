package com.xzsd.pc.good.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
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

        return AppResponse.success("成功", new PageInfo<Good>(goodList));

    }

    /**
     * 商品详细信息查询
     * @param goodCode
     * @return
     */
    public AppResponse selectGood(String goodCode) {
        return AppResponse.success("商品详细信息查询成功功", goodDao.selectGood(goodCode));
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
    public AppResponse createGood(Good good) {
        int count = goodDao.createGood(good);
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
        int count = goodDao.updateGood(good);
        if(0 == count) {
            return AppResponse.bizError("商品信息修改失败");
        }
        return AppResponse.success("商品信息修改成功");
    }


    /**
     * 删除商品
     * @param goodCode
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteGood(String goodCode) {
        int count = goodDao.deleteGood(goodCode);
        if(0 == count) {
            return AppResponse.bizError("商品删除失败");
        }
        return AppResponse.success("商品删除成功");
    }



}
