package com.braggaircharters44.dao;

import java.util.List;

import com.braggaircharters44.dao.GenericDAO;
import com.braggaircharters44.domain.Crew;





public interface CrewDAO extends GenericDAO<Crew, Integer> {
  
	List<Crew> findAll();
	






}


