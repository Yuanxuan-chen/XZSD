package com.xzsd.pc.hotGood.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.neusoft.util.UUIDUtils;
import com.xzsd.pc.hotGood.dao.HotGoodDao;
import com.xzsd.pc.hotGood.entity.HotGood;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Yuanxuan
 * @date 2020-04-11 下午 05:36
 */
@Service
public class HotGoodService {

    @Resource
    private HotGoodDao hotGoodDao;

    /**
     * todo
     * 热门商品分页查询
     * @param hotGood
     * @return
     */
    public AppResponse listHotGood(HotGood hotGood) {
        PageHelper.startPage(hotGood.getPageNum(), hotGood.getPageSize());
        List<HotGood> hotGoodInfo = hotGoodDao.listHotGood(hotGood);
        if(null == hotGoodInfo){
            return AppResponse.bizError("热门商品分页查询失败");
        }
        return AppResponse.success("热门商品分页查询成功", new PageInfo<HotGood>(hotGoodInfo));
    }

    /**
     * 热门商品详细信息查询
     * @param hotGood
     * @return
     */
    public AppResponse selectHotGood(HotGood hotGood) {
        HotGood hotGoodInfo = hotGoodDao.selectHotGood(hotGood);
        if(null == hotGoodInfo){
            return AppResponse.bizError("热门商品详细信息查询失败");
        }
        return AppResponse.success("热门商品详细信息查询成功", hotGoodInfo);
    }


    /**
     * 热门商品新增
     * @param hotGood
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse saveHotGood(HotGood hotGood) {
        //判断商品是否已经添加进入热门商品列表
        if(0 != hotGoodDao.countGoodCode(hotGood)){
            return AppResponse.bizError("此商品已添加, 请重试");
        }
        //判断商品排序编号是否已经存在
        if(0 != hotGoodDao.countHotSort(hotGood)){
            return AppResponse.bizError("排序编号已存在, 请重试");
        }
        //获取创建者信息
        String createUser = SecurityUtils.getCurrentUserId();
        hotGood.setCreateUser(createUser);
        //创建热门商品编码
        hotGood.setHotGoodCode(UUIDUtils.getDateRandomID());
        //热门商品新增
        int hotGoodInfo = hotGoodDao.saveHotGood(hotGood);
        if(0 == hotGoodInfo){
            return AppResponse.bizError("热门商品新增失败");
        }
        return AppResponse.success("热门商品新增成功");
    }

    /**
     * 热门商品修改
     * @param hotGood
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateHotGood(HotGood hotGood) {
        //修改者编码
        String updateUser = SecurityUtils.getCurrentUserId();
        hotGood.setUpdateUser(updateUser);
        //热门商品修改
        int hotGoodInfo = hotGoodDao.updateHotGood(hotGood);
        if(0 == hotGoodInfo){
            return AppResponse.bizError("热门商品修改失败");
        }
        return AppResponse.success("热门商品修改成功");
    }

    /**
     * 热门商品删除
     * @param hotGood
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteHotGood(HotGood hotGood) {
        //修改者编码
        String updateUser = SecurityUtils.getCurrentUserId();
        hotGood.setUpdateUser(updateUser);
        //热门商品删除
        int hotGoodInfo = hotGoodDao.deleteHotGood(hotGood);
        if(0 == hotGoodInfo){
            return AppResponse.bizError("热门商品删除失败");
        }
        return AppResponse.success("热门商品删除成功");
    }


    /**
     * 热门商品展示数量查询
     * @param hotGood
     * @return
     */
    public AppResponse getHotGood(HotGood hotGood) {
        HotGood hotGoodInfo = hotGoodDao.getHotGood(hotGood);
        if(null == hotGoodInfo){
            return AppResponse.bizError("热门商品展示数量查询失败");
        }
        return AppResponse.success("热门商品展示数量查询成功", hotGoodInfo);
    }

    /**
     * 热门商品展示数量设置
     * @param hotGood
     * @return
     */
    public AppResponse setHotGood(HotGood hotGood) {
        int hotGoodInfo = hotGoodDao.setHotGood(hotGood);
        if(0 == hotGoodInfo){
            return AppResponse.bizError("热门商品展示数量设置失败");
        }
        return AppResponse.success("热门商品展示数量设置成功");
    }



}
