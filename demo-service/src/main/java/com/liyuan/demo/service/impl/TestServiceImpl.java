package com.liyuan.demo.service.impl;

import com.liyuan.demo.domain.po.HeroPo;
import com.liyuan.demo.mapper.TestMapper;
import com.liyuan.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:LiYuan
 * @description:
 * @Date:Create in 11:41 2018/5/9
 * @Modified By:
 */
@Service
public class TestServiceImpl implements TestService{
    @Autowired
    private TestMapper testMapper;

    @Override
    public String hello() {
        return "hello";
    }

    @Override
    public List<HeroPo> query() {
        return testMapper.query();
    }
}
