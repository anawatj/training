package com.tao.training.domain.master;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.tao.training.domain.SimpleMasterObject;
@JsonInclude(Include.NON_NULL)
public class Citizen extends SimpleMasterObject{
		
	public Citizen()
	{
		
	}
}
