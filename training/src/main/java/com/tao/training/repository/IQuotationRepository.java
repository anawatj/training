package com.tao.training.repository;

import com.tao.training.domain.Result;
import com.tao.training.domain.quotation.Quotation;

public interface IQuotationRepository extends Repository<Quotation,Long> {

	
		@Override
		Result<Quotation> findAll() throws Exception;
		
		@Override
		Quotation findById(Long id) throws Exception;
		
		@Override
		void remove(Long id) throws Exception;
		
		@Override
		Quotation save(Quotation entity) throws Exception;
}
