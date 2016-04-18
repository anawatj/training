package com.tao.training.repository;

import com.tao.training.domain.Result;
import com.tao.training.domain.security.User;

public interface IUserRepository extends Repository<User,Long> {

	
	@Override
	Result<User> findAll() throws Exception;
	
	@Override
	User findById(Long id) throws Exception;
	
	@Override
	void remove(Long id) throws Exception;
	
	@Override
	User save(User entity) throws Exception;
}
