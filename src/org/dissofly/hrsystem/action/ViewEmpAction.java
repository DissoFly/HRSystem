package org.dissofly.hrsystem.action;

import java.util.List;

import org.dissofly.hrsystem.action.base.MgrBaseAction;

import com.opensymphony.xwork2.ActionContext;

/**
 * 获取当前经理的所有员工
 */
public class ViewEmpAction extends MgrBaseAction {
	// 封装当前经理所有员工的List
	private List emps;

	// emps的setter和getter方法
	public void setEmps(List emps) {
		this.emps = emps;
	}

	public List getEmps() {
		return this.emps;
	}

	public String execute() throws Exception {
		// 创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		// 获取HttpSession中的user属性
		String mgrName = (String) ctx.getSession().get(WebConstant.USER);
		setEmps(mgr.getEmpsByMgr(mgrName));
		return SUCCESS;
	}
}