package org.dissofly.hrsystem.action;

import java.util.List;

import org.dissofly.hrsystem.action.base.EmpBaseAction;
import org.dissofly.hrsystem.domain.Attend;
import org.dissofly.hrsystem.domain.AttendType;

public class AppChangeAction extends EmpBaseAction{
	private List<AttendType> types;
	
	private Integer attid;
	

	public Integer getAttid() {
		return attid;
	}

	public void setAttid(Integer attid) {
		this.attid = attid;
	}

	public List<AttendType> getTypes() {
		return types;
	}

	public void setTypes(List<AttendType> types) {
		this.types = types;
	}
	
	@Override
	public String execute() throws Exception {
		setTypes(mgr.getAllType());
		return SUCCESS;
	}
}
