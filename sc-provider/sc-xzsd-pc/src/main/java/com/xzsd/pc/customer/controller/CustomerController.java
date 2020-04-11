package com.xzsd.pc.customer.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.customer.entity.Customer;
import com.xzsd.pc.customer.service.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Yuanxuan
 * @date 2020-04-11 下午 12:30
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Resource
    private CustomerService customerService;


    /**
     * 客户详细信息查询
     * @param customer
     * @return
     */
    @PostMapping("selectCustomer")
    public AppResponse selectCustomer(Customer customer) {
        try {
            return customerService.selectCustomer(customer);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 客户分页查询
     * @param customer
     * @return
     */
    @PostMapping("listCustomer")
    public AppResponse listCustomer(Customer customer) {
        try {
            return customerService.listCustomer(customer);
        }catch (Exception e) {
            throw e;
        }
    }

}
