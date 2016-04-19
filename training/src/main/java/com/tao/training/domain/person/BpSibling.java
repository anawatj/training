package com.tao.training.domain.person;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.master.EducationLevel;
import com.tao.training.domain.master.Title;
@JsonInclude(Include.NON_NULL)
public class BpSibling extends AbstractDomain<Long> {

	
		public BpSibling()
		{
			
		}
		private Long bpId;
		private Title title;
		private String firstName;
		private String lastName;
		private Date birthDate;
		private EducationLevel educationLevel;
		private String company;
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
		public Date getBirthDate() {
			return birthDate;
		}
		public void setBirthDate(Date birthDate) {
			this.birthDate = birthDate;
		}
		public EducationLevel getEducationLevel() {
			return educationLevel;
		}
		public void setEducationLevel(EducationLevel educationLevel) {
			this.educationLevel = educationLevel;
		}
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
}
