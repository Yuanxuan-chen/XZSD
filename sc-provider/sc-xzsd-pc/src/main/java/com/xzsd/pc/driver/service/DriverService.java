package com.xzsd.pc.driver.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.neusoft.util.UUIDUtils;
import com.xzsd.pc.driver.dao.DriverDao;
import com.xzsd.pc.driver.entity.Driver;
import com.xzsd.pc.util.PasswordUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Yuanxuan
 * @date 2020-04-11 下午 10:27
 */
@Service
public class DriverService {

    @Resource
    private DriverDao driverDao;

    /**
     * 司机信息分页查询
     * @param driver
     * @return
     */
    public AppResponse listDriver(Driver driver) {
        //获取当前登录人编号
        String updateUser = SecurityUtils.getCurrentUserId();
        driver.setUpdateUser(updateUser);
        //获取当前登录人的角色编号
        int role = driverDao.getUserRole(updateUser);
        driver.setRole(role);
        //司机信息分页查询
        PageHelper.startPage(driver.getPageNum(), driver.getPageSize());
        List<Driver> driverInfo = driverDao.listDriver(driver);
        if(null == driverInfo) {
            return AppResponse.bizError("司机信息分页查询失败");
        }
        return AppResponse.success("司机信息分页查询成功", new PageInfo<Driver>(driverInfo));
    }

    /**
     * 司机详细信息
     * @param driver
     * @return
     */
    public AppResponse selectDriver(Driver driver) {
        PageHelper.startPage(driver.getPageNum(), driver.getPageSize());
        List<Driver> driverInfo = driverDao.selectDriver(driver);
        if(null == driverInfo) {
            return AppResponse.bizError("司机详细信息失败");
        }
        return AppResponse.success("司机详细信息成功", new PageInfo<Driver>(driverInfo));
    }

    /**
     * 司机信息新增
     * @author Yuanxuan
     * @date 2020-04-12
     * @param driver
     * @return
     */
    public AppResponse saveDriver(Driver driver) {
        int countUserAcct = driverDao.countDriverAcct(driver);
        if(0 != countUserAcct){
            return AppResponse.bizError("司机账号已存在，请重新输入！");
        }

        //创建者信息
        String createUser = SecurityUtils.getCurrentUserId();
        driver.setCreateUser(createUser);
        //随机司机编码产生
        driver.setDriverCode(UUIDUtils.getDateRandomID());
        String password = PasswordUtils.generatePassword(driver.getDriverPassword());
        driver.setDriverPassword(password);
        //司机信息新增
        int driverInfo = driverDao.saveDriver(driver);
        if(0 == driverInfo) {
            return AppResponse.bizError("司机信息新增失败");
        }
        return AppResponse.success("司机信息新增成功");
    }

    /**
     * 司机信息修改
     * @param driver
     * @return
     */
    public AppResponse updateDriver(Driver driver) {
        int countUserAcct = driverDao.countDriverAcct(driver);
        if(0 != countUserAcct){
            return AppResponse.bizError("司机账号已存在，请重新输入！");
        }
        //修改者信息
        String updateUser = SecurityUtils.getCurrentUserId();
        driver.setUpdateUser(updateUser);
        //司机信息修改
        int driverInfo = driverDao.updateDriver(driver);
        if(0 == driverInfo) {
            return AppResponse.bizError("司机信息修改失败");
        }
        return AppResponse.success("司机信息修改成功");
    }

    /**
     * 司机信息删除
     * @param driver
     * @return
     */
    public AppResponse deleteDriver(Driver driver) {
        //修改者信息
        String updateUser = SecurityUtils.getCurrentUserId();
        driver.setUpdateUser(updateUser);
        //司机信息删除
        int driverInfo = driverDao.deleteDriver(driver);
        if(0 == driverInfo) {
            return AppResponse.bizError("司机信息删除失败");
        }
        return AppResponse.success("司机信息删除成功");
    }

}
