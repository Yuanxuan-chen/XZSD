package com.xzsd.pc.driver.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.driver.entity.Driver;
import com.xzsd.pc.driver.service.DriverService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 司机信息管理
 * @author Yuanxuan
 * @date 2020-04-11 下午 10:37
 */
@RestController
@RequestMapping("/driver")
public class DriverController {

    @Resource
    private DriverService driverService;

    /**
     * 司机信息分页查询
     * @param driver
     * @return
     */
    @PostMapping("listDriver")
    public AppResponse listDriver(Driver driver) {
        try {
            return driverService.listDriver(driver);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 司机详细信息
     * @param driver
     * @return
     */
    @PostMapping("selectDriver")
    public AppResponse selectDriver(Driver driver) {
        try {
            return driverService.selectDriver(driver);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 司机信息新增
     * @param driver
     * @return
     */
    @PostMapping("saveDriver")
    public AppResponse saveDriver(Driver driver) {
        try {
            return driverService.saveDriver(driver);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 司机信息修改
     * @param driver
     * @return
     */
    @PostMapping("updateDriver")
    public AppResponse updateDriver(Driver driver) {
        try {
            return driverService.updateDriver(driver);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 司机信息删除
     * @param driver
     * @return
     */
    @PostMapping("deleteDriver")
    public AppResponse deleteDriver(Driver driver) {
        try {
            return driverService.deleteDriver(driver);
        }catch (Exception e) {
            throw e;
        }
    }
}
