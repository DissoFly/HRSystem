package org.dissofly.hrsystem.dao;

import java.util.List;

import org.dissofly.common.dao.BaseDao;
import org.dissofly.hrsystem.domain.Attend;
import org.dissofly.hrsystem.domain.AttendType;
import org.dissofly.hrsystem.domain.Employee;

public interface AttendDao extends BaseDao<Attend>{
	List<Attend> findByEmpAndMonth(Employee emp,String month);
	
	List<Attend> findByEmpAndDutyDay(Employee emp,String dutyDay);
	
	Attend findByEmpAndDutyDayAndCome(Employee emp,String dutyDay,boolean isCome);
	
	List<Attend> findByEmpUnAttend(Employee emp,AttendType type);
}
