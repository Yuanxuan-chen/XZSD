package com.xzsd.pc.slideshow.entity;

import java.util.List;

/**
 * @author Yuanxuan
 * @date 2020-04-10 下午 07:52
 */
public class Slideshow {

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
     * 轮播图片编号
     */
    private String slideshowCode;

    /**
     * 轮播图片编号集合
     */
    private List<String> slideshowCodeList;
    /**
     * 轮播图片路径
     */
    private String slideshowRoute;

    /**
     *排序
     */
    private String slideshowSort;

    /**
     *有效期起
     */
    private String dateStart;

    /**
     *有效期止
     */
    private String dateStop;

    /**
     *商品编码
     */
    private String slideshowGoodCode;

    /**
     *轮播图片状态, 0启用, 1禁用
     */
    private String slideshowState;

    public List<String> getSlideshowCodeList() {
        return slideshowCodeList;
    }

    public void setSlideshowCodeList(List<String> slideshowCodeList) {
        this.slideshowCodeList = slideshowCodeList;
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

    public String getSlideshowCode() {
        return slideshowCode;
    }

    public void setSlideshowCode(String slideshowCode) {
        this.slideshowCode = slideshowCode;
    }

    public String getSlideshowRoute() {
        return slideshowRoute;
    }

    public void setSlideshowRoute(String slideshowRoute) {
        this.slideshowRoute = slideshowRoute;
    }

    public String getSlideshowSort() {
        return slideshowSort;
    }

    public void setSlideshowSort(String slideshowSort) {
        this.slideshowSort = slideshowSort;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateStop() {
        return dateStop;
    }

    public void setDateStop(String dateStop) {
        this.dateStop = dateStop;
    }

    public String getSlideshowGoodCode() {
        return slideshowGoodCode;
    }

    public void setSlideshowGoodCode(String slideshowGoodCode) {
        this.slideshowGoodCode = slideshowGoodCode;
    }

    public String getSlideshowState() {
        return slideshowState;
    }

    public void setSlideshowState(String slideshowState) {
        this.slideshowState = slideshowState;
    }
}
