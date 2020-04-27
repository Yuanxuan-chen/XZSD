package com.xzsd.pc.user.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.neusoft.util.UUIDUtils;
import com.xzsd.pc.user.dao.UserDao;
import com.xzsd.pc.user.entity.User;
import com.xzsd.pc.util.PasswordUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Yuanxuan
 * @date 2020-04-14 上午 09:59
 */
@Service
public class UserService {

    @Resource
    private UserDao userDao;

    /**
     * 用户新增
     * @param user
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse saveUser(User user) {
        //校验用户账号是否存在
        int countUserAcct = userDao.countUserAcct(user);
        if(0 != countUserAcct){
            return AppResponse.bizError("用户账号已存在，请重新输入！");
        }
        //获取创建者
        String createUser = SecurityUtils.getCurrentUserId();
        user.setCreateUser(createUser);
        //密码加密
        String password = PasswordUtils.generatePassword(user.getUserPassword());
        //获取随机用户编码
        user.setUserCode(UUIDUtils.getUUID());
        //密码加密导入
        user.setUserPassword(password);
        //用户新增
        int count = userDao.saveUser(user);
        if(0 == count) {
            return AppResponse.bizError("用户新增失败");
        }
        return AppResponse.success("用户新增成功");
    }

    /**
     * 用户修改
     * @param user
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateUser(User user) {
        int countUserAcct = userDao.countUserAcct(user);
        if(0 != countUserAcct){
            return AppResponse.bizError("用户账号已存在，请重新输入！");
        }
        //获取修改的密码
        String updatePassword = user.getUserPassword();
        //密码加密
        String password = PasswordUtils.generatePassword(updatePassword);
        user.setUserPassword(password);
        //用户修改
        int count = userDao.updateUser(user);
        if(0 == count) {
            return AppResponse.bizError("用户修改失败");
        }
        return AppResponse.success("用户修改成功");
    }

    /**
     * 用户删除
     * @param user
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteUser(User user) {
        int count = userDao.deleteUser(user);
        if(0 == count) {
            return AppResponse.bizError("用户删除失败");
        }
        return AppResponse.success("用户删除成功");
    }

    /**
     * 用户详细信息查询
     * @param user
     * @return
     */
    public AppResponse selectUser(User user) {
        User userInfo = userDao.selectUser(user);
        if(null == userInfo) {
            return AppResponse.bizError("用户详细信息查询失败");
        }
        return AppResponse.success("用户详细信息查询成功", userInfo);
    }

    /**
     * 用户分页查询
     * @param user
     * @return
     */
    public AppResponse listUser(User user) {
        PageHelper.startPage(user.getPageNum(), user.getPageSize());
        List<User> userInfo = userDao.listUser(user);
        if(null == userInfo) {
            return AppResponse.bizError("用户分页查询失败");
        }
        return AppResponse.success("用户分页查询成功", new PageInfo<User>(userInfo));
    }

    /**
     * 顶部栏接口
     * @param user
     * @return
     */
    public AppResponse topColumn(User user) {
        //获取当前登陆人信息
        String loginUser = SecurityUtils.getCurrentUserId();
        user.setUserCode(loginUser);
        User userInfo = userDao.topColumn(user);
        if(null == userInfo) {
            return AppResponse.bizError("顶部栏查询异常");
        }
        return AppResponse.success("顶部栏查询成功", userInfo);
    }

}
