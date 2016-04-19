package com.tao.training.domain.summarize;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.AbstractDomain;
@JsonInclude(Include.NON_NULL)
public class SummarizeTraineeDiploma extends AbstractDomain<Long> {
		
	
	public SummarizeTraineeDiploma()
	{
		
	}
	
	private Long summarizeId;
	private String requestNo;
	private String requestDate;
	private String remark;
	private boolean selected;
	public Long getSummarizeId() {
		return summarizeId;
	}
	public void setSummarizeId(Long summarizeId) {
		this.summarizeId = summarizeId;
	}
	public String getRequestNo() {
		return requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}
	public String getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
