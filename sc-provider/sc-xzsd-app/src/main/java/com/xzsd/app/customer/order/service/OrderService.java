package com.xzsd.app.customer.order.service;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.neusoft.util.UUIDUtils;
import com.xzsd.app.customer.order.dao.OrderDao;
import com.xzsd.app.customer.order.entity.Order;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuanxuan
 * @date 2020-04-21 上午 09:51
 */
@Service
public class OrderService {

    @Resource
    private OrderDao orderDao;

    /**
     * 创建订单表汇总
     * @author Yuanxuan-chen
     * @date 2020-04-27
     * @param order
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse saveOrder(Order order){
        //获取当前用户编号
        String createUser = SecurityUtils.getCurrentUserId();
        order.setCreateUser(createUser);
        //判断客户门店邀请码是否填写
        String inviteCode = orderDao.getInviteCode(order);
        if (null == inviteCode) {
            return AppResponse.bizError("门店邀请码未填写");
        }
        //生成订单汇总表编号
        String orderCode = UUIDUtils.getUUID();
        order.setOrderCode(orderCode);
        //获取用户信息
        Order userInfo = orderDao.getUserInfo(order);
        order.setStoreCode(userInfo.getStoreCode());
        order.setBuyerName(userInfo.getBuyerName());
        order.setBuyerTel(userInfo.getBuyerTel());
        //生成订单详情orderList
        List<Order> orderList = new ArrayList<>();
        //商品总数计数器
        int allNumber = 0;
        //商品总价计数器
        double allPrice = 0;
        for(int i = 0; i < order.getGoodCodeList().size(); i++) {
            Order orderInfo = new Order();
            //生成订单详情编号
            orderInfo.setOrderDetailCode(UUIDUtils.getUUID());
            //set订单编号
            orderInfo.setOrderCode(orderCode);
            //set用户信息
            orderInfo.setCreateUser(createUser);
            //set商品编号
            orderInfo.setGoodCode(order.getGoodCodeList().get(i));
            //set客户选择的商品数量
            int number = order.getTotalNumberList().get(i);
            orderInfo.setTotalNumber(number);
            allNumber += number;
            //set商品价格
            String price = order.getSellPriceList().get(i);
            orderInfo.setSellPrice(price);
            allPrice += Double.parseDouble(price)*number;
            orderList.add(orderInfo);
        }
        //创建订单详情表
        int countDetail = orderDao.saveOrderDetail(orderList);
        //各商品销量累加
        int countSellPrice =  orderDao.sellVolumeOnePlus(orderList);
        if(0 == countSellPrice){
            return AppResponse.bizError("各商品销量累加异常");
        }
        //从购物车删除各商品
        if (!"0".equals(order.getCartCodeList().get(0))){
            int countDelete = orderDao.deleteShopCart(order);
            if(0 == countDelete){
                return AppResponse.bizError("购物车删除各商品异常");
            }
        }

        //创建订单汇总表
        order.setAllPrice(String.valueOf(allPrice));
        order.setAllNumber(allNumber);
        int countOrder = orderDao.saveOrder(order);
        if(0 == countOrder || 0 == countDetail ) {
            return AppResponse.bizError("创建订单表异常");
        }
        return AppResponse.success("创建订单表成功, 共加入 "+ String.valueOf(countDetail) + " 种商品");
    }

    /**
     * 订单状态修改
     * @param order
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse stateOrder(Order order){
        int count = orderDao.stateOrder(order);
        if(0 == count) {
            return AppResponse.bizError("订单状态修改异常");
        }
        return AppResponse.success("订单状态修改成功");
    }


    /**
     * 订单详情查询
     * @param order
     * @return
     */
    public AppResponse selectOrder(Order order){
        List<Order> orderInfo = orderDao.selectOrder(order);
        if(null == orderInfo) {
            return AppResponse.bizError("订单详情查询异常");
        }
        return AppResponse.success("订单详情查询成功", orderInfo);
    }

    /**
     * 订单列表查询
     * @author Yuanxuan-chen
     * @date 2020-04-27
     * @param order
     * @return
     */
    public AppResponse listOrder(Order order){
        //获取当前登录人信息
        order.setUpdateUser(SecurityUtils.getCurrentUserId());
        //订单列表查询
        List<Order> orderInfo = orderDao.listOrder(order);
        if(null == orderInfo) {
            return AppResponse.bizError("订单列表查询异常");
        }
        return AppResponse.success("订单列表查询成功", orderInfo);
    }


    /**
     * 查询订单评价商品信息列表
     * @param order
     * @return
     */
    public AppResponse listAssess(Order order){
        List<Order> orderInfo = orderDao.listAssess(order);
        if(null == orderInfo) {
            return AppResponse.bizError("查询订单评价商品信息列表异常");
        }
        return AppResponse.success("查询订单评价商品信息列表成功", orderInfo);
    }




}
