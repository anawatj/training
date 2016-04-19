package com.tao.training.domain.training;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.course.Course;
import com.tao.training.domain.course.Subject;
import com.tao.training.domain.course.Topic;
import com.tao.training.domain.emumurate.FlagAfternoon;
import com.tao.training.domain.emumurate.FlagGroup;
import com.tao.training.domain.emumurate.FlagMorring;
import com.tao.training.domain.master.Resource;
import com.tao.training.domain.person.Lecturer;

@JsonInclude(Include.NON_NULL)
public class TrainingSchedule extends AbstractDomain<Long> {

	public TrainingSchedule() {

	}

	private Long trainingTxId;
	private Date trainingDate;

	private String flagPeriodMorning;
	private String flagPeriodAfternoon;
	private String timePeriod;
	private Subject subject;
	private Topic topic;
	private String activityDetail;
	private Lecturer lecturer;
	private FlagGroup flagGroup;

	private boolean selected;

	public Long getTrainingTxId() {
		return trainingTxId;
	}

	public void setTrainingTxId(Long trainingTxId) {
		this.trainingTxId = trainingTxId;
	}

	public Date getTrainingDate() {
		return trainingDate;
	}

	public void setTrainingDate(Date trainingDate) {
		this.trainingDate = trainingDate;
	}

	public String getFlagPeriodMorning() {
		return flagPeriodMorning;
	}

	public void setFlagPeriodMorning(String flagPeriodMorning) {
		this.flagPeriodMorning = flagPeriodMorning;
	}

	public String getFlagPeriodAfternoon() {
		return flagPeriodAfternoon;
	}

	public void setFlagPeriodAfternoon(String flagPeriodAfternoon) {
		this.flagPeriodAfternoon = flagPeriodAfternoon;
	}

	public String getTimePeriod() {
		return timePeriod;
	}

	public void setTimePeriod(String timePeriod) {
		this.timePeriod = timePeriod;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public String getActivityDetail() {
		return activityDetail;
	}

	public void setActivityDetail(String activityDetail) {
		this.activityDetail = activityDetail;
	}

	public Lecturer getLecturer() {
		return lecturer;
	}

	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
	}

	public FlagGroup getFlagGroup() {
		return flagGroup;
	}

	public void setFlagGroup(FlagGroup flagGroup) {
		this.flagGroup = flagGroup;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
