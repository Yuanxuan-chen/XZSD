package com.xzsd.pc.tencentCos.controller;

import com.neusoft.core.restful.AppResponse;
import com.xzsd.pc.tencentCos.service.TencentCosService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * 图片上传
 * @author Yuanxuan
 * @date 2020-04-13 下午 02:09
 */
@RestController
@RequestMapping("/tencentCos")
public class TencentCosController {

    @Resource
    private TencentCosService tencentCosService;

    @PostMapping("upload")
    public AppResponse upload(@RequestParam("file") MultipartFile multipartFile) throws Exception {
        try {
            return tencentCosService.upload(multipartFile);
        }catch (Exception e) {
            throw e;
        }
    }

}
