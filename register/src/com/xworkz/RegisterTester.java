package com.xworkz;

import com.xworkz.dao.RegisterDAO;
import com.xworkz.dao.RegisterDAOImpl;
import com.xworkz.entity.RegisterEntity;
import com.xworkz.service.RegisterService;
import com.xworkz.service.RegisterServiceImpl;

public class RegisterTester {
	public static void main(String[] args) {

		RegisterEntity entity = new RegisterEntity("divyarani", "kavyarlingappa@gmal.com", "kavya@1988", "sira", "india",
				7026756387l, true);
		RegisterDAO dao = new RegisterDAOImpl();
		RegisterService service = new RegisterServiceImpl(dao);
		service.validateAndSave(entity);
	}
}
