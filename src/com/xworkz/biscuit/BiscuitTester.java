package com.xworkz.biscuit;

import com.xworkz.biscuit.dao.BiscuitDAO;
import com.xworkz.biscuit.dao.BiscuitDAOImpl;
import com.xworkz.biscuit.entity.BiscuitEntity;

public class BiscuitTester {

	public static void main(String[] args) {
		BiscuitEntity entity=new  BiscuitEntity(1,"Hide and seek",60,"rolled","karnataka","black","flipkart");
		BiscuitDAO dao=new BiscuitDAOImpl();
		dao.put(entity);
	}

}