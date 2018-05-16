package com.liyuan.demo.domain.po.user;

import java.util.Date;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class UserPo {

	/**
	 * 用户表唯一id，自增
	*/
	private Integer uid;
	/**
	 * 用户类型，1表示微信用户，2表示普通用户
	*/
	private Integer utype;
	/**
	 * 年龄
	*/
	private Integer age;
	/**
	 * 手机号
	*/
	private String telphone;
	/**
	 * 出生日期
	*/
	private Date birthday;
	/**
	 * 星座
	*/
	private String constellation;
	/**
	 * 个性签名
	*/
	private String signature;
	/**
	 * 微信为每个用户分配的openid
	*/
	private String openid;
	/**
	 * 关注时间
	*/
	private Date subscribetime;
	/**
	 * 取消关注时间
	*/
	private Date unsubscribetime;
	/**
	 * 状态：1表示已关注；0表示未关注
	*/
	private Integer state;
	/**
	 * 拥有金币
	*/
	private BigDecimal coins;
}