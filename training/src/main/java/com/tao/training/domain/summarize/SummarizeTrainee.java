package com.tao.training.domain.summarize;

import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.person.Member;

@JsonInclude(Include.NON_NULL)
public class SummarizeTrainee extends AbstractDomain<Long> {

	public SummarizeTrainee() {

	}

	private Long summarizeId;
	private Summarize summarizeObj;
	private String idCard;
	private String nameSurname;
	private Integer bookingNo;
	private Member traineeBp;
	private Member fromCompany;
	private String trainHour;
	private Integer preTest;
	private Integer postTest;
	private String flagGenDiploma;
	private TraineeDiploma traineeDiploma;
	private String flagIncludeCourse;
	private String flagExcludeCourse;
	private String jobNo;
	private String flagExtend;
	private boolean selected;
	private Set<SummarizeTraineeDiploma> diplomas;
	public Long getSummarizeId() {
		return summarizeId;
	}
	public void setSummarizeId(Long summarizeId) {
		this.summarizeId = summarizeId;
	}
	public Summarize getSummarizeObj() {
		return summarizeObj;
	}
	public void setSummarizeObj(Summarize summarizeObj) {
		this.summarizeObj = summarizeObj;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getNameSurname() {
		return nameSurname;
	}
	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}
	public Integer getBookingNo() {
		return bookingNo;
	}
	public void setBookingNo(Integer bookingNo) {
		this.bookingNo = bookingNo;
	}
	public Member getTraineeBp() {
		return traineeBp;
	}
	public void setTraineeBp(Member traineeBp) {
		this.traineeBp = traineeBp;
	}
	public Member getFromCompany() {
		return fromCompany;
	}
	public void setFromCompany(Member fromCompany) {
		this.fromCompany = fromCompany;
	}
	public String getTrainHour() {
		return trainHour;
	}
	public void setTrainHour(String trainHour) {
		this.trainHour = trainHour;
	}
	public Integer getPreTest() {
		return preTest;
	}
	public void setPreTest(Integer preTest) {
		this.preTest = preTest;
	}
	public Integer getPostTest() {
		return postTest;
	}
	public void setPostTest(Integer postTest) {
		this.postTest = postTest;
	}
	public String getFlagGenDiploma() {
		return flagGenDiploma;
	}
	public void setFlagGenDiploma(String flagGenDiploma) {
		this.flagGenDiploma = flagGenDiploma;
	}
	public TraineeDiploma getTraineeDiploma() {
		return traineeDiploma;
	}
	public void setTraineeDiploma(TraineeDiploma traineeDiploma) {
		this.traineeDiploma = traineeDiploma;
	}
	public String getFlagIncludeCourse() {
		return flagIncludeCourse;
	}
	public void setFlagIncludeCourse(String flagIncludeCourse) {
		this.flagIncludeCourse = flagIncludeCourse;
	}
	public String getFlagExcludeCourse() {
		return flagExcludeCourse;
	}
	public void setFlagExcludeCourse(String flagExcludeCourse) {
		this.flagExcludeCourse = flagExcludeCourse;
	}
	public String getJobNo() {
		return jobNo;
	}
	public void setJobNo(String jobNo) {
		this.jobNo = jobNo;
	}
	public String getFlagExtend() {
		return flagExtend;
	}
	public void setFlagExtend(String flagExtend) {
		this.flagExtend = flagExtend;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	public Set<SummarizeTraineeDiploma> getDiplomas() {
		return diplomas;
	}
	public void setDiplomas(Set<SummarizeTraineeDiploma> diplomas) {
		this.diplomas = diplomas;
	}
}
