package com.liyuan.demo.controller;

import com.liyuan.demo.service.TestService;
import com.liyuan.demo.domain.po.HeroPo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:LiYuan
 * @description:
 * @Date:Create in 11:38 2018/5/9
 * @Modified By:
 */
@RestController
@RequestMapping("/test")
@Api(value="/test",description = "测试类")
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/query")
    public List<HeroPo> query(){
        return testService.query();
    }
}
