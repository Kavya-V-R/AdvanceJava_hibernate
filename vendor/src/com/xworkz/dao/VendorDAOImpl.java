package com.xworkz.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

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

	@Override
	public boolean findLoginName(String loginName, String password) {
		EntityManager manager = SingletonEMF.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("findLoginName");

			query.setParameter("ln", loginName);
			query.setParameter("pwd", password);

			VendorEntity entity = (VendorEntity) query.getSingleResult();
			if (entity != null) {
				return true;
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}

		return false;
	}

	@Override
	public boolean findByEmail(String email) {
		EntityManager manager = SingletonEMF.getEntityManagerFactory().createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			Query query = manager.createNamedQuery("findByEmail");

			query.setParameter("em", email);

			VendorEntity obj = (VendorEntity) query.getSingleResult();
			if (obj != null) {
				return true;
			}
			transaction.commit();
		} catch (PersistenceException e) {
			e.printStackTrace(); 
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
		return false;
	}

	@Override
	public void updatePasswordByEmail(String email, String password) {
		EntityManager manager = SingletonEMF.getEntityManagerFactory().createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();

		try {
			Query query = manager.createNamedQuery("updatePasswordByEmail");

			query.setParameter("setpwd", password);
			query.setParameter("em", email);
			int result=query.executeUpdate();
			transaction.commit();
		} catch (

		PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}

	}
}
