package com.xworkz.shopgrocery.service;

import com.xworkz.shopgrocery.dao.ShopGroceryDAO;
import com.xworkz.shopgrocery.dao.ShopGroceryDAOImpl;
import com.xworkz.shopgrocery.entity.ShopGroceryEntity;

public class ShopGroceryServiceImpl implements ShopGroceryService {

	private ShopGroceryDAO dao;

	public ShopGroceryServiceImpl(ShopGroceryDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean validateAndSave(ShopGroceryEntity entity) {
		boolean flag = true;
		if (entity.getName() != null && !(entity.getName().isEmpty()) && entity.getName().length() >= 3
				&& entity.getName().length() <= 30) {
			flag = true;
		} else {
			System.out.println("invalid  name");
			flag = false;
			return flag;
		}

		if (entity.getMailId() != null && !(entity.getMailId().isEmpty()) && entity.getMailId().length() > 5
				&& entity.getMailId().length() < 30 && entity.getMailId().contains("@")
				&& (entity.getMailId().contains(".com") || entity.getMailId().contains(".in")
						|| entity.getMailId().contains(".org") || entity.getMailId().contains(".gov"))) {
			flag = true;

		} else {
			System.out.println("Invalid Email");
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


		if (String.valueOf(entity.getMobNumber()).length() == 10) {
			flag = true;

		} else {
			System.out.println("Invalid Mobile Number");
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

		if (entity.getCity() != null && !(entity.getCity().isEmpty()) && entity.getCity().length() > 3
				&& entity.getCity().length() < 100) {
			flag = true;
		} else {
			System.out.println("Invalid city");
			flag = false;
			return flag;
		}

		if (entity.getState() != null && !(entity.getState().isEmpty()) && entity.getState().length() > 3
				&& entity.getState().length() < 100) {
			flag = true;
		} else {
			System.out.println("Invalid state");
			flag = false;
			return flag;
		}

		if (String.valueOf(entity.getPincode()).length() == 6) {
			flag = true;

		} else {
			System.out.println("Invalid pincode");
			flag = false;
			return flag;
		}


		if (entity.getGroceryName() != null && !(entity.getGroceryName().isEmpty()) && entity.getGroceryName().length() > 8
				&& entity.getGroceryName().length() < 12) {
			flag = true;
		} else {
			System.out.println("Invalid grocery name");
			flag = false;
			return flag;
		}

		if (entity.getBrand() != null && !(entity.getBrand().isEmpty()) && entity.getBrand().length() > 5
				&& entity.getBrand().length() < 30) {
			flag = true;
		} else {
			System.out.println("Invalid brand");
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
		return false;
	}

}
