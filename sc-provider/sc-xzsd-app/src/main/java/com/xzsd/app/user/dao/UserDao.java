package com.xzsd.app.user.dao;

import com.xzsd.app.user.entity.User;

/**
 * @author Yuanxuan
 * @date 2020-04-16 上午 10:39
 */
public interface UserDao {

    /**
     * 司机信息查询
     * @return
     */
    User selectdriver(String userCode);

    /**
     * 客户信息查询
     * @return
     */
    User selecteCustomer(String userCode);

    /**
     * 店长信息查询
     * @param userCode
     * @return
     */
    User selectStore(String userCode);

    /**
     * 用户密码修改
     * @param user
     * @return
     */
    int updateUserPassword(User user);

    /**
     * 用户注册
     * @param user
     * @return
     */
    int saveCustomer(User user);

    /**
     * 用户店铺邀请码修改
     * @param user
     * @return
     */
    int updateCustomerInvite(User user);

    /**
     * 用户账号数量统计
     * @param user
     * @return
     */
    int countUserAcct(User user);

    /**
     * 校验店铺邀请码是否存在
     * @param user
     * @return
     */
    int countInviteCode(User user);

    /**
     * 用户密码查询
     * @param user
     * @return
     */
    String selectPassword(User user);

    /**
     * 获取登录人角色编码
     * @return
     */
    int getRole(String userCode);

}
