package org.dissofly.hrsystem.dao;

import java.util.List;

import org.dissofly.common.dao.BaseDao;
import org.dissofly.hrsystem.domain.Manager;

public interface ManagerDao extends BaseDao<Manager>{
	List<Manager> findByNameAndPass(Manager mgr);
	
	Manager findByName(String name);
	

}
