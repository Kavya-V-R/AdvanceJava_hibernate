package com.xworkz.website.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.tour.util.EMFUtil;
import com.xworkz.website.entity.WebsiteEntity;

public class WebsiteDAOImpl implements WebsiteDAO {

	@Override
	public void save(List<WebsiteEntity> entity) {
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		int flushcount = 0;
		try {
			for (WebsiteEntity websiteEntity : entity) {
				manager.flush();
				flushcount = 0;
				manager.clear();
				flushcount++;
			}
			transaction.commit();

		} catch (PersistenceException e) {
			e.getMessage();
			transaction.rollback();
		}
	}

		
	}


