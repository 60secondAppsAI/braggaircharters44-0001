package com.braggaircharters44.dao;

import java.util.List;

import com.braggaircharters44.dao.GenericDAO;
import com.braggaircharters44.domain.Pilot;





public interface PilotDAO extends GenericDAO<Pilot, Integer> {
  
	List<Pilot> findAll();
	






}


