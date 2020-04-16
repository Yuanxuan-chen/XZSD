package com.xzsd.app.user.service;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.user.dao.UserDao;
import com.xzsd.app.user.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author Yuanxuan
 * @date 2020-04-16 上午 10:51
 */
@Service
public class UserService {

    @Resource
    private UserDao userDao;


    /**
     * 司机信息查询
     * @param user
     * @return
     */
    public AppResponse selectdriver(User user) {
        User userInfo = userDao.selectdriver(user);
        if (null == userInfo) {
            return AppResponse.bizError("司机信息查询异常");
        }
        return AppResponse.success("司机信息查询成功", userInfo);
    }

    /**
     * 客户信息查询
     * @param user
     * @return
     */
    public AppResponse selecteCustomer(User user) {
        User userInfo = userDao.selecteCustomer(user);
        if (null == userInfo) {
            return AppResponse.bizError("客户信息查询异常");
        }
        return AppResponse.success("客户信息查询成功", userInfo);
    }

    /**
     * 店长信息查询
     * @param user
     * @return
     */
    public AppResponse selectStore(User user) {
        User userInfo = userDao.selectStore(user);
        if (null == userInfo) {
            return AppResponse.bizError("店长信息查询异常");
        }
        return AppResponse.success("店长信息查询成功", userInfo);
    }


    /**
     * 用户密码修改
     * @param user
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateUserPassword(User user) {
        int userInfo = userDao.updateUserPassword(user);
        if (0 == userInfo) {
            return AppResponse.bizError("用户密码修改异常");
        }
        return AppResponse.success("用户密码修改成功");
    }

    /**
     * 用户注册
     * @param user
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse saveCustomer(User user) {
        int userInfo = userDao.saveCustomer(user);
        if (0 == userInfo) {
            return AppResponse.bizError("用户注册异常");
        }
        return AppResponse.success("用户注册成功");
    }

    /**
     * 用户店铺邀请码修改
     * @param user
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateCustomerInvite(User user) {
        int userInfo = userDao.updateCustomerInvite(user);
        if (0 == userInfo) {
            return AppResponse.bizError("用户店铺邀请码修改异常");
        }
        return AppResponse.success("用户店铺邀请码修改成功");
    }

}
