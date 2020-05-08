package com.xzsd.app.customer.shopCart.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.customer.shopCart.entity.ShopCart;
import com.xzsd.app.customer.shopCart.service.ShopCartService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 购物车管理
 * @author Yuanxuan
 * @date 2020-04-20 上午 09:32
 */
@RestController
@RequestMapping("/shopCart")
public class ShopCartController {

    @Resource
    private ShopCartService shopCartService;

    /**
     * 购物车新增商品
     * @param shopCart
     * @return
     */
    @PostMapping("saveShopCart")
    private AppResponse saveShopCart(ShopCart shopCart) {
        try {
            return shopCartService.saveShopCart(shopCart);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 购物车修改商品
     * @param shopCart
     * @return
     */
    @PostMapping("stateShopCart")
    private AppResponse stateShopCart(ShopCart shopCart) {
        try {
            return shopCartService.stateShopCart(shopCart);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 购物车删除商品
     * @param shopCart
     * @return
     */
    @PostMapping("deleteShopCart")
    private AppResponse deleteShopCart(ShopCart shopCart) {
        try {
            return shopCartService.deleteShopCart(shopCart);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 购物车查询商品
     * @param shopCart
     * @return
     */
    @PostMapping("listShopCart")
    private AppResponse listShopCart(ShopCart shopCart) {
        try {
            return shopCartService.listShopCart(shopCart);
        }catch (Exception e) {
            throw e;
        }
    }
}
