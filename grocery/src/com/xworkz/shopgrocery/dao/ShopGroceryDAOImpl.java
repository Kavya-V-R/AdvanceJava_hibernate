package com.xworkz.shopgrocery.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import com.xworkz.shopgrocery.entity.ShopGroceryEntity;
import com.xworkz.util.SingletonEMF;

public class ShopGroceryDAOImpl implements ShopGroceryDAO {

	@Override
	public void saveAll(List<ShopGroceryEntity> entities) {
		EntityManager manager = SingletonEMF.getEntityManagerFactory().createEntityManager();
		for (ShopGroceryEntity productEntity : entities) {
			manager.persist(productEntity);

			EntityTransaction transaction = manager.getTransaction();

			transaction.begin();
			int flushcount = 0;
			try {
				for (int i = 0; i < 10; i++) {
					if (flushcount == 10) {
						manager.flush();
						flushcount = 0;
						manager.clear();
						transaction.commit();
					}
					flushcount++;
				}
			} catch (PersistenceException e) {
				e.printStackTrace();
				transaction.rollback();
			}
		}
	}

	@Override
	public void save(ShopGroceryEntity entity) {
		EntityManager manager = SingletonEMF.getEntityManagerFactory().createEntityManager();

		try {
			manager.getTransaction().begin();
			manager.persist(entity);
			manager.getTransaction().commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {

		}

	}
}
