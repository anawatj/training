package com.tao.training.domain.training;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.master.EducationLevel;
import com.tao.training.domain.master.Title;
import com.tao.training.domain.person.Member;
@JsonInclude(Include.NON_NULL)
public class TraineeItem extends AbstractDomain<Long>{
		
	public TraineeItem()
	{
		
	}
	private Long traineeId;
	private Title title;
	private String firstName;
	private String lastName;
	private Member refMember;
	private String idCard;
	private EducationLevel educationLevel;
	private boolean selected;
	public Long getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(Long traineeId) {
		this.traineeId = traineeId;
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
