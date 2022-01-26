package com.xworkz.product.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.product.entity.ProductEntity;
import com.xworkz.util.SingletonEMF;

public class ProductDAOImpl implements ProductDAO {

	@Override
	public void persist(ProductEntity entity) {
		EntityManager manager = SingletonEMF.getEntityManagerFactory().createEntityManager();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
	}

	@Override
	public void saveAll(List<ProductEntity> entities) {
		EntityManager manager = SingletonEMF.getEntityManagerFactory().createEntityManager();
		for (ProductEntity productEntity : entities) {
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

	@Override
	public List<ProductEntity> getAll() {

		EntityManager manager = SingletonEMF.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getAll");

			return (List<ProductEntity>) query.getResultList();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}

		return null;
	}

	@Override
	public List<Float> getBypriceGreaterThan(Float price) {
		EntityManager manager = SingletonEMF.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getBypriceGreaterThan");
			query.setParameter("cutoffprice", price);
			return (List<Float>) query.getResultList();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}

		return null;
	}

	@Override
	public List<Float> getBypriceLesserThan(Float price) {
		EntityManager manager = SingletonEMF.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getBypriceLesserThan");
			query.setParameter("cutoffprice", price);

			return (List<Float>) query.getResultList();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}

		return null;
	}

	@Override
	public ProductEntity getByNameAndId(String name, int id) {
		EntityManager manager = SingletonEMF.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getByNameAndId");

			query.setParameter("setname", name);
			query.setParameter("setid", id);

			return (ProductEntity) query.getSingleResult();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}

		return null;
	}

	@Override
	public List<String> getTotalNames() {
		EntityManager manager = SingletonEMF.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getTotalNames");

			return (List<String>) query.getResultList();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
		return null;
	}

	@Override
	public float getMaxPrice() {
		EntityManager manager = SingletonEMF.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getMaxPrice");

			return (float) query.getSingleResult();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
		return 0;
	}

	@Override
	public double getTotalPrice() {
		EntityManager manager = SingletonEMF.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getTotalPrice");

			return (double) query.getSingleResult();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
		return 0;
	}

	@Override
	public String getByNamelike(String name) {
		EntityManager manager = SingletonEMF.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getByNamelike");

			query.setParameter("nm", name+"%");

			return (String) query.getSingleResult();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}

		return null;
	}

	@Override
	public Object getQuantityByName(String name) {
		EntityManager manager = SingletonEMF.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getQuantityByName");

			query.setParameter("setname", name);

			return query.getSingleResult();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
		return null;
	}

	@Override
	public Object[] getQuantityAndPriceByName(String name) {

		EntityManager manager = SingletonEMF.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getQuantityAndPriceByName");

			query.setParameter("setname", name);

			Object result = query.getSingleResult();
			Object[] entity = (Object[]) result;

			System.out.println("Quantity=" + entity[0]);
			System.out.println("Price=" + entity[1]);

			return entity;

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
		return null;
	}

	@Override
	public Object[] getQuantityAndPriceByNameAndId(String name, int id) {
		EntityManager manager = SingletonEMF.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getQuantityAndPriceByNameAndId");

			query.setParameter("setname", name);
			query.setParameter("setid", id);

			Object result = query.getSingleResult();
			Object[] entity = (Object[]) result;

			System.out.println("Quantity=" + entity[0]);
			System.out.println("Price=" + entity[1]);

			return entity;

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
		return null;
	}

	@Override
	public String getByBrand(String brand) {
		EntityManager manager = SingletonEMF.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getByBrand");

			query.setParameter("setbrand", brand);

			return (String) query.getSingleResult();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}

		return null;
	}

	@Override
	public List<Object[]> getNameAndPrice() {
		EntityManager manager = SingletonEMF.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getNameAndPrice");

			List<Object[]> result = query.getResultList();

			for (Object[] objects : result) {
				String name = (String) objects[0];
				float price = (float) objects[1];

				System.out.println(name);
				System.out.println(price);
				System.out.println("    ");

			}

			return result;

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
		return null;
	}

	@Override
	public String getBrand(String name) {
		EntityManager manager = SingletonEMF.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getBrand");

			query.setParameter("setname", name);

			return (String) query.getSingleResult();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}

		return null;
	}

	@Override
	public Object[] getNameAndPriceByBrand(String brand) {
		EntityManager manager = SingletonEMF.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getNameAndPriceByBrand");

			query.setParameter("setbrand", brand);

			Object result = query.getSingleResult();
			Object[] entity = (Object[]) result;

			System.out.println("Name=" + entity[0]);
			System.out.println("Price=" + entity[1]);

			return entity;

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
		return null;
	}

}
