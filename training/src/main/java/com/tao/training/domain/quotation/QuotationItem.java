package com.tao.training.domain.quotation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.emumurate.FlagVat;
import com.tao.training.domain.master.ExpenseType;
import com.tao.training.domain.master.Service;
@JsonInclude(Include.NON_NULL)
public class QuotationItem extends AbstractDomain<Long> {
		
	
	public QuotationItem()
	{
		
	}
	private Long quotationId;
	private ExpenseType expenseType;
	private Service service;
	private String itemUnit;
	private FlagVat flagVat;
	private Double unitPrice;
	private Integer qty;
	private Double traineeAmt;
	private Double amount;
	private Double discount;
	private boolean select;
	public Long getQuotationId() {
		return quotationId;
	}
	public void setQuotationId(Long quotationId) {
		this.quotationId = quotationId;
	}
	public ExpenseType getExpenseType() {
		return expenseType;
	}
	public void setExpenseType(ExpenseType expenseType) {
		this.expenseType = expenseType;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	public String getItemUnit() {
		return itemUnit;
	}
	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}
	public FlagVat getFlagVat() {
		return flagVat;
	}
	public void setFlagVat(FlagVat flagVat) {
		this.flagVat = flagVat;
	}
	public Double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Double getTraineeAmt() {
		return traineeAmt;
	}
	public void setTraineeAmt(Double traineeAmt) {
		this.traineeAmt = traineeAmt;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public boolean isSelect() {
		return select;
	}
	public void setSelect(boolean select) {
		this.select = select;
	}
}
