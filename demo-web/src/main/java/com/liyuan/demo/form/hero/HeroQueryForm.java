package com.liyuan.demo.form.hero;

import com.liyuan.demo.form.BaseQueryForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@ApiModel
public class HeroQueryForm extends BaseQueryForm {

	@ApiModelProperty(value = "ID")
	private Integer id;

	@ApiModelProperty(value = "ID列表")
	private List<Integer> idList;

	@ApiModelProperty(value = "name")
	private String name;

	@ApiModelProperty(value = "describe")
	private String describe;

	@ApiModelProperty(value = "skill")
	private String skill;

}