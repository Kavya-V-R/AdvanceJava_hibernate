package com.xworkz.service;

import com.xworkz.dao.RegisterDAO;
import com.xworkz.entity.RegisterEntity;

public class RegisterServiceImpl implements RegisterService {
	private RegisterDAO dao;

	public RegisterServiceImpl(RegisterDAO dao) {
		this.dao = dao;
	}

	public boolean validateAndSave(RegisterEntity entity) {
		boolean flag = true;

		if (entity.getUserName() != null && entity.getUserName().length() >=4 && entity.getUserName().length() < 25) {
			flag = true;
		} else {
			System.out.println("invalid user name");
			flag = false;
			return flag;
		}

		if (entity.getEmail() != null && entity.getEmail().length() > 3 && entity.getEmail().length() < 25
				&& entity.getEmail().contains("@")
				&& (entity.getEmail().contains(".com") || entity.getEmail().contains(".in")
						|| entity.getEmail().contains(".org") || entity.getEmail().contains(".gov"))) {
			flag = true;

		} else {
			System.out.println("Invalid Email");
			flag = false;
			return flag;
		}

		if (entity.getPassword() != null && entity.getPassword().length() > 8 && entity.getPassword().length() < 36) {
			flag = true;
		} else {
			System.out.println("Invalid password");
			flag = false;
			return flag;
		}

		if (String.valueOf(entity.getMobNumber()).length() == 10) {
			flag = true;

		} else {
			System.out.println("Invalid Mobile Number");
			flag = false;
			return flag;
		}

		if (entity.getCountry() != null && entity.getCountry().length() > 3 && entity.getCountry().length() < 56) {
			flag = true;

		} else {
			System.out.println("Invalid country");
			flag = false;
			return flag;
		}

		if (entity.getCity() != null && entity.getCity().length() > 3 && entity.getCity().length() < 56) {
			flag = true;

		} else {
			System.out.println("Invalid city");
			flag = false;
			return flag;
		}

		if (flag)
			dao.save(entity);
		return false;
	}

}
