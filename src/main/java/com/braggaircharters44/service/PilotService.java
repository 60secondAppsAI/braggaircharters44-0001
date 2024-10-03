package com.braggaircharters44.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.braggaircharters44.domain.Pilot;
import com.braggaircharters44.dto.PilotDTO;
import com.braggaircharters44.dto.PilotSearchDTO;
import com.braggaircharters44.dto.PilotPageDTO;
import com.braggaircharters44.dto.PilotConvertCriteriaDTO;
import com.braggaircharters44.service.GenericService;
import com.braggaircharters44.dto.common.RequestDTO;
import com.braggaircharters44.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface PilotService extends GenericService<Pilot, Integer> {

	List<Pilot> findAll();

	ResultDTO addPilot(PilotDTO pilotDTO, RequestDTO requestDTO);

	ResultDTO updatePilot(PilotDTO pilotDTO, RequestDTO requestDTO);

    Page<Pilot> getAllPilots(Pageable pageable);

    Page<Pilot> getAllPilots(Specification<Pilot> spec, Pageable pageable);

	ResponseEntity<PilotPageDTO> getPilots(PilotSearchDTO pilotSearchDTO);
	
	List<PilotDTO> convertPilotsToPilotDTOs(List<Pilot> pilots, PilotConvertCriteriaDTO convertCriteria);

	PilotDTO getPilotDTOById(Integer pilotId);







}





