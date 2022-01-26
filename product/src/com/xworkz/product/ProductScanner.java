package com.xworkz.product;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.product.dao.ProductDAO;
import com.xworkz.product.dao.ProductDAOImpl;
import com.xworkz.product.entity.ProductEntity;

public class ProductScanner {
	public static void main(String[] args) {
		
		ProductDAO dao = new ProductDAOImpl();

/*		ProductEntity entity = new ProductEntity("Bag", 1, "Skybag", 2500, 6);
		dao.persist(entity);
		System.out.println(entity);
        List<ProductEntity> list = new ArrayList<ProductEntity>();
		list.add(new ProductEntity("watch", 5, "fastrack", 10000, 8));
		list.add(new ProductEntity("Laptop", 2, "Dell", 90000, 4));
		list.add(new ProductEntity("Sunglass", 5, "fastrack", 800, 8));
		list.add(new ProductEntity("Masks", 5, "N-95", 200, 8));
		list.add(new ProductEntity("Yogamats", 5, "Jadeyoga", 10000, 8));
		list.add(new ProductEntity("Volleyball", 5, "Wilson", 10000, 8));
		list.add(new ProductEntity("Speakers", 5, "Sony", 900, 8));
		list.add(new ProductEntity("Powerbank", 5, "Syska", 7000, 8));
		list.add(new ProductEntity("MixerGrinder", 5, "Prestige", 10000, 8));
		list.add(new ProductEntity("Bed", 2, "Wakefit", 10000, 5));
		ProductDAO dao1 = new ProductDAOImpl();
		dao1.saveAll(list); */

		List<ProductEntity> list= dao.getAll();
		
		System.out.println(list);
		System.out.println("-------------------------");
		
		dao.getBypriceGreaterThan(500f);
		System.out.println("-------------------------");

		dao.getBypriceLesserThan(1000f);
		System.out.println("-------------------------");

		dao.getByNameAndId("Masks", 5);		
		System.out.println("-------------------------");

		dao.getTotalPrice();
		System.out.println("-------------------------");

		dao.getMaxPrice();
		System.out.println("-------------------------");

		dao.getByNamelike("glass");
		System.out.println("-------------------------");

		dao.getQuantityByName("Powerbank");
		System.out.println("-------------------------");

		dao.getQuantityAndPriceByNameAndId("Yogamats", 6);
		System.out.println("-------------------------");

		dao.getByBrand("Sony");
		System.out.println("-------------------------");

		dao.getNameAndPriceByBrand("Prestige");
		System.out.println("-------------------------");

		dao.getNameAndPrice();
		System.out.println("-------------------------");

		dao.getTotalNames();
		System.out.println("-------------------------");

		dao.getBrand("Laptop");
	
	}
}
