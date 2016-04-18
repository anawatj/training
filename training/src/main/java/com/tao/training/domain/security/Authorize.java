package com.tao.training.domain.security;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.AbstractDomain;
@JsonInclude(Include.NON_NULL)
public class Authorize extends AbstractDomain<Long>{
	
	private String authorizeCode;
	private String authorizeDesc;
	private String authorizeUrl;
	public String getAuthorizeCode() {
		return authorizeCode;
	}
	public void setAuthorizeCode(String authorizeCode) {
		this.authorizeCode = authorizeCode;
	}
	public String getAuthorizeDesc() {
		return authorizeDesc;
	}
	public void setAuthorizeDesc(String authorizeDesc) {
		this.authorizeDesc = authorizeDesc;
	}
	public String getAuthorizeUrl() {
		return authorizeUrl;
	}
	public void setAuthorizeUrl(String authorizeUrl) {
		this.authorizeUrl = authorizeUrl;
	}

}
