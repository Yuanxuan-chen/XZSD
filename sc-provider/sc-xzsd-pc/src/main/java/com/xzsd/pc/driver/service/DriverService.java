package com.xzsd.pc.driver.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.driver.dao.DriverDao;
import com.xzsd.pc.driver.entity.Driver;
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
        Driver driverInfo = driverDao.selectDriver(driver);
        if(null == driverInfo) {
            return AppResponse.bizError("司机详细信息失败");
        }
        return AppResponse.success("司机详细信息成功", driverInfo);
    }

    /**
     * 司机信息新增
     * @param driver
     * @return
     */
    public AppResponse saveDriver(Driver driver) {
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
        int driverInfo = driverDao.deleteDriver(driver);
        if(0 == driverInfo) {
            return AppResponse.bizError("司机信息删除失败");
        }
        return AppResponse.success("司机信息删除成功");
    }


}
