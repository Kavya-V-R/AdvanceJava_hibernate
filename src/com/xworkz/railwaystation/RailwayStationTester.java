package com.xworkz.railwaystation;

import com.xworkz.railwaystation.dao.RailwayStationDAO;
import com.xworkz.railwaystation.dao.RailwayStationDAOImpl;
import com.xworkz.railwaystation.entity.RailwayStationEntity;

public class RailwayStationTester {

	public static void main(String[] args) {
		RailwayStationEntity entity=new RailwayStationEntity(1,"Patna",7,9,"Bhagalpur","Patna",500);
		RailwayStationDAO dao=new RailwayStationDAOImpl();
		dao.put(entity);
	}

}