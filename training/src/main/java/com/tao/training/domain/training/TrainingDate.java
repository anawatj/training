package com.tao.training.domain.training;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.emumurate.FlagAfternoon;
import com.tao.training.domain.emumurate.FlagMorring;
import com.tao.training.domain.master.Resource;
import com.tao.training.domain.person.Employee;
import com.tao.training.domain.summarize.Summarize;
@JsonInclude(Include.NON_NULL)
public class TrainingDate extends AbstractDomain<Long>{
		
	public TrainingDate()
	{
		
	}
	
	private Long trainingTxId;
    private Training trainingTxObj;
    private Date trainingDate;
    private String trainingTxTime;
    private FlagMorring flagPeriodMorning;
    private FlagAfternoon flagPeriodAfternoon;
	private Resource meetingPlace;
    private Integer trainingGuarantee;
    private Resource vehicle;
    private Employee assignOfficer;
    private Integer preReadinessCount;
    private Integer postReadinessCount;
    private Set<Summarize> trainingSummaize;
    private boolean selected;
    
    public Long getTrainingTxId() {
		return trainingTxId;
	}
	public void setTrainingTxId(Long trainingTxId) {
		this.trainingTxId = trainingTxId;
	}
	public Training getTrainingTxObj() {
		return trainingTxObj;
	}
	public void setTrainingTxObj(Training trainingTxObj) {
		this.trainingTxObj = trainingTxObj;
	}
	public Date getTrainingDate() {
		return trainingDate;
	}
	public void setTrainingDate(Date trainingDate) {
		this.trainingDate = trainingDate;
	}
	public String getTrainingTxTime() {
		return trainingTxTime;
	}
	public void setTrainingTxTime(String trainingTxTime) {
		this.trainingTxTime = trainingTxTime;
	}
	public FlagMorring getFlagPeriodMorning() {
		return flagPeriodMorning;
	}
	public void setFlagPeriodMorning(FlagMorring flagPeriodMorning) {
		this.flagPeriodMorning = flagPeriodMorning;
	}
	public FlagAfternoon getFlagPeriodAfternoon() {
		return flagPeriodAfternoon;
	}
	public void setFlagPeriodAfternoon(FlagAfternoon flagPeriodAfternoon) {
		this.flagPeriodAfternoon = flagPeriodAfternoon;
	}
	public Resource getMeetingPlace() {
		return meetingPlace;
	}
	public void setMeetingPlace(Resource meetingPlace) {
		this.meetingPlace = meetingPlace;
	}
	public Integer getTrainingGuarantee() {
		return trainingGuarantee;
	}
	public void setTrainingGuarantee(Integer trainingGuarantee) {
		this.trainingGuarantee = trainingGuarantee;
	}
	public Resource getVehicle() {
		return vehicle;
	}
	public void setVehicle(Resource vehicle) {
		this.vehicle = vehicle;
	}
	public Employee getAssignOfficer() {
		return assignOfficer;
	}
	public void setAssignOfficer(Employee assignOfficer) {
		this.assignOfficer = assignOfficer;
	}
	public Integer getPreReadinessCount() {
		return preReadinessCount;
	}
	public void setPreReadinessCount(Integer preReadinessCount) {
		this.preReadinessCount = preReadinessCount;
	}
	public Integer getPostReadinessCount() {
		return postReadinessCount;
	}
	public void setPostReadinessCount(Integer postReadinessCount) {
		this.postReadinessCount = postReadinessCount;
	}
	public Set<Summarize> getTrainingSummaize() {
		return trainingSummaize;
	}
	public void setTrainingSummaize(Set<Summarize> trainingSummaize) {
		this.trainingSummaize = trainingSummaize;
	}
	public boolean getSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}


}
