package com.xzsd.pc.goodType.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.goodType.entity.GoodType;
import com.xzsd.pc.goodType.service.GoodTypeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Yuanxuan
 * @date 2020-04-11 上午 07:59
 */
@RestController
@RequestMapping("/goodType")
public class GoodTypeController {

    @Resource
    private GoodTypeService goodTypeService;

    /**
     * 分类新增
     * @param goodType
     * @return
     */
    @RequestMapping("saveGoodType")
    public AppResponse saveGoodType(GoodType goodType) {
        try {
            return goodTypeService.saveGoodType(goodType);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 分类修改
     * @param goodType
     * @return
     */
    @RequestMapping("updateGoodType")
    public AppResponse updateGoodType(GoodType goodType) {
        try {
            return goodTypeService.updateGoodType(goodType);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 分类删除
     * @param goodType
     * @return
     */
    @RequestMapping("deleteGoodType")
    public AppResponse deleteGoodType(GoodType goodType) {
        try {
            return goodTypeService.deleteGoodType(goodType);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 分类详细信息查询
     * @param goodType
     * @return
     */
    @RequestMapping("selecteGoodType")
    public AppResponse selecteGoodType(GoodType goodType) {
        try {
            return goodTypeService.selecteGoodType(goodType);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 分类分页查询
     * @param goodType
     * @return
     */
    @RequestMapping("listGoodType")
    public AppResponse listGoodType(GoodType goodType) {
        try {
            return goodTypeService.listGoodType(goodType);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 分类一级菜单查询
     * @param goodType
     * @return
     */
    @RequestMapping("selectLevelOne")
    public AppResponse selectLevelOne(GoodType goodType) {
        try {
            return goodTypeService.selectLevelOne(goodType);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 分类二级菜单查询
     * @param goodType
     * @return
     */
    @RequestMapping("selectLevelTwo")
    public AppResponse selectLevelTwo(GoodType goodType) {
        try {
            return goodTypeService.selectLevelTwo(goodType);
        }catch (Exception e) {
            throw e;
        }
    }


}
