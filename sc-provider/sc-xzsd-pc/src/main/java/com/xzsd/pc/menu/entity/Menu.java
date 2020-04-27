package com.xzsd.pc.menu.entity;

import java.util.List;

/**
 * @author Yuanxuan
 * @date 2020-04-14 下午 05:42
 */
public class Menu {
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
     * '菜单编号'
     */
    private String menuCode;

    /**
     *'菜单名称'
     */
    private String menuName;

    /**
     * '
     */
    private List<String> menuNameList;


    /**
     *'菜单路由'
     */
    private String route;

    /**
     *'备注'
     */
    private String comment;

    /**
     *'父级编号'
     */
    private String parentode;


    public List<String> getMenuNameList() {
        return menuNameList;
    }

    public void setMenuNameList(List<String> menuNameList) {
        this.menuNameList = menuNameList;
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

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }



    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getParentode() {
        return parentode;
    }

    public void setParentode(String parentode) {
        this.parentode = parentode;
    }
}
