package com.xworkz.website;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.website.dao.WebsiteDAO;
import com.xworkz.website.dao.WebsiteDAOImpl;
import com.xworkz.website.entity.WebsiteEntity;


public class WebsiteRunner {
	public static void main(String[] args) {
		//List<WebsiteEntity> websiteEntities = new ArrayList<WebsiteEntity>();
		//websiteEntities.add(new WebsiteEntity("Facebook", ".com", "facebook.com", "Mark Zuckerberg", 2004));
		//websiteEntities.add(new WebsiteEntity("Instagram", ".com", "instagram.com", "Mark Zuckerberg", 2010));
		//websiteEntities.add(new WebsiteEntity("Twitter", ".com", "twitter.com", "Jack Dorsey", 2006));
		//websiteEntities.add(new WebsiteEntity("Amazon", ".com", "amazon.com", "Andy Jassy", 1994));
		//websiteEntities.add(new WebsiteEntity("Flipkart", ".com", "flipkart.com", "Sachinb Bansal", 2007));
		//websiteEntities.add(new WebsiteEntity("Google", ".com", "google.com", "Sundar", 2015));
		//websiteEntities.add(new WebsiteEntity("LinkedIn", ".com", "linkedin.com", "Larry and Sergey", 2002));
		//websiteEntities.add(new WebsiteEntity("Youtube", ".com", "youtube.com", "Larry and Sergey", 2005));
		//websiteEntities.add(new WebsiteEntity("Snapchat", ".com", "snapchat.com", "Evan Spiegel", 2011));
		//websiteEntities.add(new WebsiteEntity("Pinterest", ".com", "pinterest.com", "Ben", 2009));
		//websiteEntities.add(new WebsiteEntity("Myntra", ".com", "myntra.com", "Mukesh Bansal", 2007));
		//websiteEntities.add(new WebsiteEntity("X-Workz", ".com", "xworkz.com", "", 2008));
		//websiteEntities.add(new WebsiteEntity("Github", ".com", "github.com", "Tom,Chris,Hyett", 2008));
		//websiteEntities.add(new WebsiteEntity("Ajio", ".com", "ajio.com", "Mukesh Ambani", 2016));
		//websiteEntities.add(new WebsiteEntity("Google meet", ".com", "googlemeet.com", "Larry and Sergey", 2017));
		//websiteEntities.add(new WebsiteEntity("Yahoo", ".com", "yahoo.com", "Jerry", 1994));
		//websiteEntities.add(new WebsiteEntity("Udemy", ".com", "udemy.com", "Eren", 2010));
		//websiteEntities.add(new WebsiteEntity("Microsoft", ".com", "microsoft.com", "Bill gatea,Paulallen", 2));
		//websiteEntities.add(new WebsiteEntity("HackerRank", ".com", "hackerrank.com", "vivek", 2012));
		//websiteEntities.add(new WebsiteEntity("Uber", ".com", "uber.com", "Garrett,Oscar,Tavis", 2009));
		//WebsiteDAO dao = new WebsiteDAOImpl();
		//dao.putall(websiteEntities);

		WebsiteDAO dao = new WebsiteDAOImpl();
		WebsiteEntity entity=dao.getByNameGoogle();
		System.out.println(entity);
		dao.getByLikeUrlx();
		dao.getByMinSince();
		dao.getByMaxSince();
		dao.getBySecondMinSince();
		dao.getBySecondMaxSince();
	}
}
