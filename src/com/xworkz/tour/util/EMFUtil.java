package com.xworkz.tour.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFUtil {
	private static EntityManagerFactory enityManagerFactory;

	public static EntityManagerFactory getEntityManagerFactory() {
		// TODO Auto-generated method stub
		return enityManagerFactory;
	}

	static {
		System.out.println("invoking factory");
		enityManagerFactory = Persistence.createEntityManagerFactory("com..xworkz.tour");
		System.out.println("init values to db");
	}

}
