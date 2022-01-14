package com.xworkz.medicines.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.medicines.entity.MedicinesEntity;
import com.xworkz.tour.util.EMFUtil;

public class MedicinesDAOImpl implements MedicinesDAO {

	public void put(List<MedicinesEntity> entity) {
		EntityManagerFactory emf = EMFUtil.getEntityManagerFactory();
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();
	}

	public void putAll(List<MedicinesEntity> medicinesEntities) {
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
		for (MedicinesEntity medicinesEntity : medicinesEntities) {
			manager.persist(medicinesEntity);
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			int flushcount = 0;
			try {
				for (int i = 0; i < 73; i++) {
					if (flushcount == 10) {
						manager.flush();
						flushcount = 0;
						manager.clear();
					}
					manager.flush();
					flushcount++;
				}
			} catch (PersistenceException e) {
				e.printStackTrace();
				transaction.rollback();
			}
			transaction.commit();
		}
	}

	

}