package com.xzsd.app.customer.home.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.customer.home.service.HomeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Yuanxuan
 * @date 2020-04-17 上午 10:55
 */
@RestController
@RequestMapping("/home")
public class HomeController {

    @Resource
    private HomeService homeService;

    /**
     * 轮播图商品查询
     * @return
     */
    @PostMapping("listSlideshow")
    public AppResponse listSlideshow() {
        try {
            return homeService.listSlideshow();
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 热门商品信息查询
     * @return
     */
    @PostMapping("listHotGood")
    public AppResponse listHotGood() {
        try {
            return homeService.listHotGood();
        }catch (Exception e) {
            throw e;
        }
    }
}
