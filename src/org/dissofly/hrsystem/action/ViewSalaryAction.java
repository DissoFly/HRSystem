package org.dissofly.hrsystem.action;

import java.util.List;

import org.dissofly.hrsystem.action.base.EmpBaseAction;
import org.dissofly.hrsystem.vo.PaymentBean;

import com.opensymphony.xwork2.ActionContext;

public class ViewSalaryAction extends EmpBaseAction
{
	// 封装所有发薪信息的List
	private List salarys;
	// salarys的setter和getter方法
	public void setSalarys(List salarys)
	{
		this.salarys = salarys;
	}
	public List getSalarys()
	{
		return this.salarys;
	}
	// 处理用户请求的方法
	public String execute()
		throws Exception
	{
		// 创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		// 获取HttpSession中的user属性
		String user = (String)ctx.getSession()
			.get(WebConstant.USER);
		List<PaymentBean> salarys =  mgr.empSalary(user);
		setSalarys(salarys);
		return SUCCESS;
	}
}