package com.xworkz;

import java.time.LocalDateTime;

import com.xworkz.dao.VendorDAO;
import com.xworkz.dao.VendorDAOImpl;
import com.xworkz.entity.VendorEntity;
import com.xworkz.service.VendorService;
import com.xworkz.service.VendorServiceImpl;

public class VendorTester {
	public static void main(String[] args) {

		VendorEntity entity = new VendorEntity("kavya", "kavyarlingappa@gmal.com", "Kavya V R", "Kavyavr123", "Sira",
				"mjghtrg257111", "kavyavr", LocalDateTime.now(), "kavyavr", LocalDateTime.now());
		VendorDAO dao = new VendorDAOImpl();
		VendorService service = new VendorServiceImpl(dao);
		service.validateAndSave(entity);
	}
}
