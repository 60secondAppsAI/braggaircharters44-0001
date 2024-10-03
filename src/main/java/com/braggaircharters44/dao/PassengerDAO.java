package com.braggaircharters44.dao;

import java.util.List;

import com.braggaircharters44.dao.GenericDAO;
import com.braggaircharters44.domain.Passenger;





public interface PassengerDAO extends GenericDAO<Passenger, Integer> {
  
	List<Passenger> findAll();
	






}


