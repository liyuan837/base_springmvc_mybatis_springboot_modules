package com.liyuan.demo.domain.condition.hero;

import com.liyuan.demo.domain.condition.BaseCondition;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @Author:LiYuan
 * @description:
 * @Date:Create in 11:20 2018/2/8
 * @Modified By:
 */
@Data
public class HeroCondition extends BaseCondition{
    /**
     * ID
     */
    private Integer id;

    /**
     * ID列表
     */
    private List<Integer> idList;

    private Integer type;

    private String name;

    private Date createtime;

    private String describe;

    private String skill;

}
