package com.xworkz.factory.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.factory.entity.FactoryEntity;
import com.xworkz.tour.util.EMFUtil;

public class FactoryDAOImpl implements FactoryDAO{

	@Override
	public void put(FactoryEntity entity) {
		EntityManagerFactory emf =EMFUtil.getEntityManagerFactory();
		EntityManager manager=emf.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();
	}

}