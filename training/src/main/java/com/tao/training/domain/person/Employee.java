package com.tao.training.domain.person;

import java.util.Date;
import java.util.Set;

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
	private Set<Education> educations;
	private Set<Experience> experiences;
	private Set<Reference> references;
	private Set<EmployeeTraining> trainings;
	private Set<Sibling> sibings;
	private Set<Children> children;
	
 	public Set<Education> getEducations() {
		return educations;
	}
	public void setEducations(Set<Education> educations) {
		this.educations = educations;
	}
	public Set<Experience> getExperiences() {
		return experiences;
	}
	public void setExperiences(Set<Experience> experiences) {
		this.experiences = experiences;
	}
	public Set<Reference> getReferences() {
		return references;
	}
	public void setReferences(Set<Reference> references) {
		this.references = references;
	}
	public Set<EmployeeTraining> getTrainings() {
		return trainings;
	}
	public void setTrainings(Set<EmployeeTraining> trainings) {
		this.trainings = trainings;
	}
	public Set<Sibling> getSibings() {
		return sibings;
	}
	public void setSibings(Set<Sibling> sibings) {
		this.sibings = sibings;
	}
	public Set<Children> getChildren() {
		return children;
	}
	public void setChildren(Set<Children> children) {
		this.children = children;
	}
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
