package com.xworkz.silkmanufacture.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.tour.util.EMFUtil;

public class SilkManufactureDAOImpl implements SilkManufactureDAO{

	@Override
	public void put(com.xworkz.silkmanufacture.entity.SilkManufactureEntity entity) {
		EntityManagerFactory emf =EMFUtil.getEntityManagerFactory();
		EntityManager manager=emf.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();
	}

}