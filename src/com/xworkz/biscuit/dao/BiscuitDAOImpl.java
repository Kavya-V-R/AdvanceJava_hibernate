package com.xworkz.biscuit.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.biscuit.entity.BiscuitEntity;
import com.xworkz.tour.util.EMFUtil;

public class BiscuitDAOImpl implements BiscuitDAO{

	@Override
	public void put(BiscuitEntity entity) {
		EntityManagerFactory emf =EMFUtil.getEntityManagerFactory();
		EntityManager manager=emf.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();
	}

}