package com.tao.training.domain.summarize;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.course.Subject;
import com.tao.training.domain.evaluation.Evaluation;
import com.tao.training.domain.person.Lecturer;
@JsonInclude(Include.NON_NULL)
public class SummarizeLecturrer extends AbstractDomain<Long>{
		
	public SummarizeLecturrer()
	{
		
	}
	
	private Long summarizeId;
	private Lecturer lecturer;
	private Subject subject;
	private Double travelExpense;
	private Double hotelExpense;
	private String startTime;
	private String endTime;
	private String hourAmt;
	private Double ratePerHour;
	private Double allowance;
	private Double evaluateScore;
	private Evaluation evaluation;
	private String remark;
	private boolean selected;
	public Long getSummarizeId() {
		return summarizeId;
	}
	public void setSummarizeId(Long summarizeId) {
		this.summarizeId = summarizeId;
	}
	public Lecturer getLecturer() {
		return lecturer;
	}
	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Double getTravelExpense() {
		return travelExpense;
	}
	public void setTravelExpense(Double travelExpense) {
		this.travelExpense = travelExpense;
	}
	public Double getHotelExpense() {
		return hotelExpense;
	}
	public void setHotelExpense(Double hotelExpense) {
		this.hotelExpense = hotelExpense;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getHourAmt() {
		return hourAmt;
	}
	public void setHourAmt(String hourAmt) {
		this.hourAmt = hourAmt;
	}
	public Double getRatePerHour() {
		return ratePerHour;
	}
	public void setRatePerHour(Double ratePerHour) {
		this.ratePerHour = ratePerHour;
	}
	public Double getAllowance() {
		return allowance;
	}
	public void setAllowance(Double allowance) {
		this.allowance = allowance;
	}
	public Double getEvaluateScore() {
		return evaluateScore;
	}
	public void setEvaluateScore(Double evaluateScore) {
		this.evaluateScore = evaluateScore;
	}
	public Evaluation getEvaluation() {
		return evaluation;
	}
	public void setEvaluation(Evaluation evaluation) {
		this.evaluation = evaluation;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
