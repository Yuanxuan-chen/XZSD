package com.xzsd.app.user.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.user.entity.User;
import com.xzsd.app.user.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 司机管理
 * @author Yuanxuan
 * @date 2020-04-16 上午 11:06
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    public UserService userService;

    /**
     * 司机信息查询
     * @return
     */
    @PostMapping("selectDriver")
    public AppResponse selectDriver() {
        try {
            return userService.selectDriver();
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 客户信息查询
     * @return
     */
    @PostMapping("selecteCustomer")
    public AppResponse selecteCustomer() {
        try {
            return userService.selecteCustomer();
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 店长信息查询
     * @return
     */
    @PostMapping("selectStore")
    public AppResponse selectStore() {
        try {
            return userService.selectStore();
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 用户密码修改
     * @param user
     * @return
     */
    @PostMapping("updateUserPassword")
    public AppResponse updateUserPassword(User user) {
        try {
            return userService.updateUserPassword(user);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 用户注册
     * @param user
     * @return
     */
    @PostMapping("saveCustomer")
    public AppResponse saveCustomer(User user) {
        try {
            return userService.saveCustomer(user);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 用户店铺邀请码修改
     * @param user
     * @return
     */
    @PostMapping("updateCustomerInvite")
    public AppResponse updateCustomerInvite(User user) {
        try {
            return userService.updateCustomerInvite(user);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 获取登录人角色编码
     * @return
     */
    @PostMapping("getRole")
    public AppResponse getRole() {
        try {
            return userService.getRole();
        }catch (Exception e) {
            throw e;
        }
    }
}
