package com.tao.training.domain.prospect;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.course.Course;
import com.tao.training.domain.emumurate.FlagAfternoon;
import com.tao.training.domain.emumurate.FlagInHouse;
import com.tao.training.domain.emumurate.FlagMorring;
import com.tao.training.domain.emumurate.FlagOutdoor;
import com.tao.training.domain.emumurate.FlagType;
import com.tao.training.domain.master.CourseType;
import com.tao.training.domain.master.DocStatus;
import com.tao.training.domain.person.BusinessPartner;
import com.tao.training.domain.person.Employee;
import com.tao.training.domain.person.Member;

@JsonInclude(Include.NON_NULL)
public class Prospect extends AbstractDomain<Long>{
	
	public Prospect()
	{
		
	}
	private String prospectCode;
	private Date prospectDate;
	private String prospectTime;
	private DocStatus prospectStatus;
	private String prospectNote;
	private Employee prospectBy;
	private CourseType courseType;
	private Member customer;
	private Course interestCourse1;
	private Course interestCourse2;
	private Course interestCourse3;
	private Course interestCourse4;
	private String objective1;
	private String objective2;
	private String objective3;
	private String objective4;
	private BusinessPartner interestLacturer1;
	private BusinessPartner interestLacturer2;
	private BusinessPartner interestLacturer3;
	private BusinessPartner interestLacturer4;
	
	private FlagMorring flagMorring;
	private FlagAfternoon flagAfternoon;
	
	
	private FlagInHouse inhouse;
	private FlagOutdoor outdoor;
	
	
	private FlagType primary;
	private FlagType secondary;
	private FlagType factory;
	private FlagType office;
	private FlagType student;
	
	

	
	
	private Set<ProspectTrainee> trainees;
	
	
	private Integer maleAmt;
	private Integer fmaleAmt;
	private Integer total;


	public Integer getMaleAmt() {
		return maleAmt;
	}


	public void setMaleAmt(Integer maleAmt) {
		this.maleAmt = maleAmt;
	}


	public Integer getFmaleAmt() {
		return fmaleAmt;
	}


	public void setFmaleAmt(Integer fmaleAmt) {
		this.fmaleAmt = fmaleAmt;
	}


	public Integer getTotal() {
		return total;
	}


	public void setTotal(Integer total) {
		this.total = total;
	}


	public String getProspectCode() {
		return prospectCode;
	}


	public void setProspectCode(String prospectCode) {
		this.prospectCode = prospectCode;
	}


	public Date getProspectDate() {
		return prospectDate;
	}


	public void setProspectDate(Date prospectDate) {
		this.prospectDate = prospectDate;
	}


	public String getProspectTime() {
		return prospectTime;
	}


	public void setProspectTime(String prospectTime) {
		this.prospectTime = prospectTime;
	}


	public DocStatus getProspectStatus() {
		return prospectStatus;
	}


	public void setProspectStatus(DocStatus prospectStatus) {
		this.prospectStatus = prospectStatus;
	}


	public String getProspectNote() {
		return prospectNote;
	}


	public void setProspectNote(String prospectNote) {
		this.prospectNote = prospectNote;
	}


	public Employee getProspectBy() {
		return prospectBy;
	}


	public void setProspectBy(Employee prospectBy) {
		this.prospectBy = prospectBy;
	}


	public CourseType getCourseType() {
		return courseType;
	}


	public void setCourseType(CourseType courseType) {
		this.courseType = courseType;
	}


	public Member getCustomer() {
		return customer;
	}


	public void setCustomer(Member customer) {
		this.customer = customer;
	}


	public Course getInterestCourse1() {
		return interestCourse1;
	}


	public void setInterestCourse1(Course interestCourse1) {
		this.interestCourse1 = interestCourse1;
	}


	public Course getInterestCourse2() {
		return interestCourse2;
	}


	public void setInterestCourse2(Course interestCourse2) {
		this.interestCourse2 = interestCourse2;
	}


	public Course getInterestCourse3() {
		return interestCourse3;
	}


	public void setInterestCourse3(Course interestCourse3) {
		this.interestCourse3 = interestCourse3;
	}


	public Course getInterestCourse4() {
		return interestCourse4;
	}


	public void setInterestCourse4(Course interestCourse4) {
		this.interestCourse4 = interestCourse4;
	}


	public String getObjective1() {
		return objective1;
	}


	public void setObjective1(String objective1) {
		this.objective1 = objective1;
	}


	public String getObjective2() {
		return objective2;
	}


	public void setObjective2(String objective2) {
		this.objective2 = objective2;
	}


	public String getObjective3() {
		return objective3;
	}


	public void setObjective3(String objective3) {
		this.objective3 = objective3;
	}


	public String getObjective4() {
		return objective4;
	}


	public void setObjective4(String objective4) {
		this.objective4 = objective4;
	}


	public BusinessPartner getInterestLacturer1() {
		return interestLacturer1;
	}


	public void setInterestLacturer1(BusinessPartner interestLacturer1) {
		this.interestLacturer1 = interestLacturer1;
	}


	public BusinessPartner getInterestLacturer2() {
		return interestLacturer2;
	}


	public void setInterestLacturer2(BusinessPartner interestLacturer2) {
		this.interestLacturer2 = interestLacturer2;
	}


	public BusinessPartner getInterestLacturer3() {
		return interestLacturer3;
	}


	public void setInterestLacturer3(BusinessPartner interestLacturer3) {
		this.interestLacturer3 = interestLacturer3;
	}


	public BusinessPartner getInterestLacturer4() {
		return interestLacturer4;
	}


	public void setInterestLacturer4(BusinessPartner interestLacturer4) {
		this.interestLacturer4 = interestLacturer4;
	}


	public FlagMorring getFlagMorring() {
		return flagMorring;
	}


	public void setFlagMorring(FlagMorring flagMorring) {
		this.flagMorring = flagMorring;
	}


	public FlagAfternoon getFlagAfternoon() {
		return flagAfternoon;
	}


	public void setFlagAfternoon(FlagAfternoon flagAfternoon) {
		this.flagAfternoon = flagAfternoon;
	}


	public FlagInHouse getInhouse() {
		return inhouse;
	}


	public void setInhouse(FlagInHouse inhouse) {
		this.inhouse = inhouse;
	}


	public FlagOutdoor getOutdoor() {
		return outdoor;
	}


	public void setOutdoor(FlagOutdoor outdoor) {
		this.outdoor = outdoor;
	}


	public FlagType getPrimary() {
		return primary;
	}


	public void setPrimary(FlagType primary) {
		this.primary = primary;
	}


	public FlagType getSecondary() {
		return secondary;
	}


	public void setSecondary(FlagType secondary) {
		this.secondary = secondary;
	}


	public FlagType getFactory() {
		return factory;
	}


	public void setFactory(FlagType factory) {
		this.factory = factory;
	}


	public FlagType getOffice() {
		return office;
	}


	public void setOffice(FlagType office) {
		this.office = office;
	}


	public FlagType getStudent() {
		return student;
	}


	public void setStudent(FlagType student) {
		this.student = student;
	}


	public Set<ProspectTrainee> getTrainees() {
		return trainees;
	}


	public void setTrainees(Set<ProspectTrainee> trainees) {
		this.trainees = trainees;
	}
	
	
	

	
	
}
