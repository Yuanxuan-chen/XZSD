package com.xzsd.app.store.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.store.entity.Store;
import com.xzsd.app.store.service.StoreService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Yuanxuan
 * @date 2020-04-21 上午 10:13
 */
@RestController
@RequestMapping("/store")
public class StoreController {

    @Resource
    private StoreService storeService;


    /**
     * 订单状态修改
     * @param store
     * @return
     */
    @PostMapping("stateOrder")
    public AppResponse stateOrder(Store store){
        try{
            return storeService.stateOrder(store);
        }catch (Exception e){
            throw e;
        }
    }

    /**
     * 订单详情查询
     * @param store
     * @return
     */
    @PostMapping("selectOrder")
    public AppResponse selectOrder(Store store){
        try{
            return storeService.selectOrder(store);
        }catch (Exception e){
            throw e;
        }
    }

    /**
     * 订单列表查询
     * @param store
     * @return
     */
    @PostMapping("listOrder")
    public AppResponse listOrder(Store store){
        try{
            return storeService.listOrder(store);
        }catch (Exception e){
            throw e;
        }
    }

    /**
     * 门店店长查询司机信息

     * @return
     */
    @PostMapping("listDriver")
    public AppResponse listDriver(){
        try{
            return storeService.listDriver();
        }catch (Exception e){
            throw e;
        }
    }

    /**
     * 司机负责门店信息查询
     * @return
     */
    @PostMapping("listStore")
    public AppResponse listStore(){
        try{
            return storeService.listStore();
        }catch (Exception e){
            throw e;
        }
    }




}
