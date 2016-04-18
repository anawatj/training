package com.tao.training.domain;

import java.io.Serializable;
import java.util.Date;

public interface IDomain<K extends Serializable> {

	K getId();
	void setId(K id);
	
	int getVersion();
	void setVersion(int version);
	
	
	String getCreatedBy();
	void setCreatedBy(String createdBy);
	
	
	Date getCreatedDate();
	void setCreatedDate(Date createdDate);
	
	
	String getUpdatedBy();
	void setUpdatedBy(String updatedBy);
	
	Date getUpdatedDate();
	void setUpdatedDate(Date updatedDate);
}
