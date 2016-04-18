package com.tao.training.domain.payment;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.emumurate.CheckResult;
import com.tao.training.domain.master.Department;
import com.tao.training.domain.master.DocStatus;
import com.tao.training.domain.master.PaymentMethod;
import com.tao.training.domain.master.Position;
import com.tao.training.domain.person.Employee;
import com.tao.training.domain.person.Lecturer;
@JsonInclude(Include.NON_NULL)
public class Payment extends AbstractDomain<Long> {
		
	public Payment()
	{
		
	}
	private String paymentCode;
	private Date paymentDate;
	private DocStatus paymentStatus;
	private String paymentNote;
	private Employee paymentBy;
	private Department department;
	private Position position;
	private Lecturer payTo;
	private Double wht;
	private PaymentMethod paymentMethod;
	private String payToOther;
	
	private Employee reviewer;
	private Date reviewDate;
	private CheckResult reviewResult;
	private String reviewRemark;
	
	
	private Employee approver;
	private Date approveDate;
	private CheckResult approveResult;
	private String approveRemark;
	
	private Set<PaymentItem> items;

	public String getPaymentCode() {
		return paymentCode;
	}

	public void setPaymentCode(String paymentCode) {
		this.paymentCode = paymentCode;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public DocStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(DocStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getPaymentNote() {
		return paymentNote;
	}

	public void setPaymentNote(String paymentNote) {
		this.paymentNote = paymentNote;
	}

	public Employee getPaymentBy() {
		return paymentBy;
	}

	public void setPaymentBy(Employee paymentBy) {
		this.paymentBy = paymentBy;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Lecturer getPayTo() {
		return payTo;
	}

	public void setPayTo(Lecturer payTo) {
		this.payTo = payTo;
	}

	public Double getWht() {
		return wht;
	}

	public void setWht(Double wht) {
		this.wht = wht;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPayToOther() {
		return payToOther;
	}

	public void setPayToOther(String payToOther) {
		this.payToOther = payToOther;
	}

	public Employee getReviewer() {
		return reviewer;
	}

	public void setReviewer(Employee reviewer) {
		this.reviewer = reviewer;
	}

	public Date getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

	public CheckResult getReviewResult() {
		return reviewResult;
	}

	public void setReviewResult(CheckResult reviewResult) {
		this.reviewResult = reviewResult;
	}

	public String getReviewRemark() {
		return reviewRemark;
	}

	public void setReviewRemark(String reviewRemark) {
		this.reviewRemark = reviewRemark;
	}

	public Employee getApprover() {
		return approver;
	}

	public void setApprover(Employee approver) {
		this.approver = approver;
	}

	public Date getApproveDate() {
		return approveDate;
	}

	public void setApproveDate(Date approveDate) {
		this.approveDate = approveDate;
	}

	public CheckResult getApproveResult() {
		return approveResult;
	}

	public void setApproveResult(CheckResult approveResult) {
		this.approveResult = approveResult;
	}

	public String getApproveRemark() {
		return approveRemark;
	}

	public void setApproveRemark(String approveRemark) {
		this.approveRemark = approveRemark;
	}

	public Set<PaymentItem> getItems() {
		return items;
	}

	public void setItems(Set<PaymentItem> items) {
		this.items = items;
	}
	
	
	
	
}
