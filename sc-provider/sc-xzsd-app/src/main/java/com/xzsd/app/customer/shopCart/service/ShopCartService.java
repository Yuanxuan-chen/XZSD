package com.xzsd.app.customer.shopCart.service;

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
 * @date 2020-04-17 上午 09:07
 */
@Service
public class ShopCartService {

    @Resource
    private ShopCartDao shopCartDao;


    /**
     * 购物车新增商品
     * @author Yuanxuan
     * @date 2020-04-17
     * @param shopCart
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse saveShopCart(ShopCart shopCart) {
        //获取添加商品的用户编号
        String createUser = SecurityUtils.getCurrentUserId();
        shopCart.setUserCode(createUser);
        shopCart.setCreateUser(createUser);
        shopCart.setUpdateUser(createUser);
        //判断商品是否存在购物车
        ShopCart shopGoodInfo = shopCartDao.getGoodInfo(shopCart);
        int count = 0;
        if(null != shopGoodInfo) {
            //直接在存在的购物车上叠加
            shopCart.setCartCode(shopGoodInfo.getCartCode());
            shopCart.setGoodNumber(shopGoodInfo.getGoodNumber() + shopCart.getGoodNumber());
            //商品叠加
            count = shopCartDao.stateShopCart(shopCart);
        }else{
            //生成随机购物车编号
            shopCart.setCartCode(UUIDUtils.getUUID());
            //购物车新增商品
            count = shopCartDao.saveShopCart(shopCart);
        }
        if (0 == count) {
            return AppResponse.bizError("购物车新增商品异常");
        }
        return AppResponse.success("购物车新增商品成功");

    }

    /**
     * 购物车修改商品
     * @author Yuanxuan
     * @date 2020-04-17
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
     * @author Yuanxuan
     * @date 2020-04-17
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
     * @author Yuanxuan-chen
     * @date 2020-04-27
     * @param shopCart
     * @return
     */
    public AppResponse listShopCart(ShopCart shopCart) {
        //获取添加商品的用户编号
        String updateUser = SecurityUtils.getCurrentUserId();
        shopCart.setUpdateUser(updateUser);
        //购物车查询商品
        List<ShopCart> shopCartInfo = shopCartDao.listShopCart(shopCart);
        if (null == shopCartInfo) {
            return AppResponse.bizError("购物车查询商品异常");
        }
        return AppResponse.success("购物车查询商品成功", shopCartInfo);
    }

}
