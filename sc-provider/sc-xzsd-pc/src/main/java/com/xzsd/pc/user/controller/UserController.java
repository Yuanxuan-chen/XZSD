package com.xzsd.pc.user.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.user.entity.User;
import com.xzsd.pc.user.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Yuanxuan
 * @date 2020-04-14 上午 10:21
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 用户新增
     * @param user
     * @return
     */
    @PostMapping("saveUser")
    public AppResponse saveUser(User user) {
        try {
            return userService.saveUser(user);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 用户修改
     * @param user
     * @return
     */
    @PostMapping("updateCode")
    public AppResponse updateCode(User user) {
        try {
            return userService.updateCode(user);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 用户删除
     * @param user
     * @return
     */
    @PostMapping("deleteUser")
    public AppResponse deleteUser(User user) {
        try {
            return userService.deleteUser(user);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 用户详细信息查询
     * @param user
     * @return
     */
    @PostMapping("selectUser")
    public AppResponse selectUser(User user) {
        try {
            return userService.selectUser(user);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 用户分页查询
     * @param user
     * @return
     */
    @PostMapping("listUser")
    public AppResponse listUser(User user) {
        try {
            return userService.listUser(user);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 顶部栏接口
     * @param user
     * @return
     */
    @PostMapping("topColumn")
    public AppResponse topColumn(User user) {
        try {
            return userService.topColumn(user);
        }catch (Exception e) {
            throw e;
        }
    }

}
