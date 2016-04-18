package com.tao.training.repository;

import com.tao.training.domain.Result;
import com.tao.training.domain.security.Role;

public interface IRoleRepository extends Repository<Role,Long>{
		
	
	@Override
	Result<Role> findAll() throws Exception;
	
	@Override
	Role findById(Long id) throws Exception;
	
	@Override
	void remove(Long id) throws Exception;
	
	@Override
	Role save(Role entity) throws Exception;
}
