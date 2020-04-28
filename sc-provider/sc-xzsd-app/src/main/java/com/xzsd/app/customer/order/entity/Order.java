package com.xzsd.app.customer.order.entity;

import java.util.List;

/**
 * @author Yuanxuan
 * @date 2020-04-21 上午 09:27
 */
public class Order {
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
     * 商品详情编号
     */
    private String orderDetailCode;

    /**
     * 商品详情编号集合
     */
    private List<String> orderDetailCodeList;

    /**
     *订单编码
     */
    private String orderCode;

    /**
     *商品价格
     */
    private String sellPrice;

    /**
     *商品价格集合
     */
    private List<String> sellPriceList;

    /**
     * 商品总数量
     * @return
     */
    private int allNumber;

    /**
     * 商品总价格
     * @return
     */
    private String allPrice;
    /**
     *商品编号
     */
    private String goodCode;

    /**
     *商品编号集合
     */
    private List<String> goodCodeList;

    /**
     *客户选择的商品数量
     */
    private int totalNumber;

    /**
     *客户选择的商品数量集合
     */
    private List<Integer> totalNumberList;

    /**
     *门店编号
     */
    private String storeCode;

    /**
     *取货门店名称
     */
    private String storeName;

    /**
     *用户名字
     */
    private String buyerName;

    /**
     *用户联系电话
     */
    private String buyerTel;

    /**
     *门店邀请码
     */
    private String inviteCode;

    /**
     *订单状态
     */
    private int orderState;

    /**
     *订单状态集合
     */
    private List<Integer> orderStateList;

    /**
     *省市区+取货门店地址
     */
    private String address;

    /**
     *商品名字
     */
    private String goodName;

    /**
     *商品介绍
     */
    private String goodIntroduce;

    /**
     *图片链接
     */
    private String pictureUrl;

    /**
     * 商品集合
     */
    private List<Order> goodList;

    /**
     * 购物车编号集合
     */
    private List<String> cartCodeList;


    public List<Integer> getOrderStateList() {
        return orderStateList;
    }

    public void setOrderStateList(List<Integer> orderStateList) {
        this.orderStateList = orderStateList;
    }

    public List<String> getCartCodeList() {
        return cartCodeList;
    }

    public void setCartCodeList(List<String> cartCodeList) {
        this.cartCodeList = cartCodeList;
    }

    public int getAllNumber() {
        return allNumber;
    }

    public void setAllNumber(int allNumber) {
        this.allNumber = allNumber;
    }

    public String getAllPrice() {
        return allPrice;
    }

    public void setAllPrice(String allPrice) {
        this.allPrice = allPrice;
    }

    public List<Order> getGoodList() {
        return goodList;
    }

    public void setGoodList(List<Order> goodList) {
        this.goodList = goodList;
    }

    public List<String> getOrderDetailCodeList() {
        return orderDetailCodeList;
    }

    public void setOrderDetailCodeList(List<String> orderDetailCodeList) {
        this.orderDetailCodeList = orderDetailCodeList;
    }

    public List<String> getSellPriceList() {
        return sellPriceList;
    }

    public void setSellPriceList(List<String> sellPriceList) {
        this.sellPriceList = sellPriceList;
    }

    public List<String> getGoodCodeList() {
        return goodCodeList;
    }

    public void setGoodCodeList(List<String> goodCodeList) {
        this.goodCodeList = goodCodeList;
    }

    public List<Integer> getTotalNumberList() {
        return totalNumberList;
    }

    public void setTotalNumberList(List<Integer> totalNumberList) {
        this.totalNumberList = totalNumberList;
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

    public String getOrderDetailCode() {
        return orderDetailCode;
    }

    public void setOrderDetailCode(String orderDetailCode) {
        this.orderDetailCode = orderDetailCode;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(String sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getGoodCode() {
        return goodCode;
    }

    public void setGoodCode(String goodCode) {
        this.goodCode = goodCode;
    }

    public int getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(int totalNumber) {
        this.totalNumber = totalNumber;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerTel() {
        return buyerTel;
    }

    public void setBuyerTel(String buyerTel) {
        this.buyerTel = buyerTel;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public int getOrderState() {
        return orderState;
    }

    public void setOrderState(int orderState) {
        this.orderState = orderState;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGoodIntroduce() {
        return goodIntroduce;
    }

    public void setGoodIntroduce(String goodIntroduce) {
        this.goodIntroduce = goodIntroduce;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
}
