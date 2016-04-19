package com.tao.training.domain.summarize;

import com.tao.training.domain.person.Member;
import com.tao.training.domain.training.Training;

public class TraineeDiploma {
	private String diplomaNo;
	private Member traineeBp;
	private Training training;
	public String getDiplomaNo() {
		return diplomaNo;
	}
	public void setDiplomaNo(String diplomaNo) {
		this.diplomaNo = diplomaNo;
	}
	public Member getTraineeBp() {
		return traineeBp;
	}
	public void setTraineeBp(Member traineeBp) {
		this.traineeBp = traineeBp;
	}
	public Training getTraining() {
		return training;
	}
	public void setTraining(Training training) {
		this.training = training;
	}
}
