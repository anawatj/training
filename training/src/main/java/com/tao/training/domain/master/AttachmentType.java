package com.tao.training.domain.master;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.SimpleMasterObject;
@JsonInclude(Include.NON_NULL)
public class AttachmentType extends SimpleMasterObject {
	
	public AttachmentType()
	{
		
	}
}
