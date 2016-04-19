package com.tao.training.domain.person;

import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.course.Subject;

public class LecturerSubject extends AbstractDomain<Long> {
	
	public LecturerSubject()
	{
		
	}
	private Long lecturerCourseId;
	private Subject subject;
	public Long getLecturerCourseId() {
		return lecturerCourseId;
	}
	public void setLecturerCourseId(Long lecturerCourseId) {
		this.lecturerCourseId = lecturerCourseId;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}

}
