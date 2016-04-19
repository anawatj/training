package com.tao.training.domain.summarize;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.attachment.Attachment;
import com.tao.training.domain.emumurate.FlagAfter;
import com.tao.training.domain.emumurate.FlagBefore;
import com.tao.training.domain.emumurate.FlagEvenronment;
import com.tao.training.domain.emumurate.FlagWork;
import com.tao.training.domain.evaluation.Evaluation;
import com.tao.training.domain.payment.Payment;
import com.tao.training.domain.training.TrainingDate;
@JsonInclude(Include.NON_NULL)
public class Summarize extends AbstractDomain<Long>{
		
	public Summarize()
	{
		
	}
    private Long trainingDateId;
    private TrainingDate trainingDateObj;
    private Attachment refAtchSignupSheet;
    private Attachment refAtchPicture;
    private Attachment refAtchOfficer;
    private Evaluation refAssessmentTx;
    private Payment refOtherPayment;
    private FlagBefore flagBefore01;
    private FlagBefore flagBefore02;
    private FlagBefore flagBefore03;
    private FlagBefore flagBefore04;
    private FlagBefore flagBefore05;
    private FlagBefore flagBefore06;
    private FlagBefore flagBefore07;
    private FlagBefore flagBefore08;
    private FlagBefore flagBefore09;
    private FlagBefore flagBefore10;
    private FlagBefore flagBefore11;
    private FlagBefore flagBefore12;
    private FlagWork flagWork01;
    private FlagWork flagWork02;
    private FlagWork flagWork03;
    private FlagWork flagWork04;
    private FlagWork flagWork05;
    private FlagWork flagWork06;
    private FlagWork flagWork07;
    private FlagWork flagWork08;
    private FlagEvenronment flagEnvironment01;
    private FlagEvenronment flagEnvironment02;
    private FlagEvenronment flagEnvironment03;
    private FlagEvenronment flagEnvironment04;
    private FlagEvenronment flagEnvironment05;
    private FlagEvenronment flagEnvironment06;
    private FlagEvenronment flagEnvironment07;
    private FlagEvenronment flagEnvironment08;
    private FlagEvenronment flagEnvironmentDetail;

    private FlagAfter flagAfter01;
    private FlagAfter flagAfter02;
    private FlagAfter flagAfter03;
    private FlagAfter flagAfter04;
    private FlagAfter flagAfter05;
    
    private Set<SummarizeLecturrer> lecturers;
    private Set<SummarizeEmployee> officers;
    private Set<SummarizeTrainee> trainees;
	public Long getTrainingDateId() {
		return trainingDateId;
	}
	public void setTrainingDateId(Long trainingDateId) {
		this.trainingDateId = trainingDateId;
	}
	public TrainingDate getTrainingDateObj() {
		return trainingDateObj;
	}
	public void setTrainingDateObj(TrainingDate trainingDateObj) {
		this.trainingDateObj = trainingDateObj;
	}
	public Attachment getRefAtchSignupSheet() {
		return refAtchSignupSheet;
	}
	public void setRefAtchSignupSheet(Attachment refAtchSignupSheet) {
		this.refAtchSignupSheet = refAtchSignupSheet;
	}
	public Attachment getRefAtchPicture() {
		return refAtchPicture;
	}
	public void setRefAtchPicture(Attachment refAtchPicture) {
		this.refAtchPicture = refAtchPicture;
	}
	public Attachment getRefAtchOfficer() {
		return refAtchOfficer;
	}
	public void setRefAtchOfficer(Attachment refAtchOfficer) {
		this.refAtchOfficer = refAtchOfficer;
	}
	public Evaluation getRefAssessmentTx() {
		return refAssessmentTx;
	}
	public void setRefAssessmentTx(Evaluation refAssessmentTx) {
		this.refAssessmentTx = refAssessmentTx;
	}
	public Payment getRefOtherPayment() {
		return refOtherPayment;
	}
	public void setRefOtherPayment(Payment refOtherPayment) {
		this.refOtherPayment = refOtherPayment;
	}
	public FlagBefore getFlagBefore01() {
		return flagBefore01;
	}
	public void setFlagBefore01(FlagBefore flagBefore01) {
		this.flagBefore01 = flagBefore01;
	}
	public FlagBefore getFlagBefore02() {
		return flagBefore02;
	}
	public void setFlagBefore02(FlagBefore flagBefore02) {
		this.flagBefore02 = flagBefore02;
	}
	public FlagBefore getFlagBefore03() {
		return flagBefore03;
	}
	public void setFlagBefore03(FlagBefore flagBefore03) {
		this.flagBefore03 = flagBefore03;
	}
	public FlagBefore getFlagBefore04() {
		return flagBefore04;
	}
	public void setFlagBefore04(FlagBefore flagBefore04) {
		this.flagBefore04 = flagBefore04;
	}
	public FlagBefore getFlagBefore05() {
		return flagBefore05;
	}
	public void setFlagBefore05(FlagBefore flagBefore05) {
		this.flagBefore05 = flagBefore05;
	}
	public FlagBefore getFlagBefore06() {
		return flagBefore06;
	}
	public void setFlagBefore06(FlagBefore flagBefore06) {
		this.flagBefore06 = flagBefore06;
	}
	public FlagBefore getFlagBefore07() {
		return flagBefore07;
	}
	public void setFlagBefore07(FlagBefore flagBefore07) {
		this.flagBefore07 = flagBefore07;
	}
	public FlagBefore getFlagBefore08() {
		return flagBefore08;
	}
	public void setFlagBefore08(FlagBefore flagBefore08) {
		this.flagBefore08 = flagBefore08;
	}
	public FlagBefore getFlagBefore09() {
		return flagBefore09;
	}
	public void setFlagBefore09(FlagBefore flagBefore09) {
		this.flagBefore09 = flagBefore09;
	}
	public FlagBefore getFlagBefore10() {
		return flagBefore10;
	}
	public void setFlagBefore10(FlagBefore flagBefore10) {
		this.flagBefore10 = flagBefore10;
	}
	public FlagBefore getFlagBefore11() {
		return flagBefore11;
	}
	public void setFlagBefore11(FlagBefore flagBefore11) {
		this.flagBefore11 = flagBefore11;
	}
	public FlagBefore getFlagBefore12() {
		return flagBefore12;
	}
	public void setFlagBefore12(FlagBefore flagBefore12) {
		this.flagBefore12 = flagBefore12;
	}
	public FlagWork getFlagWork01() {
		return flagWork01;
	}
	public void setFlagWork01(FlagWork flagWork01) {
		this.flagWork01 = flagWork01;
	}
	public FlagWork getFlagWork02() {
		return flagWork02;
	}
	public void setFlagWork02(FlagWork flagWork02) {
		this.flagWork02 = flagWork02;
	}
	public FlagWork getFlagWork03() {
		return flagWork03;
	}
	public void setFlagWork03(FlagWork flagWork03) {
		this.flagWork03 = flagWork03;
	}
	public FlagWork getFlagWork04() {
		return flagWork04;
	}
	public void setFlagWork04(FlagWork flagWork04) {
		this.flagWork04 = flagWork04;
	}
	public FlagWork getFlagWork05() {
		return flagWork05;
	}
	public void setFlagWork05(FlagWork flagWork05) {
		this.flagWork05 = flagWork05;
	}
	public FlagWork getFlagWork06() {
		return flagWork06;
	}
	public void setFlagWork06(FlagWork flagWork06) {
		this.flagWork06 = flagWork06;
	}
	public FlagWork getFlagWork07() {
		return flagWork07;
	}
	public void setFlagWork07(FlagWork flagWork07) {
		this.flagWork07 = flagWork07;
	}
	public FlagWork getFlagWork08() {
		return flagWork08;
	}
	public void setFlagWork08(FlagWork flagWork08) {
		this.flagWork08 = flagWork08;
	}
	public FlagEvenronment getFlagEnvironment01() {
		return flagEnvironment01;
	}
	public void setFlagEnvironment01(FlagEvenronment flagEnvironment01) {
		this.flagEnvironment01 = flagEnvironment01;
	}
	public FlagEvenronment getFlagEnvironment02() {
		return flagEnvironment02;
	}
	public void setFlagEnvironment02(FlagEvenronment flagEnvironment02) {
		this.flagEnvironment02 = flagEnvironment02;
	}
	public FlagEvenronment getFlagEnvironment03() {
		return flagEnvironment03;
	}
	public void setFlagEnvironment03(FlagEvenronment flagEnvironment03) {
		this.flagEnvironment03 = flagEnvironment03;
	}
	public FlagEvenronment getFlagEnvironment04() {
		return flagEnvironment04;
	}
	public void setFlagEnvironment04(FlagEvenronment flagEnvironment04) {
		this.flagEnvironment04 = flagEnvironment04;
	}
	public FlagEvenronment getFlagEnvironment05() {
		return flagEnvironment05;
	}
	public void setFlagEnvironment05(FlagEvenronment flagEnvironment05) {
		this.flagEnvironment05 = flagEnvironment05;
	}
	public FlagEvenronment getFlagEnvironment06() {
		return flagEnvironment06;
	}
	public void setFlagEnvironment06(FlagEvenronment flagEnvironment06) {
		this.flagEnvironment06 = flagEnvironment06;
	}
	public FlagEvenronment getFlagEnvironment07() {
		return flagEnvironment07;
	}
	public void setFlagEnvironment07(FlagEvenronment flagEnvironment07) {
		this.flagEnvironment07 = flagEnvironment07;
	}
	public FlagEvenronment getFlagEnvironment08() {
		return flagEnvironment08;
	}
	public void setFlagEnvironment08(FlagEvenronment flagEnvironment08) {
		this.flagEnvironment08 = flagEnvironment08;
	}
	public FlagEvenronment getFlagEnvironmentDetail() {
		return flagEnvironmentDetail;
	}
	public void setFlagEnvironmentDetail(FlagEvenronment flagEnvironmentDetail) {
		this.flagEnvironmentDetail = flagEnvironmentDetail;
	}
	public FlagAfter getFlagAfter01() {
		return flagAfter01;
	}
	public void setFlagAfter01(FlagAfter flagAfter01) {
		this.flagAfter01 = flagAfter01;
	}
	public FlagAfter getFlagAfter02() {
		return flagAfter02;
	}
	public void setFlagAfter02(FlagAfter flagAfter02) {
		this.flagAfter02 = flagAfter02;
	}
	public FlagAfter getFlagAfter03() {
		return flagAfter03;
	}
	public void setFlagAfter03(FlagAfter flagAfter03) {
		this.flagAfter03 = flagAfter03;
	}
	public FlagAfter getFlagAfter04() {
		return flagAfter04;
	}
	public void setFlagAfter04(FlagAfter flagAfter04) {
		this.flagAfter04 = flagAfter04;
	}
	public FlagAfter getFlagAfter05() {
		return flagAfter05;
	}
	public void setFlagAfter05(FlagAfter flagAfter05) {
		this.flagAfter05 = flagAfter05;
	}
	public Set<SummarizeLecturrer> getLecturers() {
		return lecturers;
	}
	public void setLecturers(Set<SummarizeLecturrer> lecturers) {
		this.lecturers = lecturers;
	}
	public Set<SummarizeEmployee> getOfficers() {
		return officers;
	}
	public void setOfficers(Set<SummarizeEmployee> officers) {
		this.officers = officers;
	}
	public Set<SummarizeTrainee> getTrainees() {
		return trainees;
	}
	public void setTrainees(Set<SummarizeTrainee> trainees) {
		this.trainees = trainees;
	}
}
