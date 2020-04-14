package com.xzsd.pc.menu.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.neusoft.util.UUIDUtils;
import com.xzsd.pc.menu.dao.MenuDao;
import com.xzsd.pc.menu.entity.Menu;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
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
        menu.setMenuCode(UUIDUtils.getUUID());
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
        PageHelper.startPage(1, 10);
        List<Menu> menuInfo = menuDao.listMenu(menu);
        if (null == menuInfo){
            return AppResponse.bizError("菜单分页查询失败");
        }
        return AppResponse.success("菜单分页查询成功", new PageInfo<Menu>(menuInfo));
    }


    /**
     * 首页菜单列表查询
     * @param menu
     * @return
     */
    public AppResponse listMenuHome(Menu menu) {
        List<Menu> menuInfo = menuDao.listMenuHome(menu);
        if (null == menuInfo){
            return AppResponse.bizError("菜单分页查询失败");
        }
        return AppResponse.success("菜单分页查询成功", menuInfo);
    }

}
