package com.braggaircharters44.dto;

import java.sql.Timestamp;
import java.time.Year;
import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FlightSearchDTO {

	private Integer page = 0;
	private Integer size;
	private String sortBy;
	private String sortOrder;
	private String searchQuery;

	private Integer flightId;
	
	private String flightNumber;
	
	private String origin;
	
	private String destination;
	
	private DateTime departureTime;
	
	private DateTime arrivalTime;
	
}
