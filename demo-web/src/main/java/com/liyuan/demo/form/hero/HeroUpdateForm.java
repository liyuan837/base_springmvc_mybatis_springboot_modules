package com.liyuan.demo.form.hero;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@ApiModel
public class HeroUpdateForm {

	@ApiModelProperty(value = "ID", required = true)
	@NotNull(message = "ID不能为空")
	private Integer id;

	@ApiModelProperty(value = "name")
	private String name;

	@ApiModelProperty(value = "type")
	private Integer type;

	@ApiModelProperty(value = "describe")
	private String describe;

	@ApiModelProperty(value = "skill")
	private String skill;

	@ApiModelProperty(value = "总得分")
	private BigDecimal totalScore;

}