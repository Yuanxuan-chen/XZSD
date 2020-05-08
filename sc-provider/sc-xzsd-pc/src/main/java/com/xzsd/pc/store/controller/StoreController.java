package com.xzsd.pc.store.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.store.entity.Store;
import com.xzsd.pc.store.service.StoreService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 门店信息管理
 * @author Yuanxuan
 * @date 2020-04-11 下午 10:03
 */

@RestController
@RequestMapping("/store")
public class StoreController {

    @Resource
    private StoreService storeService;

    /**
     * 门店信息分页查询
     * @param store
     * @return
     */
    @PostMapping("listStore")
    public AppResponse listStore(Store store) {
        try {
            return storeService.listStore(store);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 门店详细信息详情
     * @param store
     * @return
     */
    @PostMapping("selectStore")
    public AppResponse selectStore(Store store) {
        try {
            return storeService.selectStore(store);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 门店信息新增
     * @param store
     * @return
     */
    @PostMapping("saveStore")
    public AppResponse saveStore(Store store) {
        try {
            return storeService.saveStore(store);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 门店信息修改
     * @param store
     * @return
     */
    @PostMapping("updateStore")
    public AppResponse updateStore(Store store) {
        try {
            return storeService.updateStore(store);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 门店信息删除
     * @param store
     * @return
     */
    @PostMapping("deleteStore")
    public AppResponse deleteStore(Store store) {
        try {
            return storeService.deleteStore(store);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 省市区查询
     * @param store
     * @return
     */
    @PostMapping("listArea")
    public AppResponse listArea(Store store) {
        try {
            return storeService.listArea(store);
        }catch (Exception e) {
            throw e;
        }
    }


}
