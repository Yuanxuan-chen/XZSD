package com.xzsd.app.customer.home.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.customer.home.entity.Home;
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
     * @param home
     * @return
     */
    @PostMapping("listSlideshow")
    public AppResponse listSlideshow(Home home) {
        try {
            return homeService.listSlideshow(home);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 热门商品信息查询
     * @param home
     * @return
     */
    @PostMapping("listHotGood")
    public AppResponse listHotGood(Home home) {
        try {
            return homeService.listHotGood(home);
        }catch (Exception e) {
            throw e;
        }
    }
}
