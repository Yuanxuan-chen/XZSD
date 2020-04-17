package com.xzsd.app.customer.home.dao;

import com.xzsd.app.customer.home.entity.Home;

import java.util.List;

/**
 * @author Yuanxuan
 * @date 2020-04-17 上午 10:38
 */
public interface HomeDao {

    /**
     * 轮播图商品查询
     * @param home
     * @return
     */
    List<Home> listSlideshow(Home home);

    /**
     * 热门商品信息查询
     * @param home
     * @return
     */
    List<Home> listHotGood(Home home);
}
