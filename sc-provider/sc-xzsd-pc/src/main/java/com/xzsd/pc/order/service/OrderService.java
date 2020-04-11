package com.xzsd.pc.order.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.pc.order.dao.OrderDao;
import com.xzsd.pc.order.entity.Order;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Yuanxuan
 * @date 2020-04-11 下午 02:13
 */
@Service
public class OrderService {

    @Resource
    private OrderDao orderDao;


    /**
     * 订单分页查询
     * @param order
     * @return
     */
    public AppResponse listOrder(Order order) {
        PageHelper.startPage(order.getPageNum(), order.getPageSize());
        List<Order> orderInfo = orderDao.listOrder(order);
        if(null == orderInfo) {
            return AppResponse.bizError("失败");
        }
        return AppResponse.success("成功", new PageInfo<Order>(orderInfo));
    }

    /**
     * 订单详细信息查询
     * @param order
     * @return
     */
    public AppResponse selectOrder(Order order) {
        Order orderInfo = orderDao.selectOrder(order);
        if(null == orderInfo) {
            return AppResponse.bizError("失败");
        }
        return AppResponse.success("成功", orderInfo);
    }

    /**
     * 订单物流状态修改
     * @param order
     * @return
     */
    public AppResponse stateOrder(Order order) {
        //获取修改者的编号
        String updateUser = SecurityUtils.getCurrentUserId();
        order.setUpdateUser(updateUser);
        //订单物流状态修改
        int count = orderDao.stateOrder(order);
        if(0 == count) {
            return AppResponse.bizError("失败");
        }
        return AppResponse.success("成功");
    }

}
