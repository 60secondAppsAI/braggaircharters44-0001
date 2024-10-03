package com.braggaircharters44.dao;

import java.util.List;

import com.braggaircharters44.dao.GenericDAO;
import com.braggaircharters44.domain.Aircraft;





public interface AircraftDAO extends GenericDAO<Aircraft, Integer> {
  
	List<Aircraft> findAll();
	






}


