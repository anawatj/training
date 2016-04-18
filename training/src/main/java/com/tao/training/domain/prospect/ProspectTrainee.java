package com.tao.training.domain.prospect;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.master.EducationLevel;
import com.tao.training.domain.master.Title;
import com.tao.training.domain.person.Member;
@JsonInclude(Include.NON_NULL)
public class ProspectTrainee extends AbstractDomain<Long>{
		public ProspectTrainee()
		{
			
		}
		private Long prospectId;
		private Title title;
		private String firstName;
		private String lastName;
		private Member refMember;
		private String idCard;
		private EducationLevel educationLevel;
		
		public EducationLevel getEducationLevel() {
			return educationLevel;
		}
		public void setEducationLevel(EducationLevel educationLevel) {
			this.educationLevel = educationLevel;
		}
		public Long getProspectId() {
			return prospectId;
		}
		public void setProspectId(Long prospectId) {
			this.prospectId = prospectId;
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
		
		
}
