package com.xworkz.tour.dao;

import java.util.List;

import com.xworkz.tour.entity.TouristEntity;

public interface TouristDAO {
	void put(TouristEntity entity);

	void putAll(List<TouristEntity> touristEntities);
}
