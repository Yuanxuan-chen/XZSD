package com.xzsd.app.customer.service;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.neusoft.util.UUIDUtils;
import com.xzsd.app.customer.dao.CustomerDao;
import com.xzsd.app.customer.entity.Customer;
import com.xzsd.app.util.PasswordUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author Yuanxuan
 * @date 2020-04-15 上午 10:48
 */
@Service
public class CustomerService {

    @Resource
    private CustomerDao customerDao;

    /**
     * 用户注册
     * @param customer
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse saveCustomer(Customer customer) {
        //判断账号是否存在
        int countUserAcct = customerDao.countCustomerAcct(customer);
        if(0 != countUserAcct) {
            return AppResponse.bizError("账号名已存在, 请重新输入!!");
        }
        //获取当前创建者编号
        String createUser = SecurityUtils.getCurrentUserId();
        customer.setCreateUser(createUser);
        //生成随机用户编号
        customer.setCustomerCode(UUIDUtils.getUUID());
        //密码加密
        String password = PasswordUtils.generatePassword(customer.getCustomerPassword());
        customer.setCustomerPassword(password);
        //用户注册
        int count = customerDao.saveCustomer(customer);
        if(0 == count) {
            return AppResponse.bizError("失败");
        }
        return AppResponse.success("成功");
    }

    /**
     * 用户密码修改
     * @param customer
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateUserPassword(Customer customer) {
        //数据库获取原密码
        String nowPassword = customerDao.sellectPassword(customer);
        //获取修要修改的旧密码
        String oldPassword = customer.getOldPassword();
        //密码校验
        if(!PasswordUtils.PasswordMarch(oldPassword, nowPassword)) {
            return AppResponse.bizError("旧密码不一致");
        }
        //新密码加密
        String newPassword = PasswordUtils.generatePassword(customer.getNewPassword());
        //用户密码修改
        int count = customerDao.updateUserPassword(customer);
        if(0 == count){
            return AppResponse.bizError("修改异常");
        }
        return AppResponse.success("修改异常成功");









    }






}
