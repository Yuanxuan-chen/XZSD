package com.xzsd.pc.slideshow.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.neusoft.util.UUIDUtils;
import com.xzsd.pc.slideshow.dao.SlideshowDao;
import com.xzsd.pc.slideshow.entity.Slideshow;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * todo
 * @author Yuanxuan
 * @date 2020-04-10 下午 08:26
 */
@Service
public class SlideshowService {

    @Resource
    private SlideshowDao slideshowDao;

    /**
     * 轮播图新增
     * @param slideshow
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse saveSlideshow(Slideshow slideshow) {
        //获取创建人编码
        String createUser = SecurityUtils.getCurrentUserId();
        slideshow.setCreateUser(createUser);
        //判断排序编号是否存在
        int countSlideshowSort = slideshowDao.countSlideshowSort(slideshow);
        if (0 != countSlideshowSort) {
            return AppResponse.bizError("排序编号存在, 请重新输入");
        }
        //判断商品是否存在
        int countSlideshowGoodCode = slideshowDao.countSlideshowGoodCode(slideshow);
        if (0 != countSlideshowGoodCode) {
            return AppResponse.bizError("排序商品已存在轮播图列表, 请重新输入");
        }
        //生成轮播图编码
        slideshow.setSlideshowCode(UUIDUtils.getDateRandomID());
        //轮播图新增
        int count = slideshowDao.saveSlideshow(slideshow);
        if (0 == count) {
            return AppResponse.bizError("轮播图已存在");
        }
        return AppResponse.success("轮播图新增成功");
    }

    /**
     * 轮播图删除
     * @param slideshow
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteSlideshow(Slideshow slideshow) {
        //获取修改人的编码
        String updateUser = SecurityUtils.getCurrentUserId();
        slideshow.setUpdateUser(updateUser);
        //轮播图删除
        int count = slideshowDao.deleteSlideshow(slideshow);
        if (0 == count) {
            return AppResponse.bizError("轮播图删除异常");
        }
        return AppResponse.success("轮播图删除成功");
    }


    /**
     * 轮播图状态更改
     * @param slideshow
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse stateSlideshow(Slideshow slideshow) {
        //获取修改人的编码
        String updateUser = SecurityUtils.getCurrentUserId();
        slideshow.setUpdateUser(updateUser);
        //轮播图状态更改
        int count = slideshowDao.stateSlideshow(slideshow);
        if (0 == count) {
            return AppResponse.bizError("轮播图状态更改异常");
        }
        return AppResponse.success("轮播图状态更改成功");
    }


    /**
     * 轮播图详细信息查询
     * @param slideshow
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse selectSlideshow(Slideshow slideshow) {
        Slideshow slideshowInfo= slideshowDao.selectSlideshow(slideshow);
        if (null == slideshowInfo) {
            return AppResponse.bizError("轮播图详细信息查询异常");
        }
        return AppResponse.success("轮播图详细信息查询成功", slideshowInfo);
    }

    /**
     * 轮播图分页查询
     * @param slideshow
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse listSlideshow(Slideshow slideshow) {
        PageHelper.startPage(slideshow.getPageNum(), slideshow.getPageSize());
        List<Slideshow> slideshowInfo= slideshowDao.listSlideshow(slideshow);
        if (null == slideshowInfo) {
            return AppResponse.bizError("轮播图分页查询异常");
        }
        return AppResponse.success("轮播图分页查询成功", new PageInfo<Slideshow>(slideshowInfo));
    }

}
