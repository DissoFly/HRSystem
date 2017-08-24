package org.dissofly.hrsystem.action;

import java.util.List;

import org.dissofly.hrsystem.action.base.EmpBaseAction;
import org.dissofly.hrsystem.vo.AttendBean;

import com.opensymphony.xwork2.ActionContext;

public class ViewUnAttendAction extends EmpBaseAction
{
	private List<AttendBean> unAttend;
	// unAttend的setter和getter方法
	public void setUnAttend(List<AttendBean> unAttend)
	{
		this.unAttend = unAttend;
	}
	public List<AttendBean> getUnAttend()
	{
		return this.unAttend;
	}
	public String execute()
		throws Exception
	{
		// 创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		// 获取HttpSession中的user属性
		String user = (String)ctx.getSession()
			.get(WebConstant.USER);
		List<AttendBean> result = mgr.unAttend(user);
		setUnAttend(result);
		return SUCCESS;
	}
}