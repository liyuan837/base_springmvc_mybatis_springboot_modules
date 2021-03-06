package com.liyuan.demo.vo.user;

import java.util.Date;
import java.math.BigDecimal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class UserVo {

	@ApiModelProperty(value = "用户表唯一id，自增", required = true)
	private Integer uid;

	@ApiModelProperty(value = "用户类型，1表示微信用户，2表示普通用户")
	private Integer utype;

	@ApiModelProperty(value = "年龄")
	private Integer age;

	@ApiModelProperty(value = "手机号")
	private String telphone;

	@ApiModelProperty(value = "出生日期")
	private Date birthday;

	@ApiModelProperty(value = "星座")
	private String constellation;

	@ApiModelProperty(value = "个性签名")
	private String signature;

	@ApiModelProperty(value = "微信为每个用户分配的openid")
	private String openid;

	@ApiModelProperty(value = "关注时间")
	private Date subscribetime;

	@ApiModelProperty(value = "取消关注时间")
	private Date unsubscribetime;

	@ApiModelProperty(value = "状态：1表示已关注；0表示未关注")
	private Integer state;

	@ApiModelProperty(value = "拥有金币")
	private BigDecimal coins;

}