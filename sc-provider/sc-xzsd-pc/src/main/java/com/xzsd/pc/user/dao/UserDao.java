package com.xzsd.pc.user.dao;

import com.xzsd.pc.user.entity.User;

import java.util.List;

/**
 * @author Yuanxuan
 * @date 2020-04-14 上午 09:51
 */
public interface UserDao {

    /**
     * 用户新增
     * @param user
     * @return
     */
    int saveUser(User user);

    /**
     * 用户修改
     * @param user
     * @return
     */
    int updateCode(User user);

    /**
     * 用户删除
     * @param user
     * @return
     */
    int deleteUser(User user);

    /**
     * selectUser
     * @param user
     * @return
     */
    User selectUser(User user);

    /**
     * listUser
     * @param user
     * @return
     */
    List<User> listUser(User user);

    /**
     * 统计用户账户数量
     * @param user
     * @return
     */
    int countUserAcct(User user);
}
