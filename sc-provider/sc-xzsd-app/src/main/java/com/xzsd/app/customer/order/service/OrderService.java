package com.xzsd.app.customer.order.service;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.customer.order.dao.OrderDao;
import com.xzsd.app.customer.order.entity.Order;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
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
     * @param order
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse saveOrder(Order order){



        int count = orderDao.saveOrder(order);
        if(0 == count) {
            return AppResponse.bizError("创建订单表异常");
        }
        return AppResponse.success("创建订单表成功");
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
            return AppResponse.bizError("订单状态修改异常");
        }
        return AppResponse.success("订单状态修改成功");
    }

    /**
     * 订单列表查询
     * @param order
     * @return
     */
    public AppResponse listOrder(Order order){
        List<Order> orderInfo = orderDao.listOrder(order);
        if(null == orderInfo) {
            return AppResponse.bizError("订单列表查询异常");
        }
        return AppResponse.success("订单列表查询成功");
    }


    /**
     * 查询订单评价商品信息列表
     * @param order
     * @return
     */
    public AppResponse listtAssess(Order order){
        List<Order> orderInfo = orderDao.listtAssess(order);
        if(null == orderInfo) {
            return AppResponse.bizError("查询订单评价商品信息列表异常");
        }
        return AppResponse.success("查询订单评价商品信息列表成功");
    }



}
