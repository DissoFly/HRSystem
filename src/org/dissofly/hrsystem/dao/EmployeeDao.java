package org.dissofly.hrsystem.dao;

import java.util.List;

import org.dissofly.common.dao.BaseDao;
import org.dissofly.hrsystem.domain.Employee;

public interface EmployeeDao extends BaseDao<Employee>{
	List<Employee> findByNameAndPass(Employee emp);
	Employee findByName(String name);
}
