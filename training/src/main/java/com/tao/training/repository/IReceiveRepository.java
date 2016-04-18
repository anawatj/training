package com.tao.training.repository;

import com.tao.training.domain.Result;
import com.tao.training.domain.receive.Receive;

public interface IReceiveRepository extends Repository<Receive,Long>{

	
	
		@Override
		Result<Receive> findAll() throws Exception;
		
		@Override
		Receive findById(Long id) throws Exception;
		
		@Override
		void remove(Long id) throws Exception;
		
		@Override
		Receive save(Receive entity) throws Exception;
		
}
