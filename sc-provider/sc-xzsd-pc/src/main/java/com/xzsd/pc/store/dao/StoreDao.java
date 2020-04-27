package com.xzsd.pc.store.dao;

import com.xzsd.pc.store.entity.Store;

import java.util.List;

/**
 * @author Yuanxuan
 * @date 2020-04-11 下午 09:48
 */
public interface StoreDao {

    /**
     * 门店信息分页查询
     * @param store
     * @return
     */
    List<Store> listStore(Store store);

    /**
     * 门店详细信息详情
     * @param store
     * @return
     */
    List<Store> selectStore(Store store);

    /**
     * 门店信息新增
     * @param store
     * @return
     */
    int saveStore(Store store);

    /**
     * 门店信息修改
     * @param store
     * @return
     */
    int updateStore(Store store);

    /**
     * 门店信息删除
     * @param store
     * @return
     */
    int deleteStore(Store store);


    /**
     * 省市区查询
     * @param store
     * @return
     */
    List<Store> listArea(Store store);


    /**
     * 统计邀请码的个数
     * @param store
     * @return
     */
    int countInviteCode(Store store);



    /**
     * 统计店长数量
     * @author Yuanxuan-chen
     * @date 2020-04-27
     * @param store
     * @return
     */
    int countShopKeeperCode(Store store);

}
