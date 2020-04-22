package com.xzsd.app.customer.goodType.entity;

import java.util.List;

/**
 * @author Yuanxuan
 * @date 2020-04-17 下午 12:20
 */
public class GoodType {
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
    private String creatTime;

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
     * 商品分类编号
     */
    private String typeCode;

    /**
     *商品分类名称
     */
    private String typeName;

    /**
     *排序
     */
    private String sort;

    /**
     *图片链接
     */
    private String pictureUrl;

    /**
     *商品编号
     */
    private String goodCode;

    /**
     *商品名称
     */
    private String goodName;

    /**
     *商品价格
     */
    private String sellPrice;

    /**
     *商品介绍
     */
    private String goodIntroduce;

    /**
     *门店名称
     */
    private String storeName;

    /**
     *评价等级(0-1差评,2-4中评,5好评)
     */
    private int assessRank;

    private List<Integer> assessRankList;

    /**
     *评价者
     */
    private String assessUser;

    /**
     *评价内容
     */
    private String assessContent;

    /**
     *评价时间
     */
    private String assessTime;

    /**
     * 登录人编号
     */
    private String userCode;

    /**
     * 父级编号
     */
    private String parentCode;

    private List<GoodType> goodList;

    public List<GoodType> getGoodList() {
        return goodList;
    }

    public void setGoodList(List<GoodType> goodList) {
        this.goodList = goodList;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public List<Integer> getAssessRankList() {
        return assessRankList;
    }

    public void setAssessRankList(List<Integer> assessRankList) {
        this.assessRankList = assessRankList;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
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

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime;
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

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
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

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public int getAssessRank() {
        return assessRank;
    }

    public void setAssessRank(int assessRank) {
        this.assessRank = assessRank;
    }

    public String getAssessUser() {
        return assessUser;
    }

    public void setAssessUser(String assessUser) {
        this.assessUser = assessUser;
    }

    public String getAssessContent() {
        return assessContent;
    }

    public void setAssessContent(String assessContent) {
        this.assessContent = assessContent;
    }

    public String getAssessTime() {
        return assessTime;
    }

    public void setAssessTime(String assessTime) {
        this.assessTime = assessTime;
    }
}
