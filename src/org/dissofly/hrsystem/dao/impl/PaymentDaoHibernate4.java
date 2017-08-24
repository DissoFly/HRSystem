package org.dissofly.hrsystem.dao.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.dissofly.common.dao.impl.BaseDaoHibernate4;
import org.dissofly.hrsystem.dao.PaymentDao;
import org.dissofly.hrsystem.domain.Employee;
import org.dissofly.hrsystem.domain.Payment;
import org.springframework.stereotype.Component;
public class PaymentDaoHibernate4 extends BaseDaoHibernate4<Payment>implements PaymentDao{

	/**
	 * 根据员工查询月结薪水
	 * @return 该员工对应的月结薪水集合
	 */
	public List<Payment> findByEmp(Employee emp)
	{
		return find("select p from Payment as p where p.employee=?0" , emp);
	}


	/**
	 * 根据员工和发薪月份来查询月结薪水
	 * @param payMonth 发薪月份
	 * @param emp 领薪的员工
	 * @return 指定员工、指定月份的月结薪水
	 */
	public Payment findByMonthAndEmp(String payMonth
		 , Employee emp)
	{
		List<Payment> pays = find("select p from Payment as p where"
			+ " p.employee=?0 and p.payMonth=?1" , emp , payMonth);
		if (pays != null && pays.size() > 0)
		{
			return pays.get(0);
		}
		return null;
	}

}
