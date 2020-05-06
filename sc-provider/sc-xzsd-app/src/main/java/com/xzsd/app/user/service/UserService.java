package com.xzsd.app.user.service;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.neusoft.util.UUIDUtils;
import com.xzsd.app.user.dao.UserDao;
import com.xzsd.app.user.entity.User;
import com.xzsd.app.util.PasswordUtils;
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
     * @author Yuanxuan
     * @date 2020-04-16
     * @return
     */
    public AppResponse selectDriver() {
        //获取当前登陆人编号
        String userCode = SecurityUtils.getCurrentUserId();
        User userInfo = userDao.selectDriver(userCode);
        if (null == userInfo) {
            return AppResponse.bizError("司机信息查询异常");
        }
        return AppResponse.success("司机信息查询成功", userInfo);
    }

    /**
     * 客户信息查询
     * @author Yuanxuan
     * @date 2020-04-16
     * @return
     */
    public AppResponse selecteCustomer() {
        //获取当前登陆人编号
        String userCode = SecurityUtils.getCurrentUserId();
        User userInfo = userDao.selecteCustomer(userCode);
        if (null == userInfo) {
            return AppResponse.bizError("客户信息查询异常");
        }
        return AppResponse.success("客户信息查询成功", userInfo);
    }

    /**
     * 店长信息查询
     * @author Yuanxuan
     * @date 2020-04-16
     * @return
     */
    public AppResponse selectStore() {
        //获取当前登陆人编号
        String userCode = SecurityUtils.getCurrentUserId();
        User userInfo = userDao.selectStore(userCode);
        if (null == userInfo) {
            return AppResponse.bizError("店长信息查询异常");
        }
        return AppResponse.success("店长信息查询成功", userInfo);
    }


    /**
     * 用户密码修改
     * @author Yuanxuan
     * @date 2020-04-16
     * @param user
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateUserPassword(User user) {
        //获取当前登陆人编号
        String userCode = SecurityUtils.getCurrentUserId();
        user.setUserCode(userCode);
        //获取数据库里的密码
        String nowPassword = userDao.selectPassword(user);
        //获取旧密码
        String oldPassword = user.getOldPassword();
        //比较数据库里的密码与旧密码是否一致
        if (!PasswordUtils.PasswordMarch(oldPassword, nowPassword)) {
            return AppResponse.bizError("旧密码不一致");
        }
        //获取当前修改者编号
        user.setUpdateUser(SecurityUtils.getCurrentUserId());
        //加密新密码
        String password = PasswordUtils.generatePassword(user.getNewPassword());
        //用户密码修改
        user.setUserPassword(password);
        int userInfo = userDao.updateUserPassword(user);
        if (0 == userInfo) {
            return AppResponse.bizError("用户密码修改异常");
        }
        return AppResponse.success("用户密码修改成功");
    }

    /**
     * 用户注册
     * @author Yuanxuan
     * @date 2020-04-16
     * @param user
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse saveCustomer(User user) {
        //判断账号是否存在
        int countUserAcct = userDao.countUserAcct(user);
        if(0 != countUserAcct) {
            return AppResponse.bizError("账号名已存在, 请重新输入!!");
        }
        //校验店铺邀请码是否存在
        if (null != user.getInviteCode()) {
            int countInviteCode = userDao.countInviteCode(user);
            if(0 == countInviteCode){
                return AppResponse.bizError("店铺邀请码不存在，请重新输入！");
            }
        }
        //生成随机用户编号
        user.setUserCode(UUIDUtils.getDateRandomID());
        user.setCreateUser(user.getUserCode());
        //密码加密
        String password = PasswordUtils.generatePassword(user.getUserPassword());
        user.setUserPassword(password);
        //用户注册
        int userInfo = userDao.saveCustomer(user);
        if (0 == userInfo) {
            return AppResponse.bizError("用户注册异常");
        }
        return AppResponse.success("用户注册成功");
    }

    /**
     * 用户店铺邀请码修改
     * @author Yuanxuan
     * @date 2020-04-16
     * @param user
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateCustomerInvite(User user) {
        //校验店铺邀请码是否存在
        int countInviteCode = userDao.countInviteCode(user);
        if(0 == countInviteCode){
            return AppResponse.bizError("店铺邀请码不存在，请重新输入！");
        }
        //获取当前登陆人编号
        String userCode = SecurityUtils.getCurrentUserId();
        user.setUserCode(userCode);
        user.setUpdateUser(userCode);
        //用户店铺邀请码修改
        int userInfo = userDao.updateCustomerInvite(user);
        if (0 == userInfo) {
            return AppResponse.bizError("用户店铺邀请码修改异常");
        }
        return AppResponse.success("用户店铺邀请码修改成功");
    }

    /**
     * 获取登录人角色编码
     * @date 2020-04-23
     * @author Yuanxuan-chen
     * @return
     */
    public AppResponse getRole() {
        //获取当前登录人编码
        String userCode = SecurityUtils.getCurrentUserId();
        //获取登录人角色编码
        int userInfo = userDao.getRole(userCode);
        if (0 == userInfo) {
            return AppResponse.bizError("用获取登录人角色编码异常");
        }
        return AppResponse.success("获取登录人角色编码成功", userInfo);
    }
}
