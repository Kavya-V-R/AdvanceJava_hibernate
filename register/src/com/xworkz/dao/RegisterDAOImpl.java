package com.xworkz.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

import com.xworkz.entity.RegisterEntity;
import com.xworkz.util.SingletonEMF;

public class RegisterDAOImpl implements RegisterDAO {

	@Override
	public void save(RegisterEntity entity) {
		EntityManager manager = SingletonEMF.getEntityManagerFactory().createEntityManager();

		try {
			manager.getTransaction().begin();
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
