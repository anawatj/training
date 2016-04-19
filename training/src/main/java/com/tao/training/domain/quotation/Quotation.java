package com.tao.training.domain.quotation;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.attachment.Attachment;
import com.tao.training.domain.course.Course;
import com.tao.training.domain.emumurate.FlagVat;
import com.tao.training.domain.emumurate.ServiceType;
import com.tao.training.domain.master.CourseType;
import com.tao.training.domain.master.Department;
import com.tao.training.domain.master.DocStatus;
import com.tao.training.domain.master.PaymentMethod;
import com.tao.training.domain.master.PaymentType;
import com.tao.training.domain.master.Position;
import com.tao.training.domain.person.BusinessPartner;
import com.tao.training.domain.person.Employee;
import com.tao.training.domain.person.Member;
import com.tao.training.domain.prospect.Prospect;
@JsonInclude(Include.NON_NULL)
public class Quotation extends AbstractDomain<Long> {
		
	public Quotation()
	{
		
	}
	private String quotationCode;
	private Date quotationDate;
	private DocStatus quotationStatus;
	private String quotationNote;
	private Employee quotationBy;
	private Prospect prospect;
	private CourseType courseType;
	private Course course;
	private ServiceType serviceType;
	private Double trainingAmt;
	private Double vatAmt;
	private Department department;
	private Position position;
	private PaymentMethod paymentMethod;
	private PaymentType paymentType;
	private Member customer;
	
	private String payeeName;
	private Attachment pictureAttachment;
	private Attachment fileAttachment;
	
	private Attachment otherAttachment1;
	private Attachment otherAttachment2;
	private Attachment otherAttachment3;
	
	private Set<QuotationItem> items;
	private Set<QuotationTrainee> trainees;
	public String getQuotationCode() {
		return quotationCode;
	}
	public void setQuotationCode(String quotationCode) {
		this.quotationCode = quotationCode;
	}
	public Date getQuotationDate() {
		return quotationDate;
	}
	public void setQuotationDate(Date quotationDate) {
		this.quotationDate = quotationDate;
	}
	public DocStatus getQuotationStatus() {
		return quotationStatus;
	}
	public void setQuotationStatus(DocStatus quotationStatus) {
		this.quotationStatus = quotationStatus;
	}
	public String getQuotationNote() {
		return quotationNote;
	}
	public void setQuotationNote(String quotationNote) {
		this.quotationNote = quotationNote;
	}
	public Employee getQuotationBy() {
		return quotationBy;
	}
	public void setQuotationBy(Employee quotationBy) {
		this.quotationBy = quotationBy;
	}
	public Prospect getProspect() {
		return prospect;
	}
	public void setProspect(Prospect prospect) {
		this.prospect = prospect;
	}
	public CourseType getCourseType() {
		return courseType;
	}
	public void setCourseType(CourseType courseType) {
		this.courseType = courseType;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public ServiceType getServiceType() {
		return serviceType;
	}
	public void setServiceType(ServiceType serviceType) {
		this.serviceType = serviceType;
	}
	public Double getTrainingAmt() {
		return trainingAmt;
	}
	public void setTrainingAmt(Double trainingAmt) {
		this.trainingAmt = trainingAmt;
	}
	public Double getVatAmt() {
		return vatAmt;
	}
	public void setVatAmt(Double vatAmt) {
		this.vatAmt = vatAmt;
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
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public PaymentType getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}
	public Member getCustomer() {
		return customer;
	}
	public void setCustomer(Member customer) {
		this.customer = customer;
	}
	public String getPayeeName() {
		return payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}
	public Attachment getPictureAttachment() {
		return pictureAttachment;
	}
	public void setPictureAttachment(Attachment pictureAttachment) {
		this.pictureAttachment = pictureAttachment;
	}
	public Attachment getFileAttachment() {
		return fileAttachment;
	}
	public void setFileAttachment(Attachment fileAttachment) {
		this.fileAttachment = fileAttachment;
	}
	public Attachment getOtherAttachment1() {
		return otherAttachment1;
	}
	public void setOtherAttachment1(Attachment otherAttachment1) {
		this.otherAttachment1 = otherAttachment1;
	}
	public Attachment getOtherAttachment2() {
		return otherAttachment2;
	}
	public void setOtherAttachment2(Attachment otherAttachment2) {
		this.otherAttachment2 = otherAttachment2;
	}
	public Attachment getOtherAttachment3() {
		return otherAttachment3;
	}
	public void setOtherAttachment3(Attachment otherAttachment3) {
		this.otherAttachment3 = otherAttachment3;
	}
	public Set<QuotationItem> getItems() {
		return items;
	}
	public void setItems(Set<QuotationItem> items) {
		this.items = items;
	}
	public Set<QuotationTrainee> getTrainees() {
		return trainees;
	}
	public void setTrainees(Set<QuotationTrainee> trainees) {
		this.trainees = trainees;
	}
	
	
	
	
}
