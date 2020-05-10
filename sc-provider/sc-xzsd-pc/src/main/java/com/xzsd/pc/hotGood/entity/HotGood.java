package com.xzsd.pc.hotGood.entity;

import java.util.List;

/**
 * 热门商品
 * @author Yuanxuan
 * @date 2020-04-11 下午 05:23
 */
public class HotGood {
    /**
     * 第几页
     */
    private int pageNum;

    /**
     * 页面大小
     */
    private int pageSize;

    /**
     * 删除标记, 0未删, 1已删
     */
    private int isDelete;

    /**
     * 创建者
     */
    private String createUser;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 修改者
     */
    private String updateUser;

    /**
     * 修改时间
     */
    private String updateTime;

    /**
     * 版本号
     */
    private int version;

    /**
     * 热门编码
     */
    private String hotGoodCode;

    /**
     * 热门编码集合
     */
    private List<String> hotGoodCodeList;

    /**
     * 热门商品编码
     */
    private String goodCode;

    /**
     *热门商品名称
     */
    private String goodName;

    /**
     *热门排序
     */
    private String hotSort;

<<<<<<< Updated upstream
    /**
     *商品价格
     */
    private String sellPrice;

    /**
     *商品介绍
     */
    private String goodIntroduce;

    /**
     * 热门商品展示数量
     */
    private int showNumber;

    public int getShowNumber() {
        return showNumber;
    }

    public void setShowNumber(int showNumber) {
        this.showNumber = showNumber;
    }

    public String getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(String sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getGoodIntroduce() {
        return goodIntroduce;
    }

    public void setGoodIntroduce(String goodIntroduce) {
        this.goodIntroduce = goodIntroduce;
    }

=======
>>>>>>> Stashed changes
    public List<String> getHotGoodCodeList() {
        return hotGoodCodeList;
    }

    public void setHotGoodCodeList(List<String> hotGoodCodeList) {
        this.hotGoodCodeList = hotGoodCodeList;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getHotGoodCode() {
        return hotGoodCode;
    }

    public void setHotGoodCode(String hotGoodCode) {
        this.hotGoodCode = hotGoodCode;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getGoodCode() {
        return goodCode;
    }

    public void setGoodCode(String goodCode) {
        this.goodCode = goodCode;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getHotSort() {
        return hotSort;
    }

    public void setHotSort(String hotSort) {
        this.hotSort = hotSort;
    }
}
