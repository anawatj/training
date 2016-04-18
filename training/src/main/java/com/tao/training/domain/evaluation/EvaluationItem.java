package com.tao.training.domain.evaluation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.master.EvaluationTopic;
@JsonInclude(Include.NON_NULL)
public class EvaluationItem extends AbstractDomain<Long> {
	
		public EvaluationItem()
		{
			
		}
		private Long evaluationId;
		private EvaluationTopic evaluationTopic;
		private Integer group1Amt;
		private Integer group2Amt;
		private Integer group3Amt;
		private Integer group4Amt;
		private Integer group5Amt;
		private Integer group6Amt;
		private Integer group7Amt;
		private Integer group8Amt;
		private Integer group9Amt;
		private Integer group10Amt;
		private Double totalScore;
		private Double avgScore;
		private Double standardDevition;
		private boolean selected;
		public Long getEvaluationId() {
			return evaluationId;
		}
		public void setEvaluationId(Long evaluationId) {
			this.evaluationId = evaluationId;
		}
		public EvaluationTopic getEvaluationTopic() {
			return evaluationTopic;
		}
		public void setEvaluationTopic(EvaluationTopic evaluationTopic) {
			this.evaluationTopic = evaluationTopic;
		}
		public Integer getGroup1Amt() {
			return group1Amt;
		}
		public void setGroup1Amt(Integer group1Amt) {
			this.group1Amt = group1Amt;
		}
		public Integer getGroup2Amt() {
			return group2Amt;
		}
		public void setGroup2Amt(Integer group2Amt) {
			this.group2Amt = group2Amt;
		}
		public Integer getGroup3Amt() {
			return group3Amt;
		}
		public void setGroup3Amt(Integer group3Amt) {
			this.group3Amt = group3Amt;
		}
		public Integer getGroup4Amt() {
			return group4Amt;
		}
		public void setGroup4Amt(Integer group4Amt) {
			this.group4Amt = group4Amt;
		}
		public Integer getGroup5Amt() {
			return group5Amt;
		}
		public void setGroup5Amt(Integer group5Amt) {
			this.group5Amt = group5Amt;
		}
		public Integer getGroup6Amt() {
			return group6Amt;
		}
		public void setGroup6Amt(Integer group6Amt) {
			this.group6Amt = group6Amt;
		}
		public Integer getGroup7Amt() {
			return group7Amt;
		}
		public void setGroup7Amt(Integer group7Amt) {
			this.group7Amt = group7Amt;
		}
		public Integer getGroup8Amt() {
			return group8Amt;
		}
		public void setGroup8Amt(Integer group8Amt) {
			this.group8Amt = group8Amt;
		}
		public Integer getGroup9Amt() {
			return group9Amt;
		}
		public void setGroup9Amt(Integer group9Amt) {
			this.group9Amt = group9Amt;
		}
		public Integer getGroup10Amt() {
			return group10Amt;
		}
		public void setGroup10Amt(Integer group10Amt) {
			this.group10Amt = group10Amt;
		}
		public Double getTotalScore() {
			return totalScore;
		}
		public void setTotalScore(Double totalScore) {
			this.totalScore = totalScore;
		}
		public Double getAvgScore() {
			return avgScore;
		}
		public void setAvgScore(Double avgScore) {
			this.avgScore = avgScore;
		}
		public Double getStandardDevition() {
			return standardDevition;
		}
		public void setStandardDevition(Double standardDevition) {
			this.standardDevition = standardDevition;
		}
		public boolean getSelected() {
			return selected;
		}
		public void setSelected(boolean selected) {
			this.selected = selected;
		}

}
