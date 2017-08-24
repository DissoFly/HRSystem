package org.dissofly.hrsystem.service;

import java.util.List;

import org.dissofly.hrsystem.dao.EmployeeDao;
import org.dissofly.hrsystem.domain.Employee;
import org.dissofly.hrsystem.exception.HrException;
import org.dissofly.hrsystem.vo.AppBean;
import org.dissofly.hrsystem.vo.EmpBean;
import org.dissofly.hrsystem.vo.SalaryBean;

public interface MgrManager
{
	/**
	 * 新增员工
	 * @param emp 新增的员工
	 * @param mgr 员工所属的经理
	 */
	void addEmp(Employee emp , String mgr)
		throws HrException;


	/**
	 * 根据经理返回所有的部门上个月工资
	 * @param mgr 新增的员工名
	 * @return 部门上个月工资
	 */
	List<SalaryBean> getSalaryByMgr(String mgr);

	/**
	 * 根据经理返回该部门的全部员工
	 * @param mgr 经理名
	 * @return 经理的全部下属
	 */
	List<EmpBean> getEmpsByMgr(String mgr);

	/**
	 * 根据经理返回该部门的没有批复的申请
	 * @param mgr 经理名
	 * @return 该部门的全部申请
	 */
	List<AppBean> getAppsByMgr(String mgr);

	/**
	 * 处理申请
	 * @param appid 申请ID
	 * @param mgrName 经理名字
	 * @param result 是否通过
	 */
	void check(int appid, String mgrName, boolean result);
}