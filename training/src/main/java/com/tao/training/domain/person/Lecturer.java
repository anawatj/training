package com.tao.training.domain.person;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Lecturer extends BusinessPartner{
		
	public Lecturer()
	{
		
	}
	private String lecturerCode;
	private Date effectiveDate;
	private Date expiryDate;
	
	private Set<LecturerCourse> courses;

	public String getLecturerCode() {
		return lecturerCode;
	}

	public void setLecturerCode(String lecturerCode) {
		this.lecturerCode = lecturerCode;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Set<LecturerCourse> getCourses() {
		return courses;
	}

	public void setCourses(Set<LecturerCourse> courses) {
		this.courses = courses;
	}
	
	
}
