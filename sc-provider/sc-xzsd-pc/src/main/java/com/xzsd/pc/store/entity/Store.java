package com.xzsd.pc.store.entity;

/**
 * @author Yuanxuan
 * @date 2020-04-11 下午 09:32
 */
public class Store {
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
     * 门店编号
     */
    private String store_code;

    /**
     * 门店账号
     */
    private String store_acct;

    /**
     *门店名称
     */
    private String store_name;

    /**
     *营业执照编码
     */
    private String licence_code;

    /**
     *邀请码
     */
    private String invite_code;


    /**
     * 省编码
     */
    private String provinceCode;

    /**
     * 省名称
     */
    private String provinceName;

    /**
     * 市编码
     */
    private String downtownCode;

    /**
     * 市名称
     */
    private String downtownName;

    /**
     * 区编码
     */
    private String areaCode;

    /**
     * 区名称
     */
    private String areaName;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 店长编号
     */
    private String shopkeeper_code;

    /**
     *店长名字
     */
    private String shopkeeper_name;

    /**
     *联系电话
     */
    private String tel;

    /**
     *司机编号
     */
    private String driver_code;


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

    public String getStore_code() {
        return store_code;
    }

    public void setStore_code(String store_code) {
        this.store_code = store_code;
    }

    public String getStore_acct() {
        return store_acct;
    }

    public void setStore_acct(String store_acct) {
        this.store_acct = store_acct;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public String getLicence_code() {
        return licence_code;
    }

    public void setLicence_code(String licence_code) {
        this.licence_code = licence_code;
    }

    public String getInvite_code() {
        return invite_code;
    }

    public void setInvite_code(String invite_code) {
        this.invite_code = invite_code;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getDowntownCode() {
        return downtownCode;
    }

    public void setDowntownCode(String downtownCode) {
        this.downtownCode = downtownCode;
    }

    public String getDowntownName() {
        return downtownName;
    }

    public void setDowntownName(String downtownName) {
        this.downtownName = downtownName;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getShopkeeper_code() {
        return shopkeeper_code;
    }

    public void setShopkeeper_code(String shopkeeper_code) {
        this.shopkeeper_code = shopkeeper_code;
    }

    public String getShopkeeper_name() {
        return shopkeeper_name;
    }

    public void setShopkeeper_name(String shopkeeper_name) {
        this.shopkeeper_name = shopkeeper_name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDriver_code() {
        return driver_code;
    }

    public void setDriver_code(String driver_code) {
        this.driver_code = driver_code;
    }
}
