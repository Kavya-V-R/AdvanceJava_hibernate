package com.xworkz.railwaystation;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.railwaystation.dao.RailwayStationDAO;
import com.xworkz.railwaystation.dao.RailwayStationDAOImpl;
import com.xworkz.railwaystation.entity.RailwayStationEntity;

public class RailwayStationTester {

	public static void main(String[] args) {
		List<RailwayStationEntity> railwayStationEntities = new ArrayList<RailwayStationEntity>();

		//railwayStationEntities.add(new RailwayStationEntity(1, "Patna", 7, 9, "Bhagalpur", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(2, "Bengaluru", 7, 9, "BJ", "Bengaluru", 500));
		railwayStationEntities.add(new RailwayStationEntity(3, "Yehwanthpur", 7, 9, "YJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(4, "Mysore", 7, 9, "MJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(5, "Bangarpet", 7, 9, "BJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(6, "Raichur", 7, 9, "RJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(7, "Manglore", 7, 9, "MJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(8, "Hubli", 7, 9, "HJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(9, "Davanagere", 7, 9, "DJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(10, "Birur", 7, 9, "BJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(11, "Wadi", 7, 9, "WJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(12, "Tumkur", 7, 9, "TJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(13, "Arsikere", 7, 9, "AJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(14, "Manglore", 7, 9, "MJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(15, "Bellary", 7, 9, "BJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(16, "Belgaum", 7, 9, "BJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(17, "Yadgir", 7, 9, "YJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(18, "Mandya", 7, 9, "MJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(19, "Darwad", 7, 9, "DJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(20, "Hyderbad", 7, 9, "HJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(21, "Secundarabad", 7, 9, "SJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(22, "Warangal", 7, 9, "WJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(23, "Tandur", 7, 9, "TJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(24, "Basar", 7, 9, "BJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(25, "Begampet", 7, 9, "BJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(26, "Kanipet", 7, 9, "KJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(27, "Kachagud", 7, 9, "Bhagalpur", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(28, "Nalgonda", 7, 9, "NJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(29, "Tivim", 7, 9, "TJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(30, "Kulem", 7, 9, "KJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(31, "Verma", 7, 9, "VJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(32, "Balli", 7, 9, "BJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(33, "Kaleem", 7, 9, "KJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(34, "Hyderbad", 7, 9, "HJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(35, "Secundarabad", 7, 9, "SJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(36, "Warangal", 7, 9, "WJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(37, "Tandur", 7, 9, "TJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(38, "Basar", 7, 9, "BJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(39, "Begampet", 7, 9, "BJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(40, "Kanipet", 7, 9, "KJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(41, "Kachagud", 7, 9, "Bhagalpur", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(42, "Nalgonda", 7, 9, "NJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(43, "Tivim", 7, 9, "TJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(44, "Kulem", 7, 9, "KJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(45, "Verma", 7, 9, "VJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(46, "Balli", 7, 9, "BJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(47, "Kaleem", 7, 9, "KJ", "Patna", 500));
		railwayStationEntities.add(new RailwayStationEntity(48, "Mandya", 7, 9, "MJ", "Patna", 500));

		RailwayStationDAO dao = new RailwayStationDAOImpl();
		dao.putall(railwayStationEntities);
	}

}