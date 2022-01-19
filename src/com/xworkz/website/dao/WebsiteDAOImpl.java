package com.xworkz.website.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.tour.util.EMFUtil;
import com.xworkz.website.entity.WebsiteEntity;

public class WebsiteDAOImpl implements WebsiteDAO {

	@Override
	public void putall(List<WebsiteEntity> entity) {
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		int flushcount = 0;
		try {
			for (WebsiteEntity websiteEntity : entity) {
				manager.persist(websiteEntity);
				if (flushcount == 10) {
					manager.flush();
					flushcount = 0;
					manager.clear();
				}

				flushcount++;
			}
			transaction.commit();

		} catch (PersistenceException e) {
			e.getMessage();
			transaction.rollback();
		}
	}

	public WebsiteEntity getByNameGoogle() {
		EntityManager entityManager = EMFUtil.getEntityManagerFactory().createEntityManager();

		try {
			Query query = entityManager.createNamedQuery("getByNameGoogle");
			Object object = query.getSingleResult();
			WebsiteEntity entity = (WebsiteEntity) object;
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public WebsiteEntity getByLikeUrlx() {
		EntityManager entityManager = EMFUtil.getEntityManagerFactory().createEntityManager();

		try {
			Query query = entityManager.createNamedQuery("getByLikeUrlx");
			Object object = query.getSingleResult();
			WebsiteEntity entity = (WebsiteEntity) object;
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public WebsiteEntity getByMinSince() {
		EntityManager entityManager = EMFUtil.getEntityManagerFactory().createEntityManager();

		try {
			Query query = entityManager.createNamedQuery("getByMinSince");
			Object object = query.getSingleResult();
			WebsiteEntity entity = (WebsiteEntity) object;
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public WebsiteEntity getByMaxSince() {
		EntityManager entityManager = EMFUtil.getEntityManagerFactory().createEntityManager();

		try {
			Query query = entityManager.createNamedQuery("getByMaxSince");
			Object object = query.getSingleResult();
			WebsiteEntity entity = (WebsiteEntity) object;
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public WebsiteEntity getBySecondMinSince() {
		EntityManager entityManager = EMFUtil.getEntityManagerFactory().createEntityManager();

		try {
			Query query = entityManager.createNamedQuery("getBySecondMinSince");
			Object object = query.getSingleResult();
			WebsiteEntity entity = (WebsiteEntity) object;
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public WebsiteEntity getBySecondMaxSince() {
		EntityManager entityManager = EMFUtil.getEntityManagerFactory().createEntityManager();

		try {
			Query query = entityManager.createNamedQuery("getBySecondMaxSince");
			Object object = query.getSingleResult();
			WebsiteEntity entity = (WebsiteEntity) object;
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

}
