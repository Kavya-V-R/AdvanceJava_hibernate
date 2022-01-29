package com.xworkz.service;

import com.xworkz.entity.VendorEntity;

public interface VendorService {

	boolean validateAndSave(VendorEntity entity);

	boolean validateLoginNameandPassword(String loginName, String password);

	void validateAndChangePassword(String email, String newPassword);
}
