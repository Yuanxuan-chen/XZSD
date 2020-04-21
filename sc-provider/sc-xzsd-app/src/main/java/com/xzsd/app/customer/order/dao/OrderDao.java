package com.xzsd.app.customer.order.dao;

import com.xzsd.app.customer.order.entity.Order;

import java.util.List;

/**
 * @author Yuanxuan
 * @date 2020-04-21 上午 09:25
 */
public interface OrderDao {

    /**
     * 创建订单详情表
     * @param order
     * @return
     */
    int saveOrderDetail(List<Order> order);

    /**
     * 获取用户信息
     * @param order
     * @return
     */
    Order getUserInfo(Order order);

    /**
     * 创建订单表汇总
     * @param order
     * @return
     */
    int saveOrder(Order order);

    /**
     * 订单状态修改
     * @param order
     * @return
     */
    int stateOrder(Order order);

    /**
     * 订单详情查询
     * @param order
     * @return
     */
    List<Order> selectOrder(Order order);

    /**
     * 订单列表查询
     * @param order
     * @return
     */
    List<Order> listOrder(Order order);

    /**
     * 查询订单评价商品信息列表接口
     * @param order
     * @return
     */
    List<Order> listtAssess(Order order);

}
