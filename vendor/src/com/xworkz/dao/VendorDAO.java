package com.xworkz.dao;

import com.xworkz.entity.VendorEntity;

public interface VendorDAO {
	void save(VendorEntity entity);

	boolean findLoginName(String loginName, String password);

	boolean findByEmail(String Email);

	void updatePasswordByEmail(String email, String password);
}
