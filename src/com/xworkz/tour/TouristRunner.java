package com.xworkz.tour;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TouristRunner {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz.tour");
	System.out.println(entityManagerFactory);
}
}
