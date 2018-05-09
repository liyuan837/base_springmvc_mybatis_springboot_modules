package com.liyuan.demo.form.hero;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class HeroCreateForm {

	@ApiModelProperty(value = "type")
	private Integer type;


	@ApiModelProperty(value = "name")
	private String name;

	@ApiModelProperty(value = "describe")
	private String describe;

	@ApiModelProperty(value = "skill")
	private String skill;
}