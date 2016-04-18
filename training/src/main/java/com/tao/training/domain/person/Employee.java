package com.tao.training.domain.person;

import java.util.Date;

import com.tao.training.domain.master.Department;
import com.tao.training.domain.master.Position;

public class Employee extends Person {

	
	public Employee()
	{
		
	}
	private String employeeCode;
	private Department department;
	private Position position;
	private Date hireDate;
	private Date resignDate;
	private Double salary;
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public Date getResignDate() {
		return resignDate;
	}
	public void setResignDate(Date resignDate) {
		this.resignDate = resignDate;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
}
