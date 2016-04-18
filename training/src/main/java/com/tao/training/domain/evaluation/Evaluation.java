package com.tao.training.domain.evaluation;

import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.attachment.Attachment;
import com.tao.training.domain.master.DocStatus;
import com.tao.training.domain.master.EvaluationType;
import com.tao.training.domain.person.Employee;
import com.tao.training.domain.person.Lecturer;
@JsonInclude(Include.NON_NULL)
public class Evaluation extends AbstractDomain<Long> {
		
	
		public Evaluation()
		{
			
		}
		private String evaluationCode;
		private Date   evaluationDate;
		private String evaluationTime;
		private DocStatus evaluationStatus;
		private Employee evaluationBy;
		private Lecturer evaluated;
		private Date evaluatedDate;
		private EvaluationType evaluationType;
		private Attachment attachment;
		private Set<EvaluationItem> items;
		private String evaluationNote;
		public String getEvaluationNote() {
			return evaluationNote;
		}
		public void setEvaluationNote(String evaluationNote) {
			this.evaluationNote = evaluationNote;
		}
		public String getEvaluationCode() {
			return evaluationCode;
		}
		public void setEvaluationCode(String evaluationCode) {
			this.evaluationCode = evaluationCode;
		}
		public Date getEvaluationDate() {
			return evaluationDate;
		}
		public void setEvaluationDate(Date evaluationDate) {
			this.evaluationDate = evaluationDate;
		}
		public String getEvaluationTime() {
			return evaluationTime;
		}
		public void setEvaluationTime(String evaluationTime) {
			this.evaluationTime = evaluationTime;
		}
		public DocStatus getEvaluationStatus() {
			return evaluationStatus;
		}
		public void setEvaluationStatus(DocStatus evaluationStatus) {
			this.evaluationStatus = evaluationStatus;
		}
		public Employee getEvaluationBy() {
			return evaluationBy;
		}
		public void setEvaluationBy(Employee evaluationBy) {
			this.evaluationBy = evaluationBy;
		}
		public Lecturer getEvaluated() {
			return evaluated;
		}
		public void setEvaluated(Lecturer evaluated) {
			this.evaluated = evaluated;
		}
		public Date getEvaluatedDate() {
			return evaluatedDate;
		}
		public void setEvaluatedDate(Date evaluatedDate) {
			this.evaluatedDate = evaluatedDate;
		}
		public EvaluationType getEvaluationType() {
			return evaluationType;
		}
		public void setEvaluationType(EvaluationType evaluationType) {
			this.evaluationType = evaluationType;
		}
		public Attachment getAttachment() {
			return attachment;
		}
		public void setAttachment(Attachment attachment) {
			this.attachment = attachment;
		}
		public Set<EvaluationItem> getItems() {
			return items;
		}
		public void setItems(Set<EvaluationItem> items) {
			this.items = items;
		}
		
}
