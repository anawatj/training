package com.tao.training.domain.master;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.SimpleMasterObject;
@JsonInclude(Include.NON_NULL)
public class Amphur extends SimpleMasterObject {
		
	public Amphur()
	{
		
	}
	private Long provinceId;
	public Long getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}
	
}
