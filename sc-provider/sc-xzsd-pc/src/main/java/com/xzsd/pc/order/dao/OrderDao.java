package com.xzsd.pc.order.dao;

import com.xzsd.pc.order.entity.Order;

import java.util.List;

/**
 * 订单管理
 * @author Yuanxuan
 * @date 2020-04-11 下午 02:08
 */
public interface OrderDao {

    /**
     * 订单分页查询
     * @param order
     * @return
     */
    List<Order> listOrder(Order order);

    /**
     * 订单详细信息查询
     * @param order
     * @return
     */
    List<Order> selectOrder(Order order);

    /**
     * 订单物流状态
     * @param order
     * @return
     */
    int stateOrder(Order order);

    /**
     * 获取当前登录人的角色编号
     * @param updateUser
     * @return
     */
    int getUserRole(String updateUser);

}
