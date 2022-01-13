package com.xworkz.airport.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.airport.entity.AirportEntity;
import com.xworkz.tour.util.EMFUtil;

public class AirportDAOImpl implements AirportDAO{

	@Override
	public void put(AirportEntity entity) {
		EntityManagerFactory emf =EMFUtil.getEntityManagerFactory();
		EntityManager manager=emf.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();
	}

}