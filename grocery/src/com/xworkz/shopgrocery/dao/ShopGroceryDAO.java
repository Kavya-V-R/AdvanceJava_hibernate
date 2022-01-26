package com.xworkz.shopgrocery.dao;

import java.util.List;
import com.xworkz.shopgrocery.entity.ShopGroceryEntity;

public interface ShopGroceryDAO {

	void save(ShopGroceryEntity entity);

	void saveAll(List<ShopGroceryEntity> entities);
}
