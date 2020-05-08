package com.xzsd.app.customer.home.dao;

import com.xzsd.app.customer.home.entity.Home;

import java.util.List;

/**
 * app首页
 * @author Yuanxuan
 * @date 2020-04-17 上午 10:38
 */
public interface HomeDao {

    /**
     * 轮播图商品查询
     * @return
     */
    List<Home> listSlideshow();

    /**
     * 热门商品信息查询
     * @return
     */
    List<Home> listHotGood(int showNumber);

    /**
     * 获取热门商品展示数量
     * @return
     */
    int getHotGoodNumber();
}
