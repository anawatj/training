package com.tao.training.repository;

import java.io.Serializable;

import com.tao.training.domain.IDomain;
import com.tao.training.domain.Result;

public interface Repository<E extends IDomain<K>,K extends Serializable> {
		
	
	public Result<E> findAll() throws Exception;
	public E findById(K id) throws Exception;
	public E save(E entity) throws Exception;
	public void remove(K id) throws Exception;
	
	
}
