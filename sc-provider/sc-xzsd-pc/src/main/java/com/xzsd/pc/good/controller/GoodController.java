package com.xzsd.pc.good.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.good.entity.Good;
import com.xzsd.pc.good.service.GoodService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Yuanxuan
 * @date 2020-04-08 上午 08:02
 */

@RestController
@RequestMapping("/good")
public class GoodController {

    @Resource
    private GoodService goodService;

    /**
     * 商品新增接口
     * @param good
     * @return
     */
    @PostMapping("createGood")
    public AppResponse createGood(Good good) {
        try{
            return goodService.createGood(good);
        }catch (Exception e){
            throw  e;
        }
    }

    /**
     * 商品删除接口
     * @param goodCode
     * @return
     */
    @PostMapping("deleteGood")
    public AppResponse deleteGood(String goodCode) {
        try{
            return goodService.deleteGood(goodCode);
        }catch (Exception e){
            throw  e;
        }
    }
}
