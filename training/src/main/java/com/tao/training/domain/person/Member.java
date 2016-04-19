package com.tao.training.domain.person;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.master.MemberType;

@JsonInclude(Include.NON_NULL)
public class Member extends BusinessPartner {
		
	public Member()
	{
		
	}
	private String memberCode;
	private MemberType memberType;
	public String getMemberCode() {
		return memberCode;
	}
	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}
	public MemberType getMemberType() {
		return memberType;
	}
	public void setMemberType(MemberType memberType) {
		this.memberType = memberType;
	}
	
}
