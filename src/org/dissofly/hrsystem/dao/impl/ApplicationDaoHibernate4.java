package org.dissofly.hrsystem.dao.impl;

import java.util.List;

import org.dissofly.common.dao.impl.BaseDaoHibernate4;
import org.dissofly.hrsystem.dao.ApplicationDao;
import org.dissofly.hrsystem.domain.Application;
import org.dissofly.hrsystem.domain.Employee;
import org.springframework.stereotype.Component;
@Component
public class ApplicationDaoHibernate4 extends BaseDaoHibernate4<Application> implements ApplicationDao{

	@Override
	public List<Application> findByEmp(Employee emp) {
		return find("SELECT a from Application as a where a.attend.employee=?0",emp);
	}

}


