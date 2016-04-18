package com.tao.training.repository;

import com.tao.training.domain.Result;
import com.tao.training.domain.train.Training;

public interface ITrainingRepository extends Repository<Training,Long> {

	
		@Override
		Result<Training> findAll() throws Exception;
		@Override
		void remove(Long id) throws Exception;
		@Override
		Training findById(Long id) throws Exception;
		@Override
		Training save(Training entity) throws Exception;
}
