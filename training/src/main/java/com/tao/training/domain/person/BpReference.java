package com.tao.training.domain.person;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.master.Title;
@JsonInclude(Include.NON_NULL)
public class BpReference extends AbstractDomain<Long> {
		
	public BpReference()
	{
		
	}
	private Long bpId;
	private Title title;
	private String firstName;
	private String lastName;
	private String tel;
	private String company;
	private String position;
	public Long getBpId() {
		return bpId;
	}
	public void setBpId(Long bpId) {
		this.bpId = bpId;
	}
	public Title getTitle() {
		return title;
	}
	public void setTitle(Title title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
}
