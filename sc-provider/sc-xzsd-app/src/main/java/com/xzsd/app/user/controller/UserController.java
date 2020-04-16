package com.xzsd.app.user.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.user.entity.User;
import com.xzsd.app.user.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
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
     * @param user
     * @return
     */
    @PostMapping("selectdriver")
    public AppResponse selectdriver(User user) {
        try {
            return userService.selectdriver(user);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 客户信息查询
     * @param user
     * @return
     */
    @PostMapping("selecteCustomer")
    public AppResponse selecteCustomer(User user) {
        try {
            return userService.selecteCustomer(user);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 店长信息查询
     * @param user
     * @return
     */
    @PostMapping("selectStore")
    public AppResponse selectStore(User user) {
        try {
            return userService.selectStore(user);
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
}
