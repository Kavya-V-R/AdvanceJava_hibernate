package com.xworkz.silkmanufacture;

import com.xworkz.silkmanufacture.dao.SilkManufactureDAO;
import com.xworkz.silkmanufacture.dao.SilkManufactureDAOImpl;
import com.xworkz.silkmanufacture.entity.SilkManufactureEntity;

public class SilkmanufactureTester {

	public static void main(String[] args) {
		SilkManufactureEntity entity=new SilkManufactureEntity(1,"clothes","silk",200,5000,"karnataka","Bengaluru");
		SilkManufactureDAO dao= new SilkManufactureDAOImpl();
		dao.put(entity);
	}

}