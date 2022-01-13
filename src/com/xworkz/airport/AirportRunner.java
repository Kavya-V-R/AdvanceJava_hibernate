package com.xworkz.airport;

import com.xworkz.airport.dao.AirportDAO;
import com.xworkz.airport.dao.AirportDAOImpl;
import com.xworkz.airport.entity.AirportEntity;

public class AirportRunner {

	public static void main(String[] args) {
		AirportEntity entity=new AirportEntity(1,"karnataka","Kempegowda International Airport","Jayprakash Narayan International Airport",8000);
		AirportEntity entity1=new AirportEntity(2,"Bihar","Jayprakash Narayan International Airport","Kempegowda International Airport",8000);
		AirportDAO dao=new AirportDAOImpl();
		dao.put(entity);
		dao.put(entity1);
	}

}