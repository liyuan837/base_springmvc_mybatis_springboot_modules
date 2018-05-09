package com.liyuan.demo.mapper;

import com.liyuan.demo.domain.po.HeroPo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:LiYuan
 * @description:
 * @Date:Create in 11:43 2018/5/9
 * @Modified By:
 */
@Repository
public interface TestMapper {
    List<HeroPo> query();
}
