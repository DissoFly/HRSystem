package org.dissofly.hrsystem.action;

import org.dissofly.hrsystem.action.base.MgrBaseAction;

import com.opensymphony.xwork2.ActionContext;

public class CheckAppAction extends MgrBaseAction
{
	// 需要被处理的申请ID
	private int attid;
	// 封装处理结果
	private String result;
	// appid的setter和getter方法
	

	// result的setter和getter方法
	public void setResult(String result)
	{
		this.result = result;
	}
	public int getAttid() {
		return attid;
	}
	public void setAttid(int attid) {
		this.attid = attid;
	}
	public String getResult()
	{
		return this.result;
	}

	public String execute()
		throws Exception
	{
		// 创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		// 获取HttpSession中的user属性
		String mgrName = (String)ctx.getSession()
			.get(WebConstant.USER);
		// 通过申请
		if (result.equals("pass"))
		{
			mgr.check(attid, mgrName, true);
		}
		// 拒绝申请
		else if (result.equals("deny"))
		{
			mgr.check(attid, mgrName, false);
		}
		else
		{
			throw new Exception("参数丢失");
		}
		return SUCCESS;
	}
}