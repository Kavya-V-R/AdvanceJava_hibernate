package com.xworkz.medicines;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.medicines.dao.MedicinesDAO;
import com.xworkz.medicines.dao.MedicinesDAOImpl;
import com.xworkz.medicines.entity.MedicinesEntity;

public class MedicinesTester {

	public static void main(String[] args) {
		List<MedicinesEntity> medicinesEntities = new ArrayList<MedicinesEntity>();

		// medicinesEntities.add(new MedicinesEntity(1,"PCM","Solid",10,"BTM 2nd
		// stage","Flipkart","ayurveda"));
		medicinesEntities.add(new MedicinesEntity(2, "Lasix", "Solid", 40, "BTM 2nd stage", "Flipkart", "Tablet"));
		medicinesEntities.add(new MedicinesEntity(3, "Viagra", "Solid", 10, "BTM 2nd stage", "Flipkart", "Tablet"));
		medicinesEntities.add(new MedicinesEntity(4, "Periacti", "Solid", 10, "BTM 2nd stage", "Flipkart", "Tablet"));
		medicinesEntities.add(new MedicinesEntity(5, "Atarax", "Solid", 10, "BTM 2nd stage", "Flipkart", "Tablet"));
		medicinesEntities.add(new MedicinesEntity(6, "Claritin", "Solid", 10, "BTM 2nd stage", "Flipkart", "ayurveda"));
		medicinesEntities.add(new MedicinesEntity(7, "Alegra", "Solid", 10, "BTM 2nd stage", "Flipkart", "ayurveda"));
		medicinesEntities.add(new MedicinesEntity(8, "Astelin", "Solid", 10, "BTM 2nd stage", "Flipkart", "Tablet"));
		medicinesEntities.add(new MedicinesEntity(9, "Zovirax", "Solid", 10, "BTM 2nd stage", "Flipkart", "ayurveda"));
		medicinesEntities.add(new MedicinesEntity(10, "Valtrex", "Solid", 10, "BTM 2nd stage", "Flipkart", "Tablet"));
		medicinesEntities.add(new MedicinesEntity(11, "Famvir", "Solid", 10, "BTM 2nd stage", "Flipkart", "ayurveda"));
		medicinesEntities.add(new MedicinesEntity(12, "Rebetol", "Solid", 10, "BTM 2nd stage", "Flipkart", "ayurveda"));
		medicinesEntities.add(new MedicinesEntity(13, "Epivir", "Solid", 10, "BTM 2nd stage", "Flipkart", "ayurveda"));
		medicinesEntities.add(new MedicinesEntity(14, "Copegus", "Solid", 10, "BTM 2nd stage", "Flipkart", "Tablet"));
		medicinesEntities.add(new MedicinesEntity(15, "Monoket", "Solid", 10, "BTM 2nd stage", "Flipkart", "ayurveda"));
		medicinesEntities.add(new MedicinesEntity(16, "Nizoral", "Solid", 10, "BTM 2nd stage", "Flipkart", "ayurveda"));
		medicinesEntities.add(new MedicinesEntity(17, "Lamisil", "Solid", 10, "BTM 2nd stage", "Flipkart", "Tablet"));
		medicinesEntities.add(new MedicinesEntity(18, "Lotrison", "Solid", 10, "BTM 2nd stage", "Flipkart", "ayurveda"));
		medicinesEntities.add(new MedicinesEntity(19, "Lumigon", "Fluid", 10, "BTM 2nd stage", "Flipkart", "Drops"));
		medicinesEntities.add(new MedicinesEntity(20, "Careprost", "Fluid", 10, "BTM 2nd stage", "Flipkart", "Drops"));
		medicinesEntities.add(new MedicinesEntity(21, "Teardrops", "Fluid", 10, "BTM 2nd stage", "Flipkart", "Drops"));
		medicinesEntities.add(new MedicinesEntity(22, "Fincar", "Solid", 10, "BTM 2nd stage", "Flipkart", "ayurveda"));
		medicinesEntities.add(new MedicinesEntity(23, "Propocia", "Solid", 10, "BTM 2nd stage", "Flipkart", "ayurveda"));
		medicinesEntities.add(new MedicinesEntity(24, "Rogain", "Solid", 10, "BTM 2nd stage", "Flipkart", "ayurveda"));
		medicinesEntities.add(new MedicinesEntity(25, "Indocin", "Solid", 10, "BTM 2nd stage", "Flipkart", "ayurveda"));
		medicinesEntities.add(new MedicinesEntity(26, "Voltaren", "Solid", 10, "BTM 2nd stage", "Flipkart", "ayurveda"));
		medicinesEntities.add(new MedicinesEntity(27, "Celebrex", "Solid", 10, "BTM 2nd stage", "Flipkart", "Tablet"));
		medicinesEntities.add(new MedicinesEntity(28, "Imitrex", "Solid", 10, "BTM 2nd stage", "Flipkart", "ayurveda"));
		medicinesEntities.add(new MedicinesEntity(29, "Mobic", "Solid", 10, "BTM 2nd stage", "Flipkart", "ayurveda"));
		medicinesEntities.add(new MedicinesEntity(30, "Imuran", "Solid", 10, "BTM 2nd stage", "Flipkart", "Tablet"));
		medicinesEntities.add(new MedicinesEntity(31, "Anaprox", "Solid", 10, "BTM 2nd stage", "Flipkart", "ayurveda"));
		medicinesEntities.add(new MedicinesEntity(32, "Motrin", "Solid", 10, "BTM 2nd stage", "Flipkart", "ayurveda"));
		medicinesEntities.add(new MedicinesEntity(33, "Panadol", "Solid", 10, "BTM 2nd stage", "Flipkart", "ayurveda"));
		medicinesEntities.add(new MedicinesEntity(34, "Imdur", "Solid", 10, "BTM 2nd stage", "Flipkart", "ayurveda"));

		MedicinesDAO dao = new MedicinesDAOImpl();
		dao.putAll(medicinesEntities);
	}

}