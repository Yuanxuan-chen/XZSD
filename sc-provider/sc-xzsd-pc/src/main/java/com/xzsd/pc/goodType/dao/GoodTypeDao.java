package com.xzsd.pc.goodType.dao;

import com.xzsd.pc.goodType.entity.GoodType;

import java.util.List;

/**
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
     * 分类一级菜单查询
     * @param goodType
     * @return
     */
    List<GoodType> selectLevelOne(GoodType goodType);

    /**
     * 分类二级菜单查询
     * @param goodType
     * @return
     */
    List<GoodType> selectLevel(GoodType goodType);

}
