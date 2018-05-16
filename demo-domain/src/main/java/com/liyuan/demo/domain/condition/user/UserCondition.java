package com.liyuan.demo.domain.condition.user;

import java.util.List;
import com.liyuan.demo.domain.condition.BaseCondition;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class UserCondition extends BaseCondition {

	/**
	 * 用户表唯一id，自增
	*/
	private Integer uid;
	/**
	 * 用户表唯一id，自增列表
	*/
	private List<Integer> uidList;
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
	 * 状态：1表示已关注；0表示未关注
	*/
	private Integer state;
	/**
	 * 拥有金币
	*/
	private BigDecimal coins;
}