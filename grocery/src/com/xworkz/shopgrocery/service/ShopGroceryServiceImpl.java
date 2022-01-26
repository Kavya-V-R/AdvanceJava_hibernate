package com.xworkz.shopgrocery.service;

import com.xworkz.shopgrocery.dao.ShopGroceryDAO;
import com.xworkz.shopgrocery.dao.ShopGroceryDAOImpl;
import com.xworkz.shopgrocery.entity.ShopGroceryEntity;

public class ShopGroceryServiceImpl implements ShopGroceryService {

	// ShopGroceryDAO dao=new ShopGroceryDAOImpl();
	private ShopGroceryDAO dao;

	public ShopGroceryServiceImpl(ShopGroceryDAO dao) {
		this.dao = dao;
	}

	boolean flag = true;

	@Override
	public boolean validateAndSave(ShopGroceryEntity entity) {
		if (entity.getName() != null && entity.getName().length() > 3 && entity.getName().length() < 25) {

		} else {
			System.out.println("Invalid name");
			return false;
		}

		if (entity.getMailId() != null && entity.getMailId().length() > 3 && entity.getMailId().length() < 25
				&& entity.getMailId().contains("@") && entity.getMailId().contains(".com")) {

		} else {
			System.out.println("Invalid mail Id");
			return false;
		}

		if (entity.getMobNumber() != 0) {

		} else {
			System.out.println("invalid mob number");
			return false;
		}

		if (entity.getAddress() != null && entity.getAddress().length() > 3 && entity.getAddress().length() < 25) {

		} else {
			System.out.println("Invalid Address");
			return false;
		}

		if (entity.getCity() != null && entity.getCity().length() > 3 && entity.getCity().length() < 25) {

		} else {
			System.out.println("Invalid city");
			return false;
		}

		if (entity.getState() != null && entity.getState().length() > 3 && entity.getState().length() < 25) {

		} else {
			System.out.println("Invalid state");
			return false;
		}

		if (entity.getPincode() != 0) {

		} else {
			System.out.println("invalid pincode");
			return false;
		}

		if (entity.getGroceryName() != null && entity.getGroceryName().length() > 3
				&& entity.getGroceryName().length() < 25) {

		} else {
			System.out.println("Invalid Address");
			return false;
		}

		if (entity.getBrand() != null && entity.getBrand().length() > 3 && entity.getBrand().length() < 25) {

		} else {
			System.out.println("Invalid Address");
			return false;
		}

		if (entity.getQuantity() != 0) {

		} else {
			System.out.println("Invalid Address");
			return false;
		}

		if (entity.getCreatedBy() != null && entity.getCreatedBy().length() > 3
				&& entity.getCreatedBy().length() < 25) {

		} else {
			System.out.println("Invalid createdBy name");
			return false;
		}

		if (entity.getCreatedAt() != null) {

		} else {
			System.out.println("Invalid created date and time");
			return false;
		}

		if (entity.getUpdatedBy() != null && entity.getUpdatedBy().length() > 3
				&& entity.getUpdatedBy().length() < 25) {

		} else {
			System.out.println("Invalid updatedBy name");
			return false;
		}

		if (entity.getUpdatedAt() != null) {

		} else {
			System.out.println("Invalid updated date and time");
			return false;
		}
		if (flag)
			dao.save(entity);
		return false;
	}

}
