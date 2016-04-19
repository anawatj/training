package com.tao.training.domain.receive;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.emumurate.FlagResult;
import com.tao.training.domain.emumurate.FlagVat;
import com.tao.training.domain.master.Amphur;
import com.tao.training.domain.master.Department;
import com.tao.training.domain.master.District;
import com.tao.training.domain.master.DocStatus;
import com.tao.training.domain.master.Position;
import com.tao.training.domain.master.Province;
import com.tao.training.domain.master.ReceiveType;
import com.tao.training.domain.person.BusinessPartner;
import com.tao.training.domain.person.Employee;
import com.tao.training.domain.person.Member;

@JsonInclude(Include.NON_NULL)
public class Receive extends AbstractDomain<Long>{

	
	public Receive()
	{
		
	}
	private String receiveCode;
	private Date receiveDate;
	private DocStatus receiveStatus;
	private String receiveNote;
	private Employee receiveBy;
	private ReceiveType receiveType;
	
	private Department department;
	private Position position;
	
	private Member receiveFrom;
	
	private FlagVat flagVat;
	private Double vatPerc;
	private Double vatAmt;
	
	private String address;
	private Province province;
	private Amphur amphur;
	private District district;
	private String zipCode;
	private String homePhone;
	private String mobile;
	private String emaail;
	private String fax;
	private String idCard;
	
	private Employee reviewer;
	private Date reviewDate;
	private FlagResult reviewResult;
	private String reviewRemark;
	
	
	private Employee approver;
	private Date approveBy;
	private FlagResult approveResult;
	private String approveRemark;
	
	private Set<ReceiveItem> items;

	public String getReceiveCode() {
		return receiveCode;
	}

	public void setReceiveCode(String receiveCode) {
		this.receiveCode = receiveCode;
	}

	public Date getReceiveDate() {
		return receiveDate;
	}

	public void setReceiveDate(Date receiveDate) {
		this.receiveDate = receiveDate;
	}

	public DocStatus getReceiveStatus() {
		return receiveStatus;
	}

	public void setReceiveStatus(DocStatus receiveStatus) {
		this.receiveStatus = receiveStatus;
	}

	public String getReceiveNote() {
		return receiveNote;
	}

	public void setReceiveNote(String receiveNote) {
		this.receiveNote = receiveNote;
	}

	public Employee getReceiveBy() {
		return receiveBy;
	}

	public void setReceiveBy(Employee receiveBy) {
		this.receiveBy = receiveBy;
	}

	public ReceiveType getReceiveType() {
		return receiveType;
	}

	public void setReceiveType(ReceiveType receiveType) {
		this.receiveType = receiveType;
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

	public Member getReceiveFrom() {
		return receiveFrom;
	}

	public void setReceiveFrom(Member receiveFrom) {
		this.receiveFrom = receiveFrom;
	}

	public FlagVat getFlagVat() {
		return flagVat;
	}

	public void setFlagVat(FlagVat flagVat) {
		this.flagVat = flagVat;
	}

	public Double getVatPerc() {
		return vatPerc;
	}

	public void setVatPerc(Double vatPerc) {
		this.vatPerc = vatPerc;
	}

	public Double getVatAmt() {
		return vatAmt;
	}

	public void setVatAmt(Double vatAmt) {
		this.vatAmt = vatAmt;
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

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmaail() {
		return emaail;
	}

	public void setEmaail(String emaail) {
		this.emaail = emaail;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
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

	public Date getApproveBy() {
		return approveBy;
	}

	public void setApproveBy(Date approveBy) {
		this.approveBy = approveBy;
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

	public Set<ReceiveItem> getItems() {
		return items;
	}

	public void setItems(Set<ReceiveItem> items) {
		this.items = items;
	}
	
	
	
}
