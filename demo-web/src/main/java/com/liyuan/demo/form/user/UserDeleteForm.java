package com.liyuan.demo.form.user;

import javax.validation.constraints.NotNull;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class UserDeleteForm {

	@ApiModelProperty(value = "用户表唯一id，自增", required = true)
	@NotNull(message = "用户表唯一id，自增不能为空")
	private Integer uid;

}