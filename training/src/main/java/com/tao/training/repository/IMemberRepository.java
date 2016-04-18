package com.tao.training.repository;

import com.tao.training.domain.Result;
import com.tao.training.domain.person.Member;

public interface IMemberRepository extends Repository<Member,Long> {

	
	@Override
	Result<Member> findAll() throws Exception;
	
	@Override
	Member findById(Long id) throws Exception;
	
	@Override
	void remove(Long id) throws Exception;
	
	@Override
	Member save(Member entity) throws Exception;
}
