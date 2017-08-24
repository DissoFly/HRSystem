package org.dissofly.hrsystem.action.base;

import org.dissofly.hrsystem.service.MgrManager;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

public class MgrBaseAction extends ActionSupport {
	protected MgrManager mgr;

	public void setMgrManager(MgrManager mgr) {
		this.mgr = mgr;
	}
}