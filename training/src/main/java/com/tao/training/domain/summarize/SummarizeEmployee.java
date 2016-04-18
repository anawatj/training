package com.tao.training.domain.summarize;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.AbstractDomain;
@JsonInclude(Include.NON_NULL)
public class SummarizeEmployee extends AbstractDomain<Long>{
		
	public SummarizeEmployee()
	{
		
	}
}
