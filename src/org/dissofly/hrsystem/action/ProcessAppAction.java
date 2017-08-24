package org.dissofly.hrsystem.action;

import org.dissofly.hrsystem.action.base.EmpBaseAction;

public class ProcessAppAction extends EmpBaseAction{
	private int attId;
	private int typeId;
	private String reason;
	public int getAttId() {
		return attId;
	}
	public void setAttId(int attId) {
		this.attId = attId;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	@Override
	public String execute() throws Exception {
		boolean result=mgr.addApplication(attId, typeId, reason);
		if(result) {
			addActionMessage("你已经申请成功，等待经理审阅");
		}else {
			addActionMessage("申请失败，请注意不要重复申请");
		}
		return SUCCESS;
			
	}
	

}
