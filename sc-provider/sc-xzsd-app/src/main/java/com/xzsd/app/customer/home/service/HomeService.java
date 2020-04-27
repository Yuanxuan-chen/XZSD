package com.xzsd.app.customer.home.service;

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
     * @return
     */
    public AppResponse listSlideshow(){
        List<Home> homeInfo = homeDao.listSlideshow();
        if(null == homeInfo) {
            return AppResponse.bizError("轮播图商品查询异常");
        }
        return AppResponse.success("轮播图商品查询成功", homeInfo);

    }

    /**
     * 热门商品信息查询
     * @return
     */
    public AppResponse listHotGood(){
        //获取热门商品展示数量
        int showNumber = homeDao.getHotGoodNumber();
        List<Home> homeInfo = homeDao.listHotGood(showNumber);
        if(null == homeInfo) {
            return AppResponse.bizError("热门商品信息查询异常");
        }
        return AppResponse.success("热门商品信息查询成功", homeInfo);
    }
}
