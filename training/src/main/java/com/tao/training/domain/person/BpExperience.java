package com.tao.training.domain.person;

import java.util.Date;

import com.tao.training.domain.AbstractDomain;

public class BpExperience extends AbstractDomain<Long>{

	
	public BpExperience()
	{
		
	}
	private Long bpId;
	private String company;
	private Date hiredDate;
	private Date resignedDate;
	private String position;
	private Double salary;
	private String reasonOfResign;
	public Long getBpId() {
		return bpId;
	}
	public void setBpId(Long bpId) {
		this.bpId = bpId;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Date getHiredDate() {
		return hiredDate;
	}
	public void setHiredDate(Date hiredDate) {
		this.hiredDate = hiredDate;
	}
	public Date getResignedDate() {
		return resignedDate;
	}
	public void setResignedDate(Date resignedDate) {
		this.resignedDate = resignedDate;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getReasonOfResign() {
		return reasonOfResign;
	}
	public void setReasonOfResign(String reasonOfResign) {
		this.reasonOfResign = reasonOfResign;
	}
}
