package com.tao.training.domain.person;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.course.Subject;
@JsonInclude(Include.NON_NULL)
public class LecturerSubject extends AbstractDomain<Long> {
	
	public LecturerSubject()
	{
		
	}
	private Long lecturerCourseId;
	private Subject subject;
	private Set<LecturerTopic> topics;
	public Set<LecturerTopic> getTopics() {
		return topics;
	}
	public void setTopics(Set<LecturerTopic> topics) {
		this.topics = topics;
	}
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
