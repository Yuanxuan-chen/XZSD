package com.xzsd.pc.order.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.order.entity.Order;
import com.xzsd.pc.order.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 订单管理
 * @author Yuanxuan
 * @date 2020-04-11 下午 02:23
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;


    /**
     *订单分页查询
     * @param order
     * @return
     */
    @PostMapping("listOrder")
    public AppResponse listOrder(Order order) {
        try {
            return orderService.listOrder(order);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     *订单详细信息查询
     * @param order
     * @return
     */
    @PostMapping("selectOrder")
    public AppResponse selectOrder(Order order) {
        try {
            return orderService.selectOrder(order);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     *订单物流状态
     * @param order
     * @return
     */
    @PostMapping("stateOrder")
    public AppResponse stateOrder(Order order) {
        try {
            return orderService.stateOrder(order);
        }catch (Exception e) {
            throw e;
        }
    }

}
