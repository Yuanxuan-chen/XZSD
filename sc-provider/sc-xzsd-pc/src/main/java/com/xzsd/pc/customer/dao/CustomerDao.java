package com.xzsd.pc.customer.dao;

import com.xzsd.pc.customer.entity.Customer;

import java.util.List;

/**
 * @author Yuanxuan
 * @date 2020-04-11 下午 12:05
 */
public interface CustomerDao {

    /**
     * 客户详细信息查询
     * @param customer
     * @return
     */
    Customer selectCustomer(Customer customer);

    /**
     * 客户分页查询
     * @param customer
     * @return
     */
    List<Customer> listCustomer(Customer customer);

    /**
     * 获取当前登录人的角色编号
     * @author Yuanxuan-chen
     * @date 2020-05-04
     * @param updateUser
     * @return
     */
    int getUserRole(String updateUser);
}
