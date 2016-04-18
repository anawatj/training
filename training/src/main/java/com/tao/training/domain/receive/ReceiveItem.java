package com.tao.training.domain.receive;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.AbstractDomain;
@JsonInclude(Include.NON_NULL)
public class ReceiveItem extends AbstractDomain<Long>{
	
	public ReceiveItem()
	{
		
	}
	private Long receiveId;
	private String description;
	private Double qty;
	private Double amount;
	private Double total;
	private boolean selected;
	public Long getReceiveId() {
		return receiveId;
	}
	public void setReceiveId(Long receiveId) {
		this.receiveId = receiveId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getQty() {
		return qty;
	}
	public void setQty(Double qty) {
		this.qty = qty;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public boolean getSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
