package com.xzsd.pc.customer.entity;

/**
 * @author Yuanxuan
 * @date 2020-04-11 上午 11:36
 */
public class Customer {

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
     * 用户编号'
     */
    private String customerCode;

    /**
     * 用户账号'
     */
    private String customerAcct;

    /**
     * 密码
     */
    private String customerPassword;

    /**
     * 姓名
     */
    private String customerName;

    /**
     * 用户头像链接
     */
    private String customerPictureUrl;

    /**
     * 性别, 0男, 1女'
     */
    private int sex;

    /**
     * 联系电话
     */
    private String tel;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 身份证
     */
    private String idcard;

    /**
     * 角色, 0管理员, 1店长, 2司机, 3客户
     */
    private int role;

    /**
     * 邀请码
     */
    private String inviteCode;

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

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerAcct() {
        return customerAcct;
    }

    public void setCustomerAcct(String customerAcct) {
        this.customerAcct = customerAcct;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPictureUrl() {
        return customerPictureUrl;
    }

    public void setCustomerPictureUrl(String customerPictureUrl) {
        this.customerPictureUrl = customerPictureUrl;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
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
}
