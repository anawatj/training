package com.tao.training.domain.course;

import java.util.Set;

import com.tao.training.domain.AbstractDomain;

public class Subject extends AbstractDomain<Long> {
	public Subject()
	{
		
		
	}
	private Long courseId;
	private String subjectName;
	private Long activity;
	private Long theory;
	private Set<Topic> topics;
	private String objectiveDesc;
	public String getObjectiveDesc() {
		return objectiveDesc;
	}
	public void setObjectiveDesc(String objectiveDesc) {
		this.objectiveDesc = objectiveDesc;
	}
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public Long getActivity() {
		return activity;
	}
	public void setActivity(Long activity) {
		this.activity = activity;
	}
	public Long getTheory() {
		return theory;
	}
	public void setTheory(Long theory) {
		this.theory = theory;
	}
	public Set<Topic> getTopics() {
		return topics;
	}
	public void setTopics(Set<Topic> topics) {
		this.topics = topics;
	}

}
