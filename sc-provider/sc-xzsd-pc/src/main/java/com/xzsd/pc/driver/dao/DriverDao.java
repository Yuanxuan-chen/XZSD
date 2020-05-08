package com.xzsd.pc.driver.dao;

import com.xzsd.pc.driver.entity.Driver;

import java.util.List;

/**
 * 司机信息管理
 * @author Yuanxuan
 * @date 2020-04-11 下午 10:20
 */
public interface DriverDao {
    /**
     * 司机信息分页查询
     * @param driver
     * @return
     */
    List<Driver> listDriver(Driver driver);

    /**
     * 司机详细信息
     * @param driver
     * @return
     */
    List<Driver> selectDriver(Driver driver);

    /**
     * 司机信息新增
     * @param driver
     * @return
     */
    int saveDriver(Driver driver);

    /**
     * 司机信息修改
     * @param driver
     * @return
     */
    int updateDriver(Driver driver);

    /**
     * 司机信息删除
     * @param driver
     * @return
     */
    int deleteDriver(Driver driver);

    /**
     * 统计司机账户
     * @param driver
     * @return
     */
    int countDriverAcct(Driver driver);

    /**
     * 获取当前登录人的角色编号
     * @author Yuanxuan-chen
     * @date 2020-05-04
     * @param updateUser
     * @return
     */
    int getUserRole(String updateUser);
}
