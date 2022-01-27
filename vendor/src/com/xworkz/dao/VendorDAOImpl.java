package com.xworkz.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

import com.xworkz.entity.VendorEntity;
import com.xworkz.util.SingletonEMF;

public class VendorDAOImpl implements VendorDAO {

	@Override
	public void save(VendorEntity entity) {
		EntityManager manager = SingletonEMF.getEntityManagerFactory().createEntityManager();
		manager.getTransaction().begin();
		try {
			manager.persist(entity);
			manager.getTransaction().commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
	}
}
