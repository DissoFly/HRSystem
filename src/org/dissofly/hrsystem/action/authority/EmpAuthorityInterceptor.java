package org.dissofly.hrsystem.action.authority;

import org.dissofly.hrsystem.action.WebConstant;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class EmpAuthorityInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext ctx=ActionContext.getContext();
		String level=(String)ctx.getSession().get(WebConstant.LEVEL);
		if (level!=null&&(level.equals(WebConstant.EMP_LEVEL)||level.equals(WebConstant.MGR_LEVEL))) {
			return invocation.invoke();
		}
		return Action.LOGIN;
	}

}
