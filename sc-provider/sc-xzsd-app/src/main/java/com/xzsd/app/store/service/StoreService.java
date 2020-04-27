package com.xzsd.app.store.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.xzsd.app.store.dao.StoreDao;
import com.xzsd.app.store.entity.Store;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Yuanxuan
 * @date 2020-04-21 上午 09:51
 */
@Service
public class StoreService {

    @Resource
    private StoreDao storeDao;



    /**
     * 订单状态修改
     * @param store
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse stateOrder(Store store){
        //获取修改者编号
        String updateUser = SecurityUtils.getCurrentUserId();
        store.setUpdateUser(updateUser);
        //订单状态修改
        int count = storeDao.stateOrder(store);
        if(0 == count) {
            return AppResponse.bizError("订单状态修改异常");
        }
        return AppResponse.success("订单状态修改成功");
    }


    /**
     * 订单详情查询
     * @param store
     * @return
     */
    public AppResponse selectOrder(Store store){
        List<Store> storeInfo = storeDao.selectOrder(store);
        if(null == storeInfo) {
            return AppResponse.bizError("订单详情查询异常");
        }
        return AppResponse.success("订单详情查询成功", storeInfo);
    }

    /**
     * 订单列表查询
     * @author Yuanxuan-chen
     * @date 2020-04-27
     * @param store
     * @return
     */
    public AppResponse listOrder(Store store){
        //获取当前登陆人信息
        store.setUpdateUser(SecurityUtils.getCurrentUserId());
        //订单列表查询
        PageHelper.startPage(store.getPageNum(), store.getPageSize() );
        List<Store> storeInfo = storeDao.listOrder(store);
        if(null == storeInfo) {
            return AppResponse.bizError("订单列表查询异常");
        }
        return AppResponse.success("订单列表查询成功", new PageInfo<Store>(storeInfo));
    }


    /**
     * 门店店长查询司机信息
     * @param store
     * @return
     */
    public AppResponse listDriver(Store store){
        //获取登陆人信息
        String updateUser = SecurityUtils.getCurrentUserId();
        store.setUpdateUser(updateUser);
        //门店店长查询司机信息
        PageHelper.startPage(store.getPageNum(), store.getPageSize() );
        List<Store> storeInfo = storeDao.listDriver(store);
        if(null == storeInfo) {
            return AppResponse.bizError("门店店长查询司机信息异常");
        }
        return AppResponse.success("门店店长查询司机信息成功", new PageInfo<Store>(storeInfo));
    }

    /**
     * 司机负责门店信息查询
     * @param store
     * @return
     */
    public AppResponse listStore(Store store){
        //获取登陆人信息
        String updateUser = SecurityUtils.getCurrentUserId();
        store.setUpdateUser(updateUser);
        //司机负责门店信息查询
        PageHelper.startPage(store.getPageNum(), store.getPageSize() );
        List<Store> storeInfo = storeDao.listStore(store);
        if(null == storeInfo) {
            return AppResponse.bizError("司机负责门店信息查询异常");
        }
        return AppResponse.success("司机负责门店信息查询成功", new PageInfo<Store>(storeInfo));
    }



}
