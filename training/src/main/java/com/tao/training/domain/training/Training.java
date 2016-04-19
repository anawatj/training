package com.tao.training.domain.training;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.attachment.Attachment;
import com.tao.training.domain.master.CourseType;
import com.tao.training.domain.master.Department;
import com.tao.training.domain.master.DocStatus;
import com.tao.training.domain.master.Position;
import com.tao.training.domain.person.Employee;
import com.tao.training.domain.quotation.Quotation;
@JsonInclude(Include.NON_NULL)
public class Training extends AbstractDomain<Long>{

	
	public Training()
	{
		
	}
	private String trainingTxCode;
	private String trainingTxNote;
	private Date trainingTxDate;
	private Employee trainingTxBy;
	private DocStatus trainingTxStatus;
	private CourseType courseType;
	private Quotation quotation;
	private Department department;
	private Position position;
	private Attachment attachment1;
	private Attachment attachment2;
	private Attachment attachment3;
	
	private String objective;
	private String remark;
	
	
	private Set<TrainingDate> dates;
	private Set<TrainingSchedule> schedules;
	
	private Set<Trainee> trainees;

	public String getTrainingTxCode() {
		return trainingTxCode;
	}

	public void setTrainingTxCode(String trainingTxCode) {
		this.trainingTxCode = trainingTxCode;
	}

	public String getTrainingTxNote() {
		return trainingTxNote;
	}

	public void setTrainingTxNote(String trainingTxNote) {
		this.trainingTxNote = trainingTxNote;
	}

	public Date getTrainingTxDate() {
		return trainingTxDate;
	}

	public void setTrainingTxDate(Date trainingTxDate) {
		this.trainingTxDate = trainingTxDate;
	}

	public Employee getTrainingTxBy() {
		return trainingTxBy;
	}

	public void setTrainingTxBy(Employee trainingTxBy) {
		this.trainingTxBy = trainingTxBy;
	}

	public DocStatus getTrainingTxStatus() {
		return trainingTxStatus;
	}

	public void setTrainingTxStatus(DocStatus trainingTxStatus) {
		this.trainingTxStatus = trainingTxStatus;
	}

	public CourseType getCourseType() {
		return courseType;
	}

	public void setCourseType(CourseType courseType) {
		this.courseType = courseType;
	}

	public Quotation getQuotation() {
		return quotation;
	}

	public void setQuotation(Quotation quotation) {
		this.quotation = quotation;
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

	public Attachment getAttachment1() {
		return attachment1;
	}

	public void setAttachment1(Attachment attachment1) {
		this.attachment1 = attachment1;
	}

	public Attachment getAttachment2() {
		return attachment2;
	}

	public void setAttachment2(Attachment attachment2) {
		this.attachment2 = attachment2;
	}

	public Attachment getAttachment3() {
		return attachment3;
	}

	public void setAttachment3(Attachment attachment3) {
		this.attachment3 = attachment3;
	}

	public String getObjective() {
		return objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set<TrainingDate> getDates() {
		return dates;
	}

	public void setDates(Set<TrainingDate> dates) {
		this.dates = dates;
	}

	public Set<TrainingSchedule> getSchedules() {
		return schedules;
	}

	public void setSchedules(Set<TrainingSchedule> schedules) {
		this.schedules = schedules;
	}

	public Set<Trainee> getTrainees() {
		return trainees;
	}

	public void setTrainees(Set<Trainee> trainees) {
		this.trainees = trainees;
	}
	
	
	
}
