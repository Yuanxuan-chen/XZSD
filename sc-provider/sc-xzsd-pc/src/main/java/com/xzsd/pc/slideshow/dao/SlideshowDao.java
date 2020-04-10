package com.xzsd.pc.slideshow.dao;

import com.xzsd.pc.slideshow.entity.Slideshow;

import java.util.List;

/**
 * @author Yuanxuan
 * @date 2020-04-10 下午 08:10
 */
public interface SlideshowDao {

    /**
     * 轮播图新增
     * @param slideshow
     * @return
     */
    int saveSlideshow(Slideshow slideshow);

    /**
     * 轮播图删除
     * @param slideshow
     * @return
     */
    int deleteSlideshow(Slideshow slideshow);

    /**
     * 轮播图启用/禁用
     * @param slideshow
     * @return
     */
    int stateSlideshow(Slideshow slideshow);

    /**
     * 轮播图详细信息查询
     * @param slideshow
     * @return
     */
    Slideshow selectSlideshow(Slideshow slideshow);

    /**
     * 轮播图分页查询
     * @param slideshow
     * @return
     */
    List<Slideshow> listSlideshow(Slideshow slideshow);


    /**
     * 统计特定排序编号
     * @param slideshow
     * @return
     */
    int countSlideshowSort(Slideshow slideshow);

    /**
     * 统计特定商品编号
     * @param slideshow
     * @return
     */
    int countSlideshowGoodCode(Slideshow slideshow);

}
