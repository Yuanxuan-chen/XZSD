package com.xzsd.app.customer.shopCart.entity;

import java.util.List;

/**
 * @author Yuanxuan
 * @date 2020-04-20 上午 08:51
 */
public class ShopCart {
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
     * '购物车编号'
     */
    private String cartCode;


    /**
     * '购物车编号集合'
     */
    private List<String> cartCodeList;


    /**
     * '用户编号
     */
    private String userCode;

    /**
     *'商品编号'
     */
    private String goodCode;

    /**
     *'商品名字'
     */
    private String goodName;

    /**
     *'在售价格'
     */
    private String sellPrice;

    /**
     *'商品数量'
     */
    private int goodNumber;

    /**
     *'图片链接'
     */
    private String pictureUrl;


    public List<String> getCartCodeList() {
        return cartCodeList;
    }

    public void setCartCodeList(List<String> cartCodeList) {
        this.cartCodeList = cartCodeList;
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

    public String getCartCode() {
        return cartCode;
    }

    public void setCartCode(String cartCode) {
        this.cartCode = cartCode;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
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

    public int getGoodNumber() {
        return goodNumber;
    }

    public void setGoodNumber(int goodNumber) {
        this.goodNumber = goodNumber;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
}
