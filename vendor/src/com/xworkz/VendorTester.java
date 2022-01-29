package com.xworkz;

import java.time.LocalDateTime;

import com.xworkz.dao.VendorDAO;
import com.xworkz.dao.VendorDAOImpl;
import com.xworkz.entity.VendorEntity;
import com.xworkz.service.VendorService;
import com.xworkz.service.VendorServiceImpl;

public class VendorTester {
	public static void main(String[] args) {

		VendorEntity entity = new VendorEntity("Mamatha", "mamatharlingappa@gmal.com", "Mamatha R", "Mamathar46",
				"Kittdal", "dhyfms587g4gj", "mamathar", LocalDateTime.now(), "mamathar", LocalDateTime.now());
		VendorDAO dao = new VendorDAOImpl();
		VendorService service = new VendorServiceImpl(dao);
		//service.validateAndSave(entity);

		// boolean valid=service.validateLoginNameandPassword("Kavyagbrbgbg R",
		// "Kavyavr123");
		service.validateAndChangePassword("mamatharlingappa@gmal.com", "Mamatha@1998");
	}
}
