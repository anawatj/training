package com.tao.training.domain.master;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.SimpleMasterObject;
@JsonInclude(Include.NON_NULL)
public class District extends SimpleMasterObject {
		
	public District()
	{
		
	}
	private Long amphurId;
	public Long getAmphurId() {
		return amphurId;
	}
	public void setAmphurId(Long amphurId) {
		this.amphurId = amphurId;
	}
	
}
