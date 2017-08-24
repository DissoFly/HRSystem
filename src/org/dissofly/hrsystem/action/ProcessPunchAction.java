package org.dissofly.hrsystem.action;

import java.sql.Date;

import org.dissofly.hrsystem.service.EmpManager;
import org.dom4j.Branch;

import static org.dissofly.hrsystem.service.EmpManager.*;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ProcessPunchAction extends ActionSupport{
	private EmpManager empMgr;

	public void setEmpManager(EmpManager empMgr) {
		this.empMgr = empMgr;
	}
	
	public String come() {
		return process(true);
	}
	
	public String leave() {
		return process(false);
	}

	private String process(boolean isCome) {
		ActionContext ctx=ActionContext.getContext();
		String user=(String)ctx.getSession().get(WebConstant.USER);
		System.out.println("------打卡-------"+user);
		String dutyDay=new Date(System.currentTimeMillis()).toString();
		int result=empMgr.punch(user, dutyDay, isCome);
		switch (result) {
		case PUNCH_FAIL:
			addActionMessage("打卡失败");
			break;
		case PUNCHED:
			addActionMessage("你已经打过卡了，不要重复打卡");
			break;
		case PUNCH_SUCC:
			addActionMessage("打卡成功");
			break;
		default:
			break;
		}
		return SUCCESS;
	}
}
