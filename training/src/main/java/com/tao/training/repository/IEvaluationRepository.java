package com.tao.training.repository;

import com.tao.training.domain.Result;
import com.tao.training.domain.evaluation.Evaluation;

public interface IEvaluationRepository extends Repository<Evaluation,Long> {
	
	@Override
	Result<Evaluation> findAll() throws Exception;
	
	@Override
	Evaluation findById(Long id) throws Exception;
	
	@Override
	void remove(Long id) throws Exception;
	
	@Override
	Evaluation save(Evaluation entity) throws Exception;

}
