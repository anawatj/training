package com.tao.training.domain.course;

import com.tao.training.domain.AbstractDomain;

public class Topic extends AbstractDomain<Long> {
	
	public Topic()
	{
		
	}
	private Long subjectId;
	private String topicName;
	public Long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
}
