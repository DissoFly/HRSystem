package org.dissofly.hrsystem.action.base;

import org.dissofly.hrsystem.service.EmpManager;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

public class EmpBaseAction extends ActionSupport
{
	// 依赖的业务逻辑组件
	protected EmpManager mgr;
	// 依赖注入业务逻辑组件所必须的setter方法
	public void setEmpManager(EmpManager mgr)
	{
		this.mgr = mgr;
	}
}
