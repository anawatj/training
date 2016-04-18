package com.tao.training.domain.prospect;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.training.domain.AbstractDomain;
import com.tao.training.domain.course.Course;
import com.tao.training.domain.master.CourseType;
import com.tao.training.domain.master.DocStatus;
import com.tao.training.domain.person.Employee;
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
	private Course interestCourse1;
	private Course interestCourse2;
	
	
}
