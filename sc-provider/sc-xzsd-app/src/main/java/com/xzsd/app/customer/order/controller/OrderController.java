package com.xzsd.app.customer.order.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.customer.order.entity.Order;
import com.xzsd.app.customer.order.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Yuanxuan
 * @date 2020-04-21 上午 10:13
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    /**
     * 创建订单表汇总
     * @param order
     * @return
     */
    @PostMapping("saveOrder")
    public AppResponse saveOrder(Order order){
        try{
            return orderService.saveOrder(order);
        }catch (Exception e){
            throw e;
        }
    }

    /**
     * 订单状态修改
     * @param order
     * @return
     */
    @PostMapping("stateOrder")
    public AppResponse stateOrder(Order order){
        try{
            return orderService.stateOrder(order);
        }catch (Exception e){
            throw e;
        }
    }

    /**
     * 订单详情查询
     * @param order
     * @return
     */
    @PostMapping("selectOrder")
    public AppResponse selectOrder(Order order){
        try{
            return orderService.selectOrder(order);
        }catch (Exception e){
            throw e;
        }
    }

    /**
     * 订单列表查询
     * @param order
     * @return
     */
    @PostMapping("listOrder")
    public AppResponse listOrder(Order order){
        try{
            return orderService.listOrder(order);
        }catch (Exception e){
            throw e;
        }
    }

    /**
     * 查询订单评价商品信息列表接口
     * @param order
     * @return
     */
    @PostMapping("listAssess")
    public AppResponse listAssess(Order order){
        try{
            return orderService.listAssess(order);
        }catch (Exception e){
            throw e;
        }
    }



}
