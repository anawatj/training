package com.tao.training.domain.summarize;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.master.TravelBy;
import com.tao.training.domain.payment.Payment;
import com.tao.training.domain.person.Employee;
@JsonInclude(Include.NON_NULL)
public class SummarizeEmployee extends AbstractDomain<Long>{
		
	public SummarizeEmployee()
	{
		
	}
	
	private Long summarizeId;
	private Employee officer;
	private String startTime;
	private String endTime;
	private String hourAmt;
	private Double ratePerHour;
	private String flagWeekend;
	private Double allowance;
	private Double evaluateScore;
	private Double travelingExpense;
	private Double returnTripExpense;
	private Double distance;
	private TravelBy travelBy;
	private Double expressWayExpense;
	private Payment refAdvancePayment;
	private String remark;
	private boolean selected;
	public Long getSummarizeId() {
		return summarizeId;
	}
	public void setSummarizeId(Long summarizeId) {
		this.summarizeId = summarizeId;
	}
	public Employee getOfficer() {
		return officer;
	}
	public void setOfficer(Employee officer) {
		this.officer = officer;
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
	public String getFlagWeekend() {
		return flagWeekend;
	}
	public void setFlagWeekend(String flagWeekend) {
		this.flagWeekend = flagWeekend;
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
	public Double getTravelingExpense() {
		return travelingExpense;
	}
	public void setTravelingExpense(Double travelingExpense) {
		this.travelingExpense = travelingExpense;
	}
	public Double getReturnTripExpense() {
		return returnTripExpense;
	}
	public void setReturnTripExpense(Double returnTripExpense) {
		this.returnTripExpense = returnTripExpense;
	}
	public Double getDistance() {
		return distance;
	}
	public void setDistance(Double distance) {
		this.distance = distance;
	}
	public TravelBy getTravelBy() {
		return travelBy;
	}
	public void setTravelBy(TravelBy travelBy) {
		this.travelBy = travelBy;
	}
	public Double getExpressWayExpense() {
		return expressWayExpense;
	}
	public void setExpressWayExpense(Double expressWayExpense) {
		this.expressWayExpense = expressWayExpense;
	}
	public Payment getRefAdvancePayment() {
		return refAdvancePayment;
	}
	public void setRefAdvancePayment(Payment refAdvancePayment) {
		this.refAdvancePayment = refAdvancePayment;
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
