package org.dissofly.hrsystem.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.dissofly.hrsystem.action.base.EmpBaseAction;

import com.opensymphony.xwork2.ActionContext;

public class PunchAction extends EmpBaseAction{
	private int punchIsValid;

	public int getPunchIsValid() {
		return punchIsValid;
	}

	public void setPunchIsValid(int punchIsValid) {
		this.punchIsValid = punchIsValid;
	}
	
	@Override
	public String execute() throws Exception {
		ActionContext ctx=ActionContext.getContext();
		String user=(String)ctx.getSession().get(WebConstant.USER);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String dutyDay=sdf.format(new Date());
		int result=mgr.validPunch(user, dutyDay);
		setPunchIsValid(result);
		return SUCCESS;
	}
	
	
}
