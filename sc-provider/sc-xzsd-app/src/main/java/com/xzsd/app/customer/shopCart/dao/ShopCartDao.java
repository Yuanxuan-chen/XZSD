package com.xzsd.app.customer.shopCart.dao;

import com.xzsd.app.customer.shopCart.entity.ShopCart;

import java.util.List;

/**
 * @author Yuanxuan
 * @date 2020-04-20 上午 08:56
 */
public interface ShopCartDao {

    /**
     * 购物车新增商品
     * @param shopCart
     * @return
     */
    int saveShopCart(ShopCart shopCart);

    /**
     * 购物车修改商品
     * @param shopCart
     * @return
     */
    int stateShopCart(ShopCart shopCart);

    /**
     * 购物车删除商品
     * @param shopCart
     * @return
     */
    int deleteShopCart(ShopCart shopCart);

    /**
     * 购物车查询商品
     * @param shopCart
     * @return
     */
    List<ShopCart> listShopCart(ShopCart shopCart);

}
