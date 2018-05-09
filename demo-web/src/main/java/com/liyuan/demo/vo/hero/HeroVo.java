package com.liyuan.demo.vo.hero;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
@ApiModel
public class HeroVo {

	@ApiModelProperty(value = "ID", required = true)
	private Integer id;

	@ApiModelProperty(value = "name")
	private String name;

	@ApiModelProperty(value = "type")
	private Integer type;


	@ApiModelProperty(value = "describe")
	private String describe;

	@ApiModelProperty(value = "skill")
	private String skill;

	}