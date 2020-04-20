package com.xzsd.app.customer.shopCart.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.neusoft.util.UUIDUtils;
import com.xzsd.app.customer.shopCart.dao.ShopCartDao;
import com.xzsd.app.customer.shopCart.entity.ShopCart;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Yuanxuan
 * @date 2020-04-20 上午 09:07
 */
@Service
public class ShopCartService {

    @Resource
    private ShopCartDao shopCartDao;


    /**
     * 购物车新增商品
     * @param shopCart
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse saveShopCart(ShopCart shopCart) {
        //生成随机购物车编号
        shopCart.setCartCode(UUIDUtils.getUUID());
        //获取添加商品的用户编号
        String createUser = SecurityUtils.getCurrentUserId();
        shopCart.setUserCode(createUser);
        shopCart.setCreateUser(createUser);
        //购物车新增商品
        int count = shopCartDao.saveShopCart(shopCart);
        if (0 == count) {
            return AppResponse.bizError("购物车新增商品异常");
        }
        return AppResponse.success("购物车新增商品成功");
    }

    /**
     * 购物车修改商品
     * @param shopCart
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse stateShopCart(ShopCart shopCart) {
        //获取添加商品的用户编号
        String updateUser = SecurityUtils.getCurrentUserId();
        shopCart.setUpdateUser(updateUser);
        //购物车修改商品
        int count = shopCartDao.stateShopCart(shopCart);
        if (0 == count) {
            return AppResponse.bizError("购物车修改商品异常");
        }
        return AppResponse.success("购物车修改商品成功");
    }

    /**
     * 购物车删除商品
     * @param shopCart
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteShopCart(ShopCart shopCart) {
        //获取添加商品的用户编号
        String updateUser = SecurityUtils.getCurrentUserId();
        shopCart.setUpdateUser(updateUser);
        int count = shopCartDao.deleteShopCart(shopCart);
        if (0 == count) {
            return AppResponse.bizError("购物车删除商品异常");
        }
        return AppResponse.success("购物车删除商品成功");
    }

    /**
     * 购物车查询商品
     * @param shopCart
     * @return
     */
    public AppResponse listShopCart(ShopCart shopCart) {
        PageHelper.startPage(shopCart.getPageNum(), shopCart.getPageSize());
        List<ShopCart> shopCartInfo = shopCartDao.listShopCart(shopCart);
        if (null == shopCartInfo) {
            return AppResponse.bizError("购物车查询商品异常");
        }
        return AppResponse.success("购物车查询商品成功", new PageInfo<ShopCart>(shopCartInfo));
    }

}
