package com.xworkz.shopgrocery;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.xworkz.shopgrocery.dao.ShopGroceryDAO;
import com.xworkz.shopgrocery.dao.ShopGroceryDAOImpl;
import com.xworkz.shopgrocery.entity.ShopGroceryEntity;

public class ShopGroceryTester {
	public static void main(String[] args) {
		ShopGroceryDAO dao = new ShopGroceryDAOImpl();

		List<ShopGroceryEntity> list = new ArrayList<ShopGroceryEntity>();

		/*list.add(new ShopGroceryEntity("Kavya", "kavarlingappa@gmail.com", 7026756387l, "Yelahanka", "Bengaluru",
				"Karnataka", 560064, "Almonds", "naturoz", 1.5f, "kavya", LocalDateTime.now(), "kavya",
				LocalDateTime.now()));

		list.add(new ShopGroceryEntity("Kavya", "kavarlingappa@gmail.com", 7026756387l, "Yelahanka", "Bengaluru",
				"Karnataka", 560064, "Green Raisins", "Happilo", 1f, "kavya", LocalDateTime.now(), "kavya",
				LocalDateTime.now()));

		list.add(new ShopGroceryEntity("Kavya", "kavarlingappa@gmail.com", 7026756387l, "Yelahanka", "Bengaluru",
				"Karnataka", 560064, "Black Dates", "Manna", 0.5f, "kavya", LocalDateTime.now(), "kavya",
				LocalDateTime.now()));

		list.add(new ShopGroceryEntity("Kavya", "kavarlingappa@gmail.com", 7026756387l, "Yelahanka", "Bengaluru",
				"Karnataka", 560064, "Pistachios", "Happilo", 2f, "kavya", LocalDateTime.now(), "kavya",
				LocalDateTime.now()));

		list.add(new ShopGroceryEntity("Kavya", "kavarlingappa@gmail.com", 7026756387l, "Yelahanka", "Bengaluru",
				"Karnataka", 560064, "Avalakki", "Grocery", 5f, "kavya", LocalDateTime.now(), "kavya",
				LocalDateTime.now()));

		list.add(new ShopGroceryEntity("Kavya", "kavarlingappa@gmail.com", 7026756387l, "Yelahanka", "Bengaluru",
				"Karnataka", 560064, "Toor dal", "Grocery", 1f, "kavya", LocalDateTime.now(), "kavya",
				LocalDateTime.now()));

		list.add(new ShopGroceryEntity("Kavya", "kavarlingappa@gmail.com", 7026756387l, "Yelahanka", "Bengaluru",
				"Karnataka", 560064, "Kabuli Chana", "Goshud", 3f, "kavya", LocalDateTime.now(), "kavya",
				LocalDateTime.now()));

		list.add(new ShopGroceryEntity("Kavya", "kavarlingappa@gmail.com", 7026756387l, "Yelahanka", "Bengaluru",
				"Karnataka", 560064, "Yellow Chana Dal", "Classic", 1.5f, "kavya", LocalDateTime.now(), "kavya",
				LocalDateTime.now()));

		list.add(new ShopGroceryEntity("Kavya", "kavarlingappa@gmail.com", 7026756387l, "Yelahanka", "Bengaluru",
				"Karnataka", 560064, "Yellow Arhar Dal", "Goshud", 4f, "kavya", LocalDateTime.now(), "kavya",
				LocalDateTime.now()));

		list.add(new ShopGroceryEntity("Kavya", "kavarlingappa@gmail.com", 7026756387l, "Yelahanka", "Bengaluru",
				"Karnataka", 560064, "Black eye Peas", "Goshud", 0.5f, "kavya", LocalDateTime.now(), "kavya",
				LocalDateTime.now()));

		list.add(new ShopGroceryEntity("Kavya", "kavarlingappa@gmail.com", 7026756387l, "Yelahanka", "Bengaluru",
				"Karnataka", 560064, "Green Moong Dal", "Goshud", 1f, "kavya", LocalDateTime.now(), "kavya",
				LocalDateTime.now()));

		list.add(new ShopGroceryEntity("Kavya", "kavarlingappa@gmail.com", 7026756387l, "Yelahanka", "Bengaluru",
				"Karnataka", 560064, "Peanut", "Classic", 2f, "kavya", LocalDateTime.now(), "kavya",
				LocalDateTime.now()));

		list.add(new ShopGroceryEntity("Kavya", "kavarlingappa@gmail.com", 7026756387l, "Yelahanka", "Bengaluru",
				"Karnataka", 560064, "Jeera", "Pink delight", 0.25f, "kavya", LocalDateTime.now(), "kavya",
				LocalDateTime.now()));

		list.add(new ShopGroceryEntity("Kavya", "kavarlingappa@gmail.com", 7026756387l, "Yelahanka", "Bengaluru",
				"Karnataka", 560064, "Cooking Oil", "Gold Winner", 10f, "kavya", LocalDateTime.now(), "kavya",
				LocalDateTime.now()));

		list.add(new ShopGroceryEntity("Kavya", "kavarlingappa@gmail.com", 7026756387l, "Yelahanka", "Bengaluru",
				"Karnataka", 560064, "Salt", "Tata", 2f, "kavya", LocalDateTime.now(), "kavya", LocalDateTime.now()));

		list.add(new ShopGroceryEntity("Kavya", "kavarlingappa@gmail.com", 7026756387l, "Yelahanka", "Bengaluru",
				"Karnataka", 560064, "Sugar", "Goshub", 3f, "kavya", LocalDateTime.now(), "kavya",
				LocalDateTime.now()));

		list.add(new ShopGroceryEntity("Kavya", "kavarlingappa@gmail.com", 7026756387l, "Yelahanka", "Bengaluru",
				"Karnataka", 560064, "Coffee Powder", "Malgudi coffee", 0.5f, "kavya", LocalDateTime.now(), "kavya",
				LocalDateTime.now()));

		list.add(new ShopGroceryEntity("Kavya", "kavarlingappa@gmail.com", 7026756387l, "Yelahanka", "Bengaluru",
				"Karnataka", 560064, "Tea Powder", "3 Roses", 1f, "kavya", LocalDateTime.now(), "kavya",
				LocalDateTime.now()));

		list.add(new ShopGroceryEntity("Kavya", "kavarlingappa@gmail.com", 7026756387l, "Yelahanka", "Bengaluru",
				"Karnataka", 560064, "Rice", "Basmati", 20f, "kavya", LocalDateTime.now(), "kavya",
				LocalDateTime.now()));

		list.add(new ShopGroceryEntity("Kavya", "kavarlingappa@gmail.com", 7026756387l, "Yelahanka", "Bengaluru",
				"Karnataka", 560064, "Cheese", "Mozerella", 0.5f, "kavya", LocalDateTime.now(), "kavya",
				LocalDateTime.now()));

		dao.saveAll(list);

		ShopGroceryEntity entity = new ShopGroceryEntity("Kavya", "kavarlingappa@gmail.com", 7026756387l, "Yelahanka",
				"Bengaluru", "Karnataka", 560064, "haldi", "grocery", 0.25f, "kavya", LocalDateTime.now(), "kavya",
				LocalDateTime.now());
		dao.save(entity);*/

	}
}
