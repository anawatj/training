package com.tao.training.repository;

import com.tao.training.domain.Result;
import com.tao.training.domain.person.Lecturer;

public interface ILecturerRepository  extends Repository<Lecturer,Long>{

	@Override
	Result<Lecturer> findAll() throws Exception;
	
	@Override
	Lecturer findById(Long id) throws Exception;
	
	@Override
	void remove(Long id) throws Exception;
	
	@Override
	Lecturer save(Lecturer entity) throws Exception;
}
