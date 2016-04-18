package com.tao.training.domain.attachment;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.master.Department;
import com.tao.training.domain.master.DocStatus;
import com.tao.training.domain.master.Position;
import com.tao.training.domain.person.Employee;
@JsonInclude(Include.NON_NULL)
public class Attachment extends AbstractDomain<Long>{

	
	public Attachment()
	{
		
		
	}
	private String attachmentCode;
	private Date attachmentDate;
	private DocStatus attachmentStatus;
	private String attachmentNote;
	private Employee attachmentBy;
	private Department department;
	private Position position;
	private Set<AttachmentItem> items;
	public Set<AttachmentItem> getItems() {
		return items;
	}
	public void setItems(Set<AttachmentItem> items) {
		this.items = items;
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
	public String getAttachmentCode() {
		return attachmentCode;
	}
	public void setAttachmentCode(String attachmentCode) {
		this.attachmentCode = attachmentCode;
	}
	public Date getAttachmentDate() {
		return attachmentDate;
	}
	public void setAttachmentDate(Date attachmentDate) {
		this.attachmentDate = attachmentDate;
	}
	public DocStatus getAttachmentStatus() {
		return attachmentStatus;
	}
	public void setAttachmentStatus(DocStatus attachmentStatus) {
		this.attachmentStatus = attachmentStatus;
	}
	public String getAttachmentNote() {
		return attachmentNote;
	}
	public void setAttachmentNote(String attachmentNote) {
		this.attachmentNote = attachmentNote;
	}
	public Employee getAttachmentBy() {
		return attachmentBy;
	}
	public void setAttachmentBy(Employee attachmentBy) {
		this.attachmentBy = attachmentBy;
	}
	
	
}
