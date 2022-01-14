package com.xworkz.railwaystation.dao;

import java.util.List;

import com.xworkz.railwaystation.entity.RailwayStationEntity;

public interface RailwayStationDAO {
	void put(RailwayStationEntity entity);

	void putall(List<RailwayStationEntity> railwayStationEntities);
}