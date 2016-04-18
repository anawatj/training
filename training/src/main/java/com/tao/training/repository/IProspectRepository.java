package com.tao.training.repository;

import com.tao.training.domain.Result;
import com.tao.training.domain.prospect.Prospect;

public interface IProspectRepository extends Repository<Prospect,Long> {

	
	@Override
	Result<Prospect> findAll() throws Exception;
	
	@Override
	Prospect findById(Long id) throws Exception;
	
	@Override
	void remove(Long id) throws Exception;
	
	@Override
	Prospect save(Prospect entity) throws Exception;
}
