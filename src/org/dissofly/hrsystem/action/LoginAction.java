package org.dissofly.hrsystem.action;

import org.dissofly.hrsystem.action.base.EmpBaseAction;
import org.dissofly.hrsystem.domain.Manager;
import static org.dissofly.hrsystem.service.EmpManager.*;

import com.opensymphony.xwork2.ActionContext;

public class LoginAction extends EmpBaseAction {

	private final String EMP_RESULT = "emp";
	private final String MGR_RESULT = "mgr";
	private Manager manager;
	private String vercode;

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public String getVercode() {
		return vercode;
	}

	public void setVercode(String vercode) {
		this.vercode = vercode;
	}

	@Override
	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		String ver2 = (String) ctx.getSession().get("rand");
		if (/*vercode.equalsIgnoreCase(ver2)*/ true) {
			System.out.println(getManager().toString());
			int result = mgr.validLogin(getManager());
			if (result == LOGIN_EMP) {
				ctx.getSession().put(WebConstant.USER, manager.getName());
				ctx.getSession().put(WebConstant.LEVEL, WebConstant.EMP_LEVEL);
				addActionMessage("你已经成功登陆系统");
				return EMP_RESULT;
			} else if (result == LOGIN_MGR) {
				ctx.getSession().put(WebConstant.USER, manager.getName());
				ctx.getSession().put(WebConstant.LEVEL, WebConstant.MGR_LEVEL);
				addActionMessage("你已经成功登陆系统");
				return MGR_RESULT;
			} else {
				addActionMessage("用户名/密码不匹配");
				return ERROR;
			}
		}
		addActionMessage("验证码不匹配，请重新输入");
		return ERROR;
	}
}
