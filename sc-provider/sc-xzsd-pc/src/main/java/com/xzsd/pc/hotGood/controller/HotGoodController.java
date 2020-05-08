package com.xzsd.pc.hotGood.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.hotGood.entity.HotGood;
import com.xzsd.pc.hotGood.service.HotGoodService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 热门商品
 * @author Yuanxuan
 * @date 2020-04-11 下午 05:50
 */
@RestController
@RequestMapping("/hotGood")
public class HotGoodController {

    @Resource
    private HotGoodService hotGoodService;


    /**
     * 热门商品分页查询
     * @param hotGood
     * @return
     */
    @PostMapping("listHotGood")
    public AppResponse listHotGood(HotGood hotGood){
        try {
            return hotGoodService.listHotGood(hotGood);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 热门商品详细信息查询
     * @param hotGood
     * @return
     */
    @PostMapping("selectHotGood")
    public AppResponse selectHotGood(HotGood hotGood){
        try {
            return hotGoodService.selectHotGood(hotGood);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 热门商品新增
     * @param hotGood
     * @return
     */
    @PostMapping("saveHotGood")
    public AppResponse saveHotGood(HotGood hotGood){
        try {
            return hotGoodService.saveHotGood(hotGood);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 热门商品修改
     * @param hotGood
     * @return
     */
    @PostMapping("updateHotGood")
    public AppResponse updateHotGood(HotGood hotGood){
        try {
            return hotGoodService.updateHotGood(hotGood);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 热门商品删除
     * @param hotGood
     * @return
     */
    @PostMapping("deleteHotGood")
    public AppResponse deleteHotGood(HotGood hotGood){
        try {
            return hotGoodService.deleteHotGood(hotGood);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 热门商品展示数量查询
     * @param hotGood
     * @return
     */
    @PostMapping("getHotGood")
    public AppResponse getHotGood(HotGood hotGood){
        try {
            return hotGoodService.getHotGood(hotGood);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 热门商品展示数量设置
     * @param hotGood
     * @return
     */
    @PostMapping("setHotGood")
    public AppResponse setHotGood(HotGood hotGood){
        try {
            return hotGoodService.setHotGood(hotGood);
        }catch (Exception e) {
            throw e;
        }
    }

}
