package org.dissofly.hrsystem.vo;

import java.io.Serializable;

public class AppBean implements Serializable
{
	private static final long serialVersionUID = 48L;

	private int id;
	private String emp;
	private String unAttend;
	private String toAttend;
	private String reason;


	// 无参数的构造器
	public AppBean()
	{
	}
	// 初始化全部成员变量的构造器
	public AppBean(int id , String emp , String unAttend
		, String toAttend , String reason)
	{
		this.id = id;
		this.emp = emp;
		this.unAttend = unAttend;
		this.toAttend = toAttend;
		this.reason = reason;
	}

	// id的setter和getter方法
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return this.id;
	}

	// emp的setter和getter方法
	public void setEmp(String emp)
	{
		this.emp = emp;
	}
	public String getEmp()
	{
		return this.emp;
	}

	// unAttend的setter和getter方法
	public void setUnAttend(String unAttend)
	{
		this.unAttend = unAttend;
	}
	public String getUnAttend()
	{
		return this.unAttend;
	}

	// toAttend的setter和getter方法
	public void setToAttend(String toAttend)
	{
		this.toAttend = toAttend;
	}
	public String getToAttend()
	{
		return this.toAttend;
	}

	// reason的setter和getter方法
	public void setReason(String reason)
	{
		this.reason = reason;
	}
	public String getReason()
	{
		return this.reason;
	}

}