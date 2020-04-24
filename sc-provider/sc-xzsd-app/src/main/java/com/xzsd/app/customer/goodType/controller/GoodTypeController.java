package com.xzsd.app.customer.goodType.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.customer.goodType.entity.GoodType;
import com.xzsd.app.customer.goodType.servoce.GoodTypeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Yuanxuan
 * @date 2020-04-17 下午 02:40
 */
@RestController
@RequestMapping("/goodType")
public class GoodTypeController {

    @Resource
    private GoodTypeService goodTypeService;

    /**
     * 商品分类查询
     * @param
     * @return
     */
    @PostMapping("levelOneList")
    public AppResponse levelOneList(GoodType goodType) {
        try {
            return goodTypeService.levelOneList(goodType);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 商品分类二级查询
     * @param goodType
     * @return
     */
    @PostMapping("levelTwoList")
    public AppResponse levelTwoList(GoodType goodType) {
        try {
            return goodTypeService.levelTwoList(goodType);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 商品信息查询
     * @param goodType
     * @return
     */
    @PostMapping("selectGood")
    public AppResponse selectGood(GoodType goodType) {
        try {
            return goodTypeService.selectGood(goodType);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 商品评价分页查询
     * @param goodType
     * @return
     */
    @PostMapping("listAssess")
    public AppResponse listAssess(GoodType goodType) {
        try {
            return goodTypeService.listAssess(goodType);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 商品评价
     * @param goodType
     * @return
     */
    @PostMapping("saveAssess")
    public AppResponse saveAssess(GoodType goodType) {
        try {
            return goodTypeService.saveAssess(goodType);
        }catch (Exception e) {
            throw e;
        }
    }

}
