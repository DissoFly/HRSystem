package org.dissofly.hrsystem.dao;

import java.util.List;

import org.dissofly.common.dao.BaseDao;
import org.dissofly.hrsystem.domain.Application;
import org.dissofly.hrsystem.domain.Employee;

public interface ApplicationDao extends BaseDao<Application>{
	List<Application> findByEmp(Employee emp);
}
