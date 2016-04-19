package com.tao.training.domain.quotation;

import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.master.EducationLevel;
import com.tao.training.domain.master.Title;
import com.tao.training.domain.person.BusinessPartner;
import com.tao.training.domain.person.Member;


public class QuotationTrainee extends AbstractDomain<Long>{
		
	
	public QuotationTrainee()
	{
		
	}
	private Long quotationId;
	private Title title;
	private String firstName;
	private String lastName;
	private Member refMember;
	private String idCard;
	private EducationLevel educationLevel;
	private boolean selected;
	public Long getQuotationId() {
		return quotationId;
	}
	public void setQuotationId(Long quotationId) {
		this.quotationId = quotationId;
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
	public Member getRefMember() {
		return refMember;
	}
	public void setRefMember(Member refMember) {
		this.refMember = refMember;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public EducationLevel getEducationLevel() {
		return educationLevel;
	}
	public void setEducationLevel(EducationLevel educationLevel) {
		this.educationLevel = educationLevel;
	}
	public boolean getSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
}
