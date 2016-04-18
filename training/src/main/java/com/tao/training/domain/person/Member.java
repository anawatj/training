package com.tao.training.domain.person;

import java.util.Date;

public class Member extends Person{
	
	
	public Member()
	{
		
	}
	private String memberCode;
	private Date memberDate;
	public String getMemberCode() {
		return memberCode;
	}
	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}
	public Date getMemberDate() {
		return memberDate;
	}
	public void setMemberDate(Date memberDate) {
		this.memberDate = memberDate;
	}
	

}
