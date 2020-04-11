package com.xzsd.pc.customer.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.customer.dao.CustomerDao;
import com.xzsd.pc.customer.entity.Customer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Yuanxuan
 * @date 2020-04-11 下午 12:14
 */
@Service
public class CustomerService {

    @Resource
    private CustomerDao customerDao;


    /**
     * 客户详细信息查询
     * @param customer
     * @return
     */
    public AppResponse selectCustomer(Customer customer) {
        Customer customerInfo = customerDao.selectCustomer(customer);
        if (null == customerInfo) {
            return AppResponse.bizError("客户详细信息查询失败");
        }
        return AppResponse.success("客户详细信息查询成功", customerInfo);
    }


    /**
     * 客户分页查询
     * @param customer
     * @return
     */
    public AppResponse listCustomer(Customer customer) {
        PageHelper.startPage(customer.getPageNum(), customer.getPageSize());
        List<Customer> customerInfo = customerDao.listCustomer(customer);
        if (null == customerInfo) {
            return AppResponse.bizError("客户详细信息查询失败");
        }
        return AppResponse.success("客户详细信息查询成功", new PageInfo<Customer>(customerInfo));
    }
}
