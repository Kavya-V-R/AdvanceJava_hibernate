package com.xworkz.product.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingletonEMF {
	private static EntityManagerFactory enityManagerFactory;

	public static EntityManagerFactory getEntityManagerFactory() {
		return enityManagerFactory;
	}

	static {
		System.out.println("invoking factory");
		enityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz.tour");
		System.out.println("init values to db");
	}

}
