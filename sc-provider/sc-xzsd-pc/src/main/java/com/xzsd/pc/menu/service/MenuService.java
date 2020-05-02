package com.xzsd.pc.menu.service;

import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.neusoft.util.UUIDUtils;
import com.xzsd.pc.menu.dao.MenuDao;
import com.xzsd.pc.menu.entity.Menu;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuanxuan
 * @date 2020-04-14 下午 08:13
 */
@Service
public class MenuService {

    @Resource
    private MenuDao menuDao;


    /**
     * 菜单新增
     * @param menu
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse saveMenu(Menu menu) {
        //获取创建者编号
        String createUser = SecurityUtils.getCurrentUserId();
        menu.setCreateUser(createUser);
        //生成随机菜单编号
        menu.setMenuCode(UUIDUtils.getDateRandomID());
        //菜单新增
        int count = menuDao.saveMenu(menu);
        if (0 == count){
            return AppResponse.bizError("菜单新增失败");
        }
        return AppResponse.success("菜单新增成功");
    }

    /**
     * 菜单修改
     * @param menu
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateMenu(Menu menu) {
        //获取修改者编号
        String updateUser = SecurityUtils.getCurrentUserId();
        menu.setCreateUser(updateUser);
        //菜单修改
        int count = menuDao.updateMenu(menu);
        if (0 == count){
            return AppResponse.bizError("菜单修改失败");
        }
        return AppResponse.success("菜单修改成功");
    }

    /**
     * 菜单删除
     * @param menu
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteMenu(Menu menu) {
        //获取修改者编号
        String updateUser = SecurityUtils.getCurrentUserId();
        menu.setCreateUser(updateUser);
        //菜单删除
        int count = menuDao.deleteMenu(menu);
        if (0 == count){
            return AppResponse.bizError("菜单删除失败");
        }
        return AppResponse.success("菜单删除成功");
    }

    /**
     * 菜单详细信息查询
     * @param menu
     * @return
     */
    public AppResponse selectMenu(Menu menu) {
        Menu menuInfo = menuDao.selectMenu(menu);
        if (null == menuInfo){
            return AppResponse.bizError("菜单详细信息查询失败");
        }
        return AppResponse.success("菜单详细信息查询成功", menuInfo);
    }


    /**
     * 菜单列表查询
     * @param menu
     * @return
     */
    public AppResponse listMenu(Menu menu) {
        //获取当前登录人编码
        String userCode = SecurityUtils.getCurrentUserId();
        //获取登录人角色代码
        int role = menuDao.getUserRole(userCode);
        if(1 > role || 2 < role){
            return AppResponse.notFound("查询无结果");
        }else if(2 == role){
            //设置店长查询到的菜单: 订单管理, 商品管理
            List<String> menuList = new ArrayList<String>();
            menuList.add("订单管理");
            menuList.add("商品管理");
            menuList.add("客户管理");
            menu.setMenuNameList(menuList);
        }
        List<Menu> menuInfo = menuDao.listMenu(menu);
        if (null == menuInfo){
            return AppResponse.bizError("菜单分页查询失败");
        }
        return AppResponse.success("菜单分页查询成功", new PageInfo<Menu>(menuInfo));
    }

    /**
     * 侧边栏菜单列表查询
     * @param menu
     * @return
     */
    public AppResponse listMenuHome(Menu menu) {
        //获取当前登录人编码
        String userCode = SecurityUtils.getCurrentUserId();
        //获取登录人角色代码
        int role = menuDao.getUserRole(userCode);
        if(1 > role || 2 < role){
            return AppResponse.notFound("查询无结果");
        }else if(2 == role){
            //设置店长查询到的菜单: 订单管理, 商品管理
            List<String> menuList = new ArrayList<String>();
            menuList.add("订单管理");
            menuList.add("商品管理");
            menu.setMenuNameList(menuList);
        }
        List<Menu> menuInfo = menuDao.listMenuHome(menu);
        if (null == menuInfo){
            return AppResponse.bizError("菜单分页查询失败");
        }
        return AppResponse.success("菜单分页查询成功", new PageInfo<Menu>(menuInfo));
    }

}
