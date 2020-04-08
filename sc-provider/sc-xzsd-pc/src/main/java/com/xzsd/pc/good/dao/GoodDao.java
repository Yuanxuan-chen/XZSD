package com.xzsd.pc.good.dao;

import com.xzsd.pc.good.entity.Good;

/**
 * 商品DAO
 * @author Yuanxuan
 * @date 2020-04-08 上午 07:41
 */
public interface GoodDao {

    /**
     * 创建商品
     * @param good
     * @return
     */
    int createGood(Good good);

    /**
     * 删除商品
     */
    int deleteGood(String goodCode);

}
