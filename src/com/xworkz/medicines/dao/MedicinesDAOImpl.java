package com.xworkz.medicines.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.medicines.entity.MedicinesEntity;
import com.xworkz.tour.util.EMFUtil;

public class MedicinesDAOImpl implements MedicinesDAO {

	@Override
	public void put(MedicinesEntity entity) {
		EntityManagerFactory emf =EMFUtil.getEntityManagerFactory();
		EntityManager manager=emf.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();
	}

}