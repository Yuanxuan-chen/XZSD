package com.xzsd.pc.goodType.dao;

import com.xzsd.pc.goodType.entity.GoodType;

import java.util.List;

/**
 * 商品分类
 * @author Yuanxuan
 * @date 2020-04-11 上午 07:37
 */
public interface GoodTypeDao {

    /**
     * 分类新增
     * @param goodType
     * @return
     */
    int saveGoodType(GoodType goodType);

    /**
     * 分类修改
     * @param goodType
     * @return
     */
    int updateGoodType(GoodType goodType);

    /**
     * 分类删除
     * @param goodType
     * @return
     */
    int deleteGoodType(GoodType goodType);

    /**
     * 分类详细信息查询
     * @param goodType
     * @return
     */
    GoodType selecteGoodType(GoodType goodType);

    /**
     * 分类分页查询
     * @param goodType
     * @return
     */
    List<GoodType> listGoodType(GoodType goodType);

    /**
     * 分类一二级菜单查询
     * @param goodType
     * @return
     */
    List<GoodType> selectLevelOne(GoodType goodType);

    /**
     * 商品分类选择下拉框
     * @param goodType
     * @return
     */
    List<GoodType> selectLevel(GoodType goodType);


    /**
     * 统计子分类数量
     * @param goodType
     * @return
     */
    int countParentCode(GoodType goodType);

    /**
     * 统计商品的一级分类
     * @param goodType
     * @return
     */
    int countLevelOne(GoodType goodType);

    /**
     * 统计商品的二级分类
     * @param goodType
     * @return
     */
    int countLevelTwo(GoodType goodType);

}
