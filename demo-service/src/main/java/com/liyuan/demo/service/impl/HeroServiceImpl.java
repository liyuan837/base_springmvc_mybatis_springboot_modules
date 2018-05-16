package com.liyuan.demo.service.impl;

import com.liyuan.demo.domain.po.hero.HeroPo;
import com.liyuan.demo.domain.condition.hero.HeroCondition;
import com.liyuan.demo.mapper.HeroMapper;
import com.liyuan.demo.service.impl.base.BaseServiceImpl;
import com.liyuan.demo.service.HeroService;
import org.springframework.stereotype.Service;

@Service
public class HeroServiceImpl extends BaseServiceImpl<HeroPo, HeroCondition, HeroMapper> implements HeroService {

}