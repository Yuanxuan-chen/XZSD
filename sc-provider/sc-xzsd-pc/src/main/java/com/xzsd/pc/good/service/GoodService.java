package com.xzsd.pc.good.service;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.good.dao.GoodDao;
import com.xzsd.pc.good.entity.Good;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author Yuanxuan
 * @date 2020-04-08 上午 07:44
 */
@Service
public class GoodService {

    @Resource
    private GoodDao goodDao;


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
