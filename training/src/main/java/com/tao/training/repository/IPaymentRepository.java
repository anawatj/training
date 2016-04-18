package com.tao.training.repository;

import com.tao.training.domain.Result;
import com.tao.training.domain.payment.Payment;

public interface IPaymentRepository extends Repository<Payment,Long>{

	
			@Override
			Result<Payment> findAll() throws Exception;
			
			@Override
			Payment findById(Long id) throws Exception;
			
			
			@Override
			void remove(Long id) throws Exception;
			
			
			@Override
			Payment save(Payment entity) throws Exception;
			
}
