package com.liyuan.demo.domain.po.hero;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author:LiYuan
 * @description:
 * @Date:Create in 11:20 2018/2/8
 * @Modified By:
 */
@Data
public class HeroPo{
    /**
     * ID
     */
    private Integer id;

    private Integer type;

    private String name;

    private Date createtime;

    private String describe;

    private String skill;

}
