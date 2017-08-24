package org.dissofly.hrsystem.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="attend_inf")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Attend implements Serializable{
	@Id @Column(name="attend_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="duty_day",nullable=false,length=50)
	private String dutyDay;
	@Column(name="punch_time")
	private Date punchTime;
	@Column(name="is_come",nullable=false)
	private boolean isCome;
	@ManyToOne(targetEntity=AttendType.class)
	@JoinColumn(name="type_id",nullable=false)
	private AttendType type;
	@ManyToOne(targetEntity=Employee.class)
	@JoinColumn(name="emp_id",nullable=false)
	private Employee employee;
	public Attend() {
	}
	public Attend(Integer id, String dutyDay, Date punchTime, boolean isCome, AttendType type, Employee employee) {
		this.id = id;
		this.dutyDay = dutyDay;
		this.punchTime = punchTime;
		this.isCome = isCome;
		this.type = type;
		this.employee = employee;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDutyDay() {
		return dutyDay;
	}
	public void setDutyDay(String dutyDay) {
		this.dutyDay = dutyDay;
	}
	public Date getPunchTime() {
		return punchTime;
	}
	public void setPunchTime(Date punchTime) {
		this.punchTime = punchTime;
	}
	public boolean isCome() {
		return isCome;
	}
	public void setCome(boolean isCome) {
		this.isCome = isCome;
	}
	public AttendType getType() {
		return type;
	}
	public void setType(AttendType type) {
		this.type = type;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	@Override
	public int hashCode() {
		final int prime=31;
		int result=1;
		result=prime*result+((dutyDay==null)?0:dutyDay.hashCode());
		result=prime*result+((employee==null)?0:employee.hashCode());
		result=prime*result+(isCome?1354:1241);
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) return true;
		if(obj==null) return false;
		if(getClass()!=obj.getClass())return false;
		Attend other=(Attend) obj;
		if(dutyDay==null) {
			if(other.dutyDay!=null)return false;
		}else if(!dutyDay.equals(other.dutyDay))return false;
		if(employee==null) {
			if(other.employee!=null)return false;
		}else if(!employee.equals(other.employee))return false;
		if(isCome!=other.isCome)return false;
		return true;
		
	}
}
