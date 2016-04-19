package com.tao.training.domain.person;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.course.Course;
@JsonInclude(Include.NON_NULL)
public class LecturerCourse extends AbstractDomain<Long> {
		
	public LecturerCourse()
	{
		
	}
	private Long lecturerId;
	private Course course;
	private Set<LecturerSubject> subjects;
	public Long getLecturerId() {
		return lecturerId;
	}
	public void setLecturerId(Long lecturerId) {
		this.lecturerId = lecturerId;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Set<LecturerSubject> getSubjects() {
		return subjects;
	}
	public void setSubjects(Set<LecturerSubject> subjects) {
		this.subjects = subjects;
	}
}
