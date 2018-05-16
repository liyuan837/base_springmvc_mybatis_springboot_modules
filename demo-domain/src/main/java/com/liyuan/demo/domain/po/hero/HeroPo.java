package com.liyuan.demo.domain.po.hero;

import java.util.Date;
import lombok.Data;

@Data
public class HeroPo {

	/**
	 * 
	*/
	private Integer id;
	/**
	 * 
	*/
	private Integer type;
	/**
	 * 
	*/
	private String name;
	/**
	 * 
	*/
	private Date createtime;
	/**
	 * 
	*/
	private String describe;
	/**
	 * 
	*/
	private String skill;
}