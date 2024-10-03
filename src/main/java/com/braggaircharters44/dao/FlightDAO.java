package com.braggaircharters44.dao;

import java.util.List;

import com.braggaircharters44.dao.GenericDAO;
import com.braggaircharters44.domain.Flight;





public interface FlightDAO extends GenericDAO<Flight, Integer> {
  
	List<Flight> findAll();
	






}


