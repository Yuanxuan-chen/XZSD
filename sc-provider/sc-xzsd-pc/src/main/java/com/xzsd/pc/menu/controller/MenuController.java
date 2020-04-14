package com.xzsd.pc.menu.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.menu.entity.Menu;
import com.xzsd.pc.menu.service.MenuService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Yuanxuan
 * @date 2020-04-14 下午 08:37
 */
@RestController
@RequestMapping("/menu")
public class MenuController {

    @Resource
    private MenuService menuService;

    /**
     * 菜单新增
     * @param menu
     * @return
     */
    @PostMapping("saveMenu")
    private AppResponse saveMenu(Menu menu) {
        try {
            return menuService.saveMenu(menu);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 菜单修改
     * @param menu
     * @return
     */
    @PostMapping("updateMenu")
    private AppResponse updateMenu(Menu menu) {
        try {
            return menuService.updateMenu(menu);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 菜单删除
     * @param menu
     * @return
     */
    @PostMapping("deleteMenu")
    private AppResponse deleteMenu(Menu menu) {
        try {
            return menuService.deleteMenu(menu);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 菜单详细信息查询
     * @param menu
     * @return
     */
    @PostMapping("selectMenu")
    private AppResponse selectMenu(Menu menu) {
        try {
            return menuService.selectMenu(menu);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 菜单列表查询
     * @param menu
     * @return
     */
    @PostMapping("listMenu")
    private AppResponse listMenu(Menu menu) {
        try {
            return menuService.listMenu(menu);
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * 首页菜单列表查询
     * @param menu
     * @return
     */
    @PostMapping("listMenuHome")
    private AppResponse listMenuHome(Menu menu) {
        try {
            return menuService.listMenuHome(menu);
        }catch (Exception e) {
            throw e;
        }
    }
}
