package com.tao.training.repository;

import com.tao.training.domain.Result;
import com.tao.training.domain.person.Employee;

public interface IEmployeeRepository extends Repository<Employee, Long> {
	
	@Override
	Result<Employee> findAll() throws Exception;
	
	@Override
	Employee findById(Long id) throws Exception;
	
	@Override
	void remove(Long id) throws Exception;
	
	@Override
	Employee save(Employee entity) throws Exception;
}
