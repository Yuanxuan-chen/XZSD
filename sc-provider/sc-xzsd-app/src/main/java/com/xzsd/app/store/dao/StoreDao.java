package com.xzsd.app.store.dao;

import com.xzsd.app.store.entity.Store;

import java.util.List;

/**
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
     * 订单列表查询
     * @param store
     * @return
     */
    List<Store> listOrder(Store store);

    /**
     * 店长查询司机信息
     * @param store
     * @return
     */
    List<Store> listDriver(Store store);

    /**
     * 司机负责门店信息查询
     * @param store
     * @return
     */
    List<Store> listStore(Store store);

}
