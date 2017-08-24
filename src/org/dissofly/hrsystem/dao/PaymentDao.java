package org.dissofly.hrsystem.dao;

import java.util.List;

import org.dissofly.common.dao.BaseDao;
import org.dissofly.hrsystem.domain.Employee;
import org.dissofly.hrsystem.domain.Payment;

public interface PaymentDao extends BaseDao<Payment>{
	List<Payment> findByEmp(Employee emp);
	
	Payment findByMonthAndEmp(String payMonth,Employee emp);

}
