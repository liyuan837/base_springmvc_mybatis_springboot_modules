package com.liyuan.demo.service;

import com.liyuan.demo.domain.po.HeroPo;

import java.util.List;

/**
 * @Author:LiYuan
 * @description:
 * @Date:Create in 11:40 2018/5/9
 * @Modified By:
 */
public interface TestService {
    public String hello();

    List<HeroPo> query();
}
