package com.tao.training.repository;

import com.tao.training.domain.Result;
import com.tao.training.domain.course.Course;

public interface ICourseRepository extends Repository<Course,Long> {

	
	@Override
	Result<Course> findAll() throws Exception;
	
	
	@Override
	Course findById(Long id) throws Exception;
	
	
	@Override
	void remove(Long id) throws Exception;
	
	
	@Override
	Course save(Course entity) throws Exception;
}
