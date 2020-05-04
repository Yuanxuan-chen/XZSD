package com.xzsd.pc.good.entity;

import java.util.List;

/**
 * 商品实体类
 * @author Yuanxuan
 * @date 2020-04-08 上午 07:29
 */
public class Good {
    /**
     * 商品编号
     */
    private String goodCode;

    /**
     * 商品编号集合
     */
    private List<String> goodCodeList;

    /**
     * 商品名称
     */
    private String goodName;

    /**
     * 书号
     */
    private String isbn;

    /**
     * 一级分类编号
     */
    private String levelOneCode;

    /**
     * 一级分类名称
     */
    private String levelOneName;

    /**
     * 二级分类编号
     */
    private String levelTwoCode;

    /**
     * 二级分类名称
     */
    private String levelTwoName;

    /**
     * 广告词
     */
    private String ad;

    /**
     * 商品介绍
     */
    private String goodIntroduce;

    /**
     * 商家编码
     */
    private String businessCode;

    /**
     * 商家名称
     */
    private String businessName;

    /**
     * 库存
     */
    private String stock;

    /**
     * 成本价
     */
    private String costPrice;

    /**
     * 在售价
     */
    private String sellPrice;

    /**
     * 图片路径
     */
    private String pictureUrl;

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
    private int version ;

    /**
     * 版本号集合
     */
    private List<Integer> versionList ;

    /**
     * 上价时间
     */
    private String getGoodDate;

    /**
     * 商品状态
     */
    private int goodState;

    /**
     * 浏览量
     */
    private String browseVolume;

    /**
     * 销售量
     */
    private String sellVolume;

    /**
     * 作者
     */
    private String author;

    /**
     * 出版社
     */
    private String publish;

    /**
     * 第几页
     */
    private int pageNum;

    /**
     * 页面大小
     */
    private int pageSize;

    public List<Integer> getVersionList() {
        return versionList;
    }

    public void setVersionList(List<Integer> versionList) {
        this.versionList = versionList;
    }

    public List<String> getGoodCodeList() {
        return goodCodeList;
    }

    public void setGoodCodeList(List<String> goodCodeList) {
        this.goodCodeList = goodCodeList;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
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


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getLevelOneCode() {
        return levelOneCode;
    }

    public void setLevelOneCode(String levelOneCode) {
        this.levelOneCode = levelOneCode;
    }

    public String getLevelOneName() {
        return levelOneName;
    }

    public void setLevelOneName(String levelOneName) {
        this.levelOneName = levelOneName;
    }

    public String getLevelTwoCode() {
        return levelTwoCode;
    }

    public void setLevelTwoCode(String levelTwoCode) {
        this.levelTwoCode = levelTwoCode;
    }

    public String getLevelTwoName() {
        return levelTwoName;
    }

    public void setLevelTwoName(String levelTwoName) {
        this.levelTwoName = levelTwoName;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getGoodIntroduce() {
        return goodIntroduce;
    }

    public void setGoodIntroduce(String goodIntroduce) {
        this.goodIntroduce = goodIntroduce;
    }

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(String costPrice) {
        this.costPrice = costPrice;
    }

    public String getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(String sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
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

    public String getGetGoodDate() {
        return getGoodDate;
    }

    public void setGetGoodDate(String getGoodDate) {
        this.getGoodDate = getGoodDate;
    }

    public int getGoodState() {
        return goodState;
    }

    public void setGoodState(int goodState) {
        this.goodState = goodState;
    }

    public String getBrowseVolume() {
        return browseVolume;
    }

    public void setBrowseVolume(String browseVolume) {
        this.browseVolume = browseVolume;
    }

    public String getSellVolume() {
        return sellVolume;
    }

    public void setSellVolume(String sellVolume) {
        this.sellVolume = sellVolume;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }
}
