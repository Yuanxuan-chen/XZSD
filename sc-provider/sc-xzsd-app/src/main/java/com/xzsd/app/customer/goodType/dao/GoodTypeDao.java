package com.xzsd.app.customer.goodType.dao;

import com.xzsd.app.customer.goodType.entity.GoodType;

import java.util.List;

/**
 * @author Yuanxuan
 * @date 2020-04-17 下午 02:21
 */
public interface GoodTypeDao {

    /**
     * 商品分类一级查询
     * @param goodType
     * @return
     */
    List<GoodType> levelOneList(GoodType goodType);

    /**
     * 商品分类二级查询
     * @param goodType
     * @return
     */
    List<GoodType> levelTwoList(GoodType goodType);

    /**
     * 商品信息查询
     * @param goodType
     * @return
     */
    GoodType selectGood(GoodType goodType);


    /**
     * 浏览量加一
     * @param goodType
     */
    void browseVolumeOnePlus(GoodType goodType);

    /**
     * 商品评价分页查询
     * @param goodType
     * @return
     */
    List<GoodType> listAssess(GoodType goodType);


    /**
     * 订单评价
     * @param goodType
     * @return
     */
    int saveAssess(List<GoodType> goodType);

    /**
     * 订单评价
     * @param goodType
     * @return
     */
    int orderSate(GoodType goodType);

}
