package com.tao.training.domain.person;

import java.util.Date;

import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.master.Amphur;
import com.tao.training.domain.master.District;
import com.tao.training.domain.master.Province;
import com.tao.training.domain.master.Title;

public abstract class Person extends AbstractDomain<Long>{

	private String personCode;
	private Title title;
	private String firstName;
	private String lastName;
	private Date birthDate;
	private String idCard;
	private String address;
	private Province province;
	private Amphur amphur;
	private District district;
	private String zipCode;
	private String homePhone;
	private String mobile;
	private String fax;
	private String email;
	
	
	public String getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getPersonCode() {
		return personCode;
	}
	public void setPersonCode(String personCode) {
		this.personCode = personCode;
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
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

}
