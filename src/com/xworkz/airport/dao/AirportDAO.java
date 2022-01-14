package com.xworkz.airport.dao;

import java.util.List;

import com.xworkz.airport.entity.AirportEntity;

public interface AirportDAO {
	public void put(AirportEntity entity);


	public void putAll(List<AirportEntity> airportEntities);



}