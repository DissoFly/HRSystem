package org.dissofly.hrsystem.action;

import org.dissofly.hrsystem.action.base.MgrBaseAction;
import org.dissofly.hrsystem.domain.Employee;

import com.opensymphony.xwork2.ActionContext;

public class AddEmpAction extends MgrBaseAction
{
	// 代表新增员工的成员变量
	private Employee emp;

	// emp的setter和getter方法
	public void setEmp(Employee emp)
	{
		this.emp = emp;
	}
	public Employee getEmp()
	{
		return this.emp;
	}

	public String execute()
		throws Exception
	{
		// 创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		// 获取HttpSession中的user属性
		String mgrName = (String)ctx.getSession()
			.get(WebConstant.USER);
		// 添加新用户
		mgr.addEmp(emp , mgrName);
		addActionMessage("新增员工成功");
		return SUCCESS;
	}
}