package com.xzsd.pc.store.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
import com.neusoft.security.client.utils.SecurityUtils;
import com.neusoft.util.UUIDUtils;
import com.xzsd.pc.store.dao.StoreDao;
import com.xzsd.pc.store.entity.Store;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Yuanxuan
 * @date 2020-04-11 下午 09:54
 */
@Service
public class StoreService {

    @Resource
    private StoreDao storeDao;

    /**
     * 门店信息分页查询
     * @param store
     * @return
     */
    public AppResponse listStore(Store store) {
        PageHelper.startPage(store.getPageNum(), store.getPageSize());
        List<Store> storeInfo = storeDao.listStore(store);
        if(null == storeInfo) {
            return AppResponse.bizError("门店信息分页查询失败");
        }
        return AppResponse.success("门店信息分页查询成功", new PageInfo<Store>(storeInfo));
    }

    /**
     * 门店详细信息详情
     * @param store
     * @return
     */
    public AppResponse selectStore(Store store) {
        PageHelper.startPage(store.getPageNum(), store.getPageSize());
        List<Store> storeInfo = storeDao.selectStore(store);
        if(null == storeInfo) {
            return AppResponse.bizError("门店详细信息详情失败");
        }
        return AppResponse.success("门店详细信息详情成功", new PageInfo<Store>(storeInfo));
    }

    /**
     * 门店信息新增
     * @author Yuanxuan-chen
     * @date 2020-04-27
     * @param store
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse saveStore(Store store) {
        //判断门店店长账号是否存在
        if (0 == storeDao.countShopKeeperCode(store)){
            return AppResponse.bizError("店长编号不存在, 请重新输入");
        }
        //判断门店邀请码是否存在
        int countInviteCode = storeDao.countInviteCode(store);
        if(0 != countInviteCode  ){
            return AppResponse.bizError("门店邀请码已存在, 请重新输入");
        }
        //判断门店邀请码是否存在
        int countTel = storeDao.countTel(store);
        if(0 != countTel){
            return AppResponse.bizError("电话已存在, 请重新输入");
        }
        //判断门店邀请码是否存在
        int countLicenceCode = storeDao.countLicenceCode(store);
        if(0 != countLicenceCode){
            return AppResponse.bizError("营业执照已存在, 请重新输入");
        }
        //创建者编号
        String createUser = SecurityUtils.getCurrentUserId();
        store.setCreateUser(createUser);
        //生成随机门店编号
        store.setStoreCode(UUIDUtils.getDateRandomID());
        //门店信息新增
        int storeInfo = storeDao.saveStore(store);
        if(0 == storeInfo) {
            return AppResponse.bizError("门店信息新增失败");
        }
        return AppResponse.success("门店信息新增成功");
    }

    /**
     * 门店信息修改
     * @param store
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateStore(Store store) {
        //修改者编号
        String updateUser = SecurityUtils.getCurrentUserId();
        store.setUpdateUser(updateUser);
        //门店信息修改
        int storeInfo = storeDao.updateStore(store);
        if(0 == storeInfo) {
            return AppResponse.bizError("门店信息修改失败");
        }
        return AppResponse.success("门店信息修改成功");
    }

    /**
     * 门店信息删除
     * @param store
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteStore(Store store) {
        //修改者编号
        String updateUser = SecurityUtils.getCurrentUserId();
        store.setUpdateUser(updateUser);
        //门店信息删除
        int storeInfo = storeDao.deleteStore(store);
        if(0 == storeInfo) {
            return AppResponse.bizError("门店信息删除失败");
        }
        return AppResponse.success("门店信息删除成功");
    }


    /**
     * 省市区查询
     * @param store
     * @return
     */
    public AppResponse listArea(Store store) {
        PageHelper.startPage(store.getPageNum(), store.getPageSize());
        List<Store> storeInfo = storeDao.listArea(store);
        if(null == storeInfo) {
            return AppResponse.bizError("省市区查询失败");
        }
        return AppResponse.success("省市区查询成功", new PageInfo<Store>(storeInfo));
    }

}
