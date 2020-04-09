package com.xzsd.pc.good.dao;

import com.xzsd.pc.good.entity.Good;

import java.util.List;

/**
 * 商品DAO
 * @author Yuanxuan
 * @date 2020-04-08 上午 07:41
 */
public interface GoodDao {

    /**
     * 获取商品版本号
     * @param goodCode
     * @return
     */
    int goodVersion(String goodCode);

    /**
     * 统计同名商品个数
     * @param good
     * @return
     */
    int countGoodName(Good good);

    /**
     * 创建商品
     * @param good
     * @return
     */
    int saveGood(Good good);

    /**
     * 修改商品信息
     * @param good
     * @return
     */
    int updateGood(Good good);

    /**
     * 删除商品
     * @param good
     * @return
     */
    int deleteGood(Good good);


    /**
     * 商品上架/下架
     * @param good
     * @return
     */
    int stateGood(Good good);

    /**
     * 商品详细信息查询
     * @param goodCode
     * @return
     */
    Good selectGood(String goodCode);

    /**
     * 商品分页查询
     * @param good
     * @return
     */
    List<Good> listGood(Good good);
}
