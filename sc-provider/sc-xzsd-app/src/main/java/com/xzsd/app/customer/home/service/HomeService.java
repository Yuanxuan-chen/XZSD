package com.xzsd.app.customer.home.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.xzsd.app.customer.home.dao.HomeDao;
import com.xzsd.app.customer.home.entity.Home;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Yuanxuan
 * @date 2020-04-17 上午 10:42
 */
@Service
public class HomeService {

    @Resource
    private HomeDao homeDao;

    /**
     * 轮播图商品查询
     * @param home
     * @return
     */
    public AppResponse listSlideshow(Home home){
//        PageHelper.startPage(home.getPageNum(), home.getPageSize());
        List<Home> homeInfo = homeDao.listSlideshow(home);
        if(null == homeInfo) {
            return AppResponse.bizError("轮播图商品查询异常");
        }
        return AppResponse.success("轮播图商品查询成功", new PageInfo<Home>(homeInfo));

    }

    /**
     * 热门商品信息查询
     * @param home
     * @return
     */
    public AppResponse listHotGood(Home home){
        //获取热门商品展示数量
        int count = homeDao.getHotGoodNumber();
//        热门商品信息查询
        PageHelper.startPage(1, count);
        List<Home> homeInfo = homeDao.listHotGood(home);
        if(null == homeInfo) {
            return AppResponse.bizError("轮播图商品查询异常");
        }
        return AppResponse.success("轮播图商品查询成功", new PageInfo<Home>(homeInfo));

    }

}
