package com.xzsd.pc.goodType.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.neusoft.util.UUIDUtils;
import com.xzsd.pc.goodType.dao.GoodTypeDao;
import com.xzsd.pc.goodType.entity.GoodType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Yuanxuan
 * @date 2020-04-11 上午 07:47
 */
@Service
public class GoodTypeService {

    @Resource
    private GoodTypeDao goodTypeDao;


    /**
     * 分类新增
     * @author Yuanxuan-chen
     * @date 2020-04-29
     * @param goodType
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse saveGoodType(GoodType goodType) {
        //随机生成分类编号
        goodType.setTypeCode(UUIDUtils.getDateRandomID());
        //获取创建者编号
        String createUser = SecurityUtils.getCurrentUserId();
        goodType.setCreateUser(createUser);
        //分类新增
        int count = goodTypeDao.saveGoodType(goodType);
        if(0 == count) {
            return AppResponse.bizError("分类新增异常");
        }
        return AppResponse.success("分类新增成功");
    }

    /**
     * 分类修改
     * @param goodType
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateGoodType(GoodType goodType) {
        //获取修改者编号
        String updateUser = SecurityUtils.getCurrentUserId();
        goodType.setCreateUser(updateUser);
        //分类修改
        int count = goodTypeDao.updateGoodType(goodType);
        if(0 == count) {
            return AppResponse.bizError("分类修改异常");
        }
        return AppResponse.success("分类修改成功");
    }

    /**
     * 分类删除
     * @author Yuanxuan-chen
     * @date 2020-04-29
     * @param goodType
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteGoodType(GoodType goodType) {
        //判断该分类是否含有子分类
        if(0 != goodTypeDao.countParentCode(goodType)){
            return AppResponse.bizError("该分类含有子分类,分类删除异常");
        }
        //判断该分类是否存在于商品的一级分类
        if(0 != goodTypeDao.countLevelOne(goodType)){
            return AppResponse.bizError("该分类存在商品的,分类删除异常");
        }
        //判断该分类是否存在于商品的二级分类
        if(0 != goodTypeDao.countLevelTwo(goodType)){
            return AppResponse.bizError("该分类存在商品,分类删除异常");
        }
        //获取修改者编号
        String updateUser = SecurityUtils.getCurrentUserId();
        goodType.setCreateUser(updateUser);
        //分类删除
        int count = goodTypeDao.deleteGoodType(goodType);
        if(0 == count) {
            return AppResponse.bizError("分类删除异常");
        }
        return AppResponse.success("分类删除成功");
    }

    /**
     * 分类详细信息查询
     * @param goodType
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse selecteGoodType(GoodType goodType) {
        GoodType goodTypeInfo = goodTypeDao.selecteGoodType(goodType);
        if(null == goodTypeInfo) {
            return AppResponse.bizError("分类详细信息查询异常");
        }
        return AppResponse.success("分类详细信息查询成功", goodTypeInfo);
    }

    /**
     * 分类分页查询
     * @param goodType
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse listGoodType(GoodType goodType) {
        PageHelper.startPage(goodType.getPageNum(), goodType.getPageSize());
        List<GoodType> goodTypeInfo = goodTypeDao.listGoodType(goodType);
        if(null == goodTypeInfo) {
            return AppResponse.bizError("分类分页查询异常");
        }
        return AppResponse.success("分类分页查询成功", new PageInfo<GoodType>(goodTypeInfo));
    }

    /**
     * 分类一二级菜单查询
     * @param goodType
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse selectLevelOne(GoodType goodType) {
//        PageHelper.startPage(goodType.getPageNum(), goodType.getPageSize());
        List<GoodType> goodTypeInfo = goodTypeDao.selectLevelOne(goodType);
        if(null == goodTypeInfo) {
            return AppResponse.bizError("分类分页查询异常");
        }
        return AppResponse.success("分类分页查询成功", goodTypeInfo);
    }

    /**
     * 商品分类选择下拉框
     * @param goodType
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse selectLevel(GoodType goodType) {
//        PageHelper.startPage(goodType.getPageNum(), goodType.getPageSize());
        List<GoodType> goodTypeInfo = goodTypeDao.selectLevel(goodType);
        if(null == goodTypeInfo) {
            return AppResponse.bizError("分类查询异常");
        }
        return AppResponse.success("分类查询成功", new PageInfo<GoodType>(goodTypeInfo));
    }

}
