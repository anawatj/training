package com.tao.training.domain.reservation;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.emumurate.FlagHuman;
import com.tao.training.domain.emumurate.FlagResourceCat;
import com.tao.training.domain.emumurate.FlagResourceType;
import com.tao.training.domain.master.Department;
import com.tao.training.domain.master.DocStatus;
import com.tao.training.domain.master.Position;
import com.tao.training.domain.person.Employee;
@JsonInclude(Include.NON_NULL)
public class Reservation extends AbstractDomain<Long>{
		
	public Reservation()
	{
		
	}
	private String reservationCode;
	private Date   reservationDate;
	private String reservationTime;
	private String reservationNote;
	private Employee reservationBy;
	private DocStatus reservationStatus;
	private Department department;
	private Position position;
	private FlagHuman flagHuman;
	private FlagResourceType flagResourceType;
	private String jobNo;
	private String jobDesc;
	private String course;
	private Integer traineeAmt;
	private  String workPlace;
	private String remark;
	private FlagResourceCat flagResourceCat;
	private Employee approver;
	private String resourceDetail;
	private Set<ReservationItem> items;
	public String getReservationCode() {
		return reservationCode;
	}
	public void setReservationCode(String reservationCode) {
		this.reservationCode = reservationCode;
	}
	public Date getReservationDate() {
		return reservationDate;
	}
	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}
	public String getReservationTime() {
		return reservationTime;
	}
	public void setReservationTime(String reservationTime) {
		this.reservationTime = reservationTime;
	}
	public String getReservationNote() {
		return reservationNote;
	}
	public void setReservationNote(String reservationNote) {
		this.reservationNote = reservationNote;
	}
	public Employee getReservationBy() {
		return reservationBy;
	}
	public void setReservationBy(Employee reservationBy) {
		this.reservationBy = reservationBy;
	}
	public DocStatus getReservationStatus() {
		return reservationStatus;
	}
	public void setReservationStatus(DocStatus reservationStatus) {
		this.reservationStatus = reservationStatus;
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
	public FlagHuman getFlagHuman() {
		return flagHuman;
	}
	public void setFlagHuman(FlagHuman flagHuman) {
		this.flagHuman = flagHuman;
	}
	public FlagResourceType getFlagResourceType() {
		return flagResourceType;
	}
	public void setFlagResourceType(FlagResourceType flagResourceType) {
		this.flagResourceType = flagResourceType;
	}
	public String getJobNo() {
		return jobNo;
	}
	public void setJobNo(String jobNo) {
		this.jobNo = jobNo;
	}
	public String getJobDesc() {
		return jobDesc;
	}
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Integer getTraineeAmt() {
		return traineeAmt;
	}
	public void setTraineeAmt(Integer traineeAmt) {
		this.traineeAmt = traineeAmt;
	}
	public String getWorkPlace() {
		return workPlace;
	}
	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public FlagResourceCat getFlagResourceCat() {
		return flagResourceCat;
	}
	public void setFlagResourceCat(FlagResourceCat flagResourceCat) {
		this.flagResourceCat = flagResourceCat;
	}
	public Employee getApprover() {
		return approver;
	}
	public void setApprover(Employee approver) {
		this.approver = approver;
	}
	public String getResourceDetail() {
		return resourceDetail;
	}
	public void setResourceDetail(String resourceDetail) {
		this.resourceDetail = resourceDetail;
	}
	public Set<ReservationItem> getItems() {
		return items;
	}
	public void setItems(Set<ReservationItem> items) {
		this.items = items;
	}
	
	
}
