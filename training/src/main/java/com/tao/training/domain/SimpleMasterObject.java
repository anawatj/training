package com.tao.training.domain;

public abstract class SimpleMasterObject extends AbstractDomain<Long> {

	public SimpleMasterObject()
	{
		
	}
	private String code;
	private String description;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
