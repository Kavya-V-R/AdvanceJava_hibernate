package com.xworkz.service;

import com.xworkz.dao.VendorDAO;
import com.xworkz.entity.VendorEntity;

public class VendorServiceImpl implements VendorService {

	private VendorDAO dao;

	public VendorServiceImpl(VendorDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean validateAndSave(VendorEntity entity) {
		boolean flag = true;
		if (entity.getName() != null && !(entity.getName().isEmpty()) && entity.getName().length() >= 3
				&& entity.getName().length() <= 30) {
			flag = true;
		} else {
			System.out.println("invalid  name");
			flag = false;
			return flag;
		}

		if (entity.getEmail() != null && !(entity.getEmail().isEmpty()) && entity.getEmail().length() > 5
				&& entity.getEmail().length() < 30 && entity.getEmail().contains("@")
				&& (entity.getEmail().contains(".com") || entity.getEmail().contains(".in")
						|| entity.getEmail().contains(".org") || entity.getEmail().contains(".gov"))) {
			flag = true;

		} else {
			System.out.println("Invalid Email");
			flag = false;
			return flag;
		}

		if (entity.getLoginName() != null && !(entity.getLoginName().isEmpty()) && entity.getLoginName().length() > 8
				&& entity.getLoginName().length() < 12) {
			flag = true;
		} else {
			System.out.println("Invalid login name");
			flag = false;
			return flag;
		}

		if (entity.getPassword() != null && !(entity.getPassword().isEmpty()) && entity.getPassword().length() > 8
				&& entity.getPassword().length() < 12) {
			flag = true;
		} else {
			System.out.println("Invalid password");
			flag = false;
			return flag;
		}

		if (entity.getAddress() != null && !(entity.getAddress().isEmpty()) && entity.getAddress().length() > 3
				&& entity.getAddress().length() < 100) {
			flag = true;
		} else {
			System.out.println("Invalid address");
			flag = false;
			return flag;
		}

		if (String.valueOf(entity.getGstNumber()).length() == 13) {
			flag = true;

		} else {
			System.out.println("Invalid gst number");
			flag = false;
			return flag;
		}

		if (entity.getCreatedBy() != null && !(entity.getCreatedBy().isEmpty()) && entity.getCreatedBy().length() > 5
				&& entity.getCreatedBy().length() < 30) {
			flag = true;
		} else {
			System.out.println("Invalid created by name");
			flag = false;
			return flag;
		}

		if (entity.getCreatedAt() != null) {
			flag = true;
		} else {
			System.out.println("Invalid ceated at");
			flag = false;
			return flag;
		}
		if (entity.getUpdatedBy() != null && !(entity.getUpdatedBy().isEmpty()) && entity.getUpdatedBy().length() > 5
				&& entity.getUpdatedBy().length() < 30) {
			flag = true;
		} else {
			System.out.println("Invalid updated by name");
			flag = false;
			return flag;
		}
		if (entity.getUpdatedAt() != null) {
			flag = true;
		} else {
			System.out.println("Invalid updated at");
			flag = false;
			return flag;
		}
		if (flag)
			dao.save(entity);
		return flag;
	}

}
