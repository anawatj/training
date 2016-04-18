package com.tao.training.domain.payment;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.emumurate.FlagResult;
import com.tao.training.domain.master.Amphur;
import com.tao.training.domain.master.Department;
import com.tao.training.domain.master.District;
import com.tao.training.domain.master.DocStatus;
import com.tao.training.domain.master.PaymentMethod;
import com.tao.training.domain.master.Position;
import com.tao.training.domain.master.Province;
import com.tao.training.domain.person.Employee;
import com.tao.training.domain.person.Lecturer;
@JsonInclude(Include.NON_NULL)
public class Payment extends AbstractDomain<Long> {
		
	public Payment()
	{
		this.items = new HashSet<PaymentItem>();
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
	private FlagResult reviewResult;
	private String reviewRemark;
	
	
	private Employee approver;
	private Date approveDate;
	private FlagResult approveResult;
	private String approveRemark;
	
	private Set<PaymentItem> items;
	
	private String address;
	private Province province;
	private Amphur amphur;
	private District district;
	private String zipCode;
	private String phone;
	private String email;
	private String fax;
	private String idCard;
	

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	public Amphur getAmphur() {
		return amphur;
	}

	public void setAmphur(Amphur amphur) {
		this.amphur = amphur;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

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

	public FlagResult getReviewResult() {
		return reviewResult;
	}

	public void setReviewResult(FlagResult reviewResult) {
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

	public FlagResult getApproveResult() {
		return approveResult;
	}

	public void setApproveResult(FlagResult approveResult) {
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
