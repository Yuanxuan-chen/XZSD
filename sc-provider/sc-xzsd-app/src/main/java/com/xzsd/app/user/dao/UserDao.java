package com.xzsd.app.user.dao;

import com.xzsd.app.user.entity.User;

/**
 * @author Yuanxuan
 * @date 2020-04-16 上午 10:39
 */
public interface UserDao {

    /**
     * 司机信息查询
     * @param user
     * @return
     */
    User selectdriver(User user);

    /**
     * 客户信息查询
     * @param user
     * @return
     */
    User selecteCustomer(User user);

    /**
     * 店长信息查询
     * @param user
     * @return
     */
    User selectStore(User user);

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
     * 用户密码查询
     * @param user
     * @return
     */
    String selectPassword(User user);

    /**
     * 用户密码查询
     * @param user
     * @return
     */
    int getRole(User user);

}
