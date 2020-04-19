package com.xzsd.pc.menu.dao;

import com.xzsd.pc.menu.entity.Menu;

import java.util.List;

/**
 * @author Yuanxuan
 * @date 2020-04-14 下午 05:52
 */
public interface MenuDao {

    /**
     * 菜单新增
     * @param menu
     * @return
     */
    int saveMenu(Menu menu);

    /**
     * 菜单修改
     * @param menu
     * @return
     */
    int updateMenu(Menu menu);

    /**
     * 菜单删除
     * @param menu
     * @return
     */
    int deleteMenu(Menu menu);

    /**
     * 菜单详细信息查询
     * @param menu
     * @return
     */
    Menu selectMenu(Menu menu);


    /**
     * 菜单列表查询
     * @param menu
     * @return
     */
    List<Menu> listMenu(Menu menu);


    /**
     * 首页菜单列表查询
     * @param menu
     * @return
     */
    List<Menu> listMenuHome(Menu menu);


    int getUserRole(String userCode);
}
