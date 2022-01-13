package com.xworkz.factory;

import com.xworkz.factory.dao.FactoryDAO;
import com.xworkz.factory.dao.FactoryDAOImpl;
import com.xworkz.factory.entity.FactoryEntity;

public class FactoryTester {

	public static void main(String[] args) {
		FactoryEntity entity=new FactoryEntity(1,"food","Buiscuit",100,10000,"karnataka","Bengaluru");
		FactoryDAO dao=new FactoryDAOImpl();
		dao.put(entity);

	}

}