package com.xworkz.medicines;

import com.xworkz.medicines.dao.MedicinesDAO;
import com.xworkz.medicines.dao.MedicinesDAOImpl;
import com.xworkz.medicines.entity.MedicinesEntity;

public class MedicinesTester {

	public static void main(String[] args) {
		MedicinesEntity entity=new MedicinesEntity(1,"PCM","Solid",10,"BTM 2nd stage","Flipkart","ayurveda");
		MedicinesDAO dao=new MedicinesDAOImpl();
		dao.put(entity);
	}

}