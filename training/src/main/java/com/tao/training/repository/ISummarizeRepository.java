package com.tao.training.repository;

import com.tao.training.domain.Result;
import com.tao.training.domain.summarize.Summarize;

public interface ISummarizeRepository extends Repository<Summarize,Long> {

			@Override
			Result<Summarize> findAll() throws Exception;
			
			@Override
			Summarize findById(Long id) throws Exception;
			
			@Override
			void remove(Long id) throws Exception;
			
			@Override
			Summarize save(Summarize entity) throws Exception;
}
