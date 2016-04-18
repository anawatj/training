package com.tao.training.domain.person;

import com.tao.training.domain.master.EducationLevel;

public class Lecturer extends Person{
		
	public Lecturer()
	{
		
	}
	private String lacturerCode;
	private String lacturerDate;
	private Double salary;
	private String degree;
	private EducationLevel educationLevel;
	public EducationLevel getEducationLevel() {
		return educationLevel;
	}
	public void setEducationLevel(EducationLevel educationLevel) {
		this.educationLevel = educationLevel;
	}
	public String getLacturerCode() {
		return lacturerCode;
	}
	public void setLacturerCode(String lacturerCode) {
		this.lacturerCode = lacturerCode;
	}
	public String getLacturerDate() {
		return lacturerDate;
	}
	public void setLacturerDate(String lacturerDate) {
		this.lacturerDate = lacturerDate;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
}
