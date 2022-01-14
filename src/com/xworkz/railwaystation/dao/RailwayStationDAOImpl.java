package com.xworkz.railwaystation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.railwaystation.entity.RailwayStationEntity;
import com.xworkz.tour.entity.TouristEntity;
import com.xworkz.tour.util.EMFUtil;

public class RailwayStationDAOImpl implements RailwayStationDAO {

	@Override
	public void put(RailwayStationEntity entity) {
		EntityManagerFactory emf = EMFUtil.getEntityManagerFactory();
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();
	}

	public void putall(List<RailwayStationEntity> railwayStationEntities) {
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
		for (RailwayStationEntity railwayStationEntity : railwayStationEntities) {
			manager.persist(railwayStationEntity);
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