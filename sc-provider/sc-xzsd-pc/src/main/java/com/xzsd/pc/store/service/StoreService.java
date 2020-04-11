package com.xzsd.pc.store.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.core.restful.AppResponse;
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
        Store storeInfo = storeDao.selectStore(store);
        if(null == storeInfo) {
            return AppResponse.bizError("门店信息分页查询失败");
        }
        return AppResponse.success("门店信息分页查询成功", storeInfo);
    }

    /**
     * 门店信息新增
     * @param store
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse saveStore(Store store) {
        int storeInfo = storeDao.saveStore(store);
        if(0 == storeInfo) {
            return AppResponse.bizError("门店信息分页查询失败");
        }
        return AppResponse.success("门店信息分页查询成功");
    }

    /**
     * 门店信息修改
     * @param store
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateStore(Store store) {
        int storeInfo = storeDao.updateStore(store);
        if(0 == storeInfo) {
            return AppResponse.bizError("门店信息分页查询失败");
        }
        return AppResponse.success("门店信息分页查询成功");
    }

    /**
     * 门店信息删除
     * @param store
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteStore(Store store) {
        int storeInfo = storeDao.deleteStore(store);
        if(0 == storeInfo) {
            return AppResponse.bizError("门店信息分页查询失败");
        }
        return AppResponse.success("门店信息分页查询成功");
    }

}
