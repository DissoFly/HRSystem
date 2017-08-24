package org.dissofly.hrsystem.schedule;

import org.dissofly.hrsystem.service.EmpManager;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class PunchJob extends QuartzJobBean{

	private boolean isRunning=false;
	private EmpManager empMgr;
	public void setEmpMgr(EmpManager empMgr)
	{
		this.empMgr = empMgr;
	}




	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		if(!isRunning) {
			System.out.println("开始调度自动打卡");
			isRunning=true;
			empMgr.autoPunch();
			isRunning=false;
		}
		
	}

}
