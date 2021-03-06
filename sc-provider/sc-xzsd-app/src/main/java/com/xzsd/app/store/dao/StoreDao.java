package com.xzsd.app.store.dao;

import com.xzsd.app.store.entity.Store;

import java.util.List;

/**
 * 门店管理
 * @author Yuanxuan
 * @date 2020-04-21 上午 09:25
 */
public interface StoreDao {

    /**
     * 订单状态修改
     * @param store
     * @return
     */
    int stateOrder(Store store);

    /**
     * 订单详情查询
     * @param store
     * @return
     */
    List<Store> selectOrder(Store store);

    /**
     * 获取登录的门店店长的门店编号
     * @author Yuanxuan-chen
     * @date 2020-04-28
     * @param userCode
     * @return
     */
    String getStoreCode(String userCode);

    /**
     * 订单列表查询
     * @param store
     * @return
     */
    List<Store> listOrder(Store store);

    /**
     * 店长查询司机信息
     * @return
     */
    List<Store> listDriver(String userCode);

    /**
     * 司机负责门店信息查询
     * @return
     */
    List<Store> listStore(String userCode);

}
