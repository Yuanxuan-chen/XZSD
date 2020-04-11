package com.xzsd.pc.hotGood.dao;

import com.xzsd.pc.hotGood.entity.HotGood;

import java.util.List;

/**
 * @author Yuanxuan
 * @date 2020-04-11 下午 05:28
 */
public interface HotGoodDao {

    /**
     * 热门商品分页查询
     * @param hotGood
     * @return
     */
    List<HotGood> listHotGood(HotGood hotGood);


    /**
     * 热门商品详细信息查询
     * @param hotGood
     * @return
     */
    HotGood selectHotGood(HotGood hotGood);


    /**
     * 热门商品新增
     * @param hotGood
     * @return
     */
    int saveHotGood(HotGood hotGood);

    /**
     * 热门商品修改
     * @param hotGood
     * @return
     */
    int updateHotGood(HotGood hotGood);

    /**
     * 热门商品删除
     * @param hotGood
     * @return
     */
    int deleteHotGood(HotGood hotGood);

}
