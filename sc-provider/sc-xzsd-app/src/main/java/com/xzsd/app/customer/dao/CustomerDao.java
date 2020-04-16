package com.xzsd.app.customer.dao;

import com.xzsd.app.customer.entity.Customer;

/**
 * @author Yuanxuan
 * @date 2020-04-15 上午 10:45
 */
public interface CustomerDao {

    /**
     * 用户注册
     * @param customer
     * @return
     */
    int saveCustomer(Customer customer);

    /**
     * 统计用户账号数量
     * @param customer
     * @return
     */
    int countCustomerAcct(Customer customer);

    /**
     * 用户密码修改
     * @param customer
     * @return
     */
    int updateUserPassword(Customer customer);

    /**
     * 获取数据据库用户的密码
     * @param customer
     * @return
     */
    String sellectPassword(Customer customer);


}
