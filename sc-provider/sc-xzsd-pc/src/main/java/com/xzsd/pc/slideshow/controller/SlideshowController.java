package com.xzsd.pc.slideshow.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.slideshow.entity.Slideshow;
import com.xzsd.pc.slideshow.service.SlideshowService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @author Yuanxuan
 * @date 2020-04-10 下午 08:45
 */
@RestController
@RequestMapping("/slideshow")
public class SlideshowController {

    @Resource
    private SlideshowService slideshowService;


    /**
     * 轮播图新增
     * @param slideshow
     * @return
     */
    @PostMapping("saveSlideshow")
    public AppResponse saveSlideshow(Slideshow slideshow) {
        try {
            return slideshowService.saveSlideshow(slideshow);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 轮播图删除
     * @param slideshow
     * @return
     */
    @PostMapping("deleteSlideshow")
    public AppResponse deleteSlideshow(Slideshow slideshow) {
        try {
            return slideshowService.deleteSlideshow(slideshow);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 轮播图启用/禁用
     * @param slideshow
     * @return
     */
    @PostMapping("stateSlideshow")
    public AppResponse stateSlideshow(Slideshow slideshow) {
        try {
            return slideshowService.stateSlideshow(slideshow);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 轮播图详细信息查询
     * @param slideshow
     * @return
     */
    @PostMapping("selectSlideshow")
    public AppResponse selectSlideshow(Slideshow slideshow) {
        try {
            return slideshowService.selectSlideshow(slideshow);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 轮播图分页查询
     * @param slideshow
     * @return
     */
    @PostMapping("listSlideshow")
    public AppResponse listSlideshow(Slideshow slideshow) {
        try {
            return slideshowService.listSlideshow(slideshow);
        }catch (Exception e) {
            throw e;
        }
    }

}
