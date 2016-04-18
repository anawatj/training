package com.tao.training.repository;

import com.tao.training.domain.Result;
import com.tao.training.domain.reservation.Reservation;

public interface IReservationRepository extends Repository<Reservation, Long> {
	
	@Override
	Result<Reservation> findAll() throws Exception;
	
	@Override
	Reservation findById(Long id) throws Exception;
	
	@Override
	void remove(Long id) throws Exception;
	
	@Override
	Reservation save(Reservation entity) throws Exception;

}
