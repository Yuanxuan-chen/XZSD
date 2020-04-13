package com.xzsd.pc.tencentCos.service;

import com.neusoft.core.restful.AppResponse;
import com.neusoft.util.UUIDUtils;
import com.xzsd.pc.tencentCos.util.TencentCosUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

import static org.apache.rocketmq.common.UtilAll.deleteFile;

/**
 * @author Yuanxuan
 * @date 2020-04-13 上午 11:40
 */
@Service
public class TencentCosService {

    public AppResponse upload(MultipartFile multipartFile) throws Exception {
        //获取文件的名称
        String fileName = multipartFile.getOriginalFilename();
        //判断有无后缀
        if (fileName.lastIndexOf(".") < 0){
            return AppResponse.bizError("上传图片格式不正确");
        }
        //获取文件后缀
        String prefix = fileName.substring(fileName.lastIndexOf("."));
        //如果不是图片
        if (!".jpg".equalsIgnoreCase(prefix) && !".jpeg".equalsIgnoreCase(prefix) && !".svg".equalsIgnoreCase(prefix) && !".gif".equalsIgnoreCase(prefix) && !".png".equalsIgnoreCase(prefix)) {
            return AppResponse.bizError("上传图片格式不正确");
        }
        //使用uuid作为文件名，防止生成的临时文件重复
        File excelFile = File.createTempFile("imagesFile-" + UUIDUtils.getUUID(), prefix);
        //将Multifile转换成File
        multipartFile.transferTo(excelFile);

        //上传图片获取其url
        String url = TencentCosUtil.upload(excelFile, "xzsd/" + excelFile.getName());

        //删除临时文件
        deleteFile(excelFile);
        return AppResponse.success("图片上传成功", url);
    }
}
