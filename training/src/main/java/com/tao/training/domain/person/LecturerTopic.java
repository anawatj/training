package com.tao.training.domain.person;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.course.Topic;
@JsonInclude(Include.NON_NULL)
public class LecturerTopic extends AbstractDomain<Long> {
		
	public LecturerTopic()
	{
		
	}
	private Long lecturerSubjectId;
	private Topic topic;
	public Long getLecturerSubjectId() {
		return lecturerSubjectId;
	}
	public void setLecturerSubjectId(Long lecturerSubjectId) {
		this.lecturerSubjectId = lecturerSubjectId;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
}
