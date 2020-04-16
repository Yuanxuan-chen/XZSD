package com.xzsd.app.customer.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.customer.entity.Customer;
import com.xzsd.app.customer.service.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Yuanxuan
 * @date 2020-04-15 下午 03:01
 */

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Resource
    private CustomerService customerService;

    /**
     * 用户注册
     * @param customer
     * @return
     */
    @PostMapping("saveCustomer")
    public AppResponse saveCustomer(Customer customer) {
        try {
            return customerService.saveCustomer(customer);
        }catch (Exception e) {
            throw e;
        }
    }


    /**
     * 用户密码修改
     * @param customer
     * @return
     */
    @PostMapping("updateUserPassword")
    public AppResponse updateUserPassword(Customer customer) {
        try {
            return customerService.updateUserPassword(customer);
        }catch (Exception e) {
            throw e;
        }
    }
}
