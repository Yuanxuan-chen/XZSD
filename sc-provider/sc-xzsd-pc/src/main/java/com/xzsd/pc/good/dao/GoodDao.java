package com.xzsd.pc.good.dao;

import com.xzsd.pc.good.entity.Good;

import java.util.List;

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
     * 修改商品信息
     * @param good
     * @return
     */
    int updateGood(Good good);

    /**
     * 删除商品
     * @param goodCode
     * @return
     */
    int deleteGood(String goodCode);


    /**
     * 商品上架/下架
     * @param good
     * @return
     */
    int stateGood(Good good);

    /**
     * 商品详细信息查询
     * @param goodCode
     * @return
     */
    Good selectGood(String goodCode);

    /**
     * 商品分页查询
     * @param good
     * @return
     */
    List<Good> listGood(Good good);
}
