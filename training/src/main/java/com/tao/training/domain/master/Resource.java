package com.tao.training.domain.master;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.tao.training.domain.SimpleMasterObject;
import com.tao.training.domain.emumurate.FlagResourceType;
import com.tao.training.domain.person.Employee;
@JsonInclude(Include.NON_NULL)
public class Resource extends SimpleMasterObject {
		
	public Resource()
	{
		
	}
	private String moreDetail;
	private FlagResourceType flagResourceType;
	private Double rentCharges;
	private Double pledge;
	private String model;
	private String serial;
	public String getMoreDetail() {
		return moreDetail;
	}
	public void setMoreDetail(String moreDetail) {
		this.moreDetail = moreDetail;
	}
	public FlagResourceType getFlagResourceType() {
		return flagResourceType;
	}
	public void setFlagResourceType(FlagResourceType flagResourceType) {
		this.flagResourceType = flagResourceType;
	}
	public Double getRentCharges() {
		return rentCharges;
	}
	public void setRentCharges(Double rentCharges) {
		this.rentCharges = rentCharges;
	}
	public Double getPledge() {
		return pledge;
	}
	public void setPledge(Double pledge) {
		this.pledge = pledge;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
}
