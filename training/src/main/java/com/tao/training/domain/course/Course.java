package com.tao.training.domain.course;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.master.CourseType;
import com.tao.training.domain.person.BusinessPartner;
import com.tao.training.domain.person.Employee;
import com.tao.training.domain.security.User;
@JsonInclude(Include.NON_NULL)
public class Course extends AbstractDomain<Long>{
	
	public Course()
	{
		
	}
	private String courseCode;
	private String courseDesc;
	private Employee courseBy;
	private CourseType courseType;
	private Set<Subject> subjects;
	private String objectiveDesc;
	public String getObjectiveDesc() {
		return objectiveDesc;
	}
	public void setObjectiveDesc(String objectiveDesc) {
		this.objectiveDesc = objectiveDesc;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getCourseDesc() {
		return courseDesc;
	}
	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}
	public Employee getCourseBy() {
		return courseBy;
	}
	public void setCourseBy(Employee courseBy) {
		this.courseBy = courseBy;
	}
	public CourseType getCourseType() {
		return courseType;
	}
	public void setCourseType(CourseType courseType) {
		this.courseType = courseType;
	}
	public Set<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}
	
}
