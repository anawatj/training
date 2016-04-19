package com.tao.training.domain.person;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.emumurate.BloodGroup;
import com.tao.training.domain.master.Amphur;
import com.tao.training.domain.master.Citizen;
import com.tao.training.domain.master.District;
import com.tao.training.domain.master.MemberType;
import com.tao.training.domain.master.Nationality;
import com.tao.training.domain.master.Province;
import com.tao.training.domain.master.Title;
@JsonInclude(Include.NON_NULL)
public abstract  class BusinessPartner extends AbstractDomain<Long>{
		
	public BusinessPartner()
	{
		
	}
	private String bpCode;
	
	private Title title;
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Nationality nationality;
	private Citizen citizen;
	private String address;
	private Province province;
	private Amphur amphur;
	private District district;
	private String zipCode;
	private String phone;
	private String mobile;
	private String email;
	private String fax;
	private Title spouseTitle;
	private String spouseName;
	private String spouseLName;
	


	


	private Set<BpEducation> educations;
	private Set<BpEducation> experiences;
	private Set<BpLanguage> languages;
	private Set<BpChild>  children;
	private Set<BpReference> references;
	private Set<BpSibling> sibling;
	private Set<BpTraining> trainings;
	
	
	private String fatherName;
	private String fatherLName;
	
	private String motherName;
	private String motherLName;
	
	private Integer numSibling;
	private Integer male;
	private Integer fmale;
	
	
	private BloodGroup bloodGroup;
	
	private String idCard;
	
	
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getFatherLName() {
		return fatherLName;
	}
	public void setFatherLName(String fatherLName) {
		this.fatherLName = fatherLName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getMotherLName() {
		return motherLName;
	}
	public void setMotherLName(String motherLName) {
		this.motherLName = motherLName;
	}
	public Integer getNumSibling() {
		return numSibling;
	}
	public void setNumSibling(Integer numSibling) {
		this.numSibling = numSibling;
	}
	public Integer getMale() {
		return male;
	}
	public void setMale(Integer male) {
		this.male = male;
	}
	public Integer getFmale() {
		return fmale;
	}
	public void setFmale(Integer fmale) {
		this.fmale = fmale;
	}
	public String getBpCode() {
		return bpCode;
	}
	public void setBpCode(String bpCode) {
		this.bpCode = bpCode;
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
	public Nationality getNationality() {
		return nationality;
	}
	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}
	public Citizen getCitizen() {
		return citizen;
	}
	public void setCitizen(Citizen citizen) {
		this.citizen = citizen;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Province getProvince() {
		return province;
	}
	public void setProvince(Province province) {
		this.province = province;
	}
	public Amphur getAmphur() {
		return amphur;
	}
	public void setAmphur(Amphur amphur) {
		this.amphur = amphur;
	}
	public District getDistrict() {
		return district;
	}
	public void setDistrict(District district) {
		this.district = district;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public Title getSpouseTitle() {
		return spouseTitle;
	}
	public void setSpouseTitle(Title spouseTitle) {
		this.spouseTitle = spouseTitle;
	}
	public String getSpouseName() {
		return spouseName;
	}
	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}
	public String getSpouseLName() {
		return spouseLName;
	}
	public void setSpouseLName(String spouseLName) {
		this.spouseLName = spouseLName;
	}
	public Set<BpEducation> getEducations() {
		return educations;
	}
	public void setEducations(Set<BpEducation> educations) {
		this.educations = educations;
	}
	public Set<BpEducation> getExperiences() {
		return experiences;
	}
	public void setExperiences(Set<BpEducation> experiences) {
		this.experiences = experiences;
	}
	public Set<BpLanguage> getLanguages() {
		return languages;
	}
	public void setLanguages(Set<BpLanguage> languages) {
		this.languages = languages;
	}
	public Set<BpChild> getChildren() {
		return children;
	}
	public void setChildren(Set<BpChild> children) {
		this.children = children;
	}
	public Set<BpReference> getReferences() {
		return references;
	}
	public void setReferences(Set<BpReference> references) {
		this.references = references;
	}
	public Set<BpSibling> getSibling() {
		return sibling;
	}
	public void setSibling(Set<BpSibling> sibling) {
		this.sibling = sibling;
	}
	public Set<BpTraining> getTrainings() {
		return trainings;
	}
	public void setTrainings(Set<BpTraining> trainings) {
		this.trainings = trainings;
	}

	
	
	

	
}
