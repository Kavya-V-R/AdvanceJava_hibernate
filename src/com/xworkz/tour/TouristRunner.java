package com.xworkz.tour;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.tour.dao.TouristDAO;
import com.xworkz.tour.dao.TouristDAOImpl;
import com.xworkz.tour.entity.TouristEntity;

public class TouristRunner {

	public static void main(String[] args) {

		List<TouristEntity> touristEntities = new ArrayList<TouristEntity>();
		// TourEntity(int id, String location, float sealevel, String famousFor, double
		// entryFees, String season)
		touristEntities.add(new TouristEntity(1, "St.Mary's Island", 10, "Photoshoot", 300, "All time"));
		touristEntities.add(new TouristEntity(2, "Madikeri", 1600, "Coffe plantations", 4000, "winter"));
		touristEntities.add(new TouristEntity(3, "Nandi hills", 1600, "Lovers spot", 150, "Rainy and winter"));
		touristEntities.add(new TouristEntity(4, "Mysore", 1000, "Palace", 200, "All time"));
		touristEntities.add(new TouristEntity(5, "Marikanive", 1050, "Dam", 0, "Winter"));
		touristEntities.add(new TouristEntity(6, "Chitradurga", 1020, "Kallina kote", 100, "Winter"));
		touristEntities.add(new TouristEntity(7, "Gubbi", 2000, "Channabasaveshwara temple", 0, " All time"));
		touristEntities.add(new TouristEntity(8, "Dasharatha rameshwara vajra", 1264, "Shravanakumara and dasharatha",
				0, "winter"));
		touristEntities.add(new TouristEntity(9, "Sirsi", 587, "Marikamba", 0, "All time"));
		touristEntities.add(new TouristEntity(10, "Tumkur", 158, "siddaganga mutt", 0, "all time"));
		touristEntities.add(new TouristEntity(11, "Madugiri", 465, "Monolithic hill", 0, "All time"));
		touristEntities.add(new TouristEntity(12, "Shivagange", 1580, "Olakal theertha", 50, "winter"));
		touristEntities.add(new TouristEntity(13, "adichunchanagiri", 158, "kalabairaveshwara Temple", 0, "All time"));
		touristEntities.add(new TouristEntity(14, "Manglore", 10, "tannirbhavi beach", 0, "All time"));
		touristEntities.add(new TouristEntity(15, "Jog falls", 1020, "Falls", 0, "Rainy"));
		touristEntities.add(new TouristEntity(16, "Sigandur", 100, "Launh(Boat)", 200, "All time"));
		touristEntities.add(new TouristEntity(17, "Gokarna", 10, "Om beach", 0, "All time"));
		touristEntities.add(new TouristEntity(18, "Murdeshwara", 10, "temple and beach", 0, "All time"));
		touristEntities.add(new TouristEntity(19, "Malpe beach", 1600, "fishing harbour", 0, "All time"));
		touristEntities.add(new TouristEntity(20, "Darmastala", 1600, "Temple", 200, "All time"));
		touristEntities.add(new TouristEntity(21, "Kukke", 1020, "Subramanya temple", 150, "All time"));
		touristEntities
				.add(new TouristEntity(22, "Belur", 1020, "Chennakeshava temple and shilabalike's", 60, "All time"));
		touristEntities.add(new TouristEntity(23, "Halebeedu", 1600, "Architecture", 40, "All time"));
		touristEntities.add(new TouristEntity(24, "Gol Gumbaz", 100, "Dome", 80, "All time"));
		touristEntities.add(new TouristEntity(26, "Badami", 10, "Caves", 45, "All time"));
		touristEntities.add(new TouristEntity(27, "Ihole", 10, "Chalukya's Architecture", 78, "All time"));
		touristEntities.add(new TouristEntity(28, "Pattadakallu", 1020, "Lokeswar temple", 58, "All time"));
		touristEntities.add(new TouristEntity(29, "Abbey falls", 100, "falls", 50, "Rainy"));
		touristEntities.add(new TouristEntity(30, "KRS", 1600, "Dam and fountain", 100, "Night"));
		touristEntities.add(new TouristEntity(31, "Almatti", 10, "Dam", 0, "All time"));
		touristEntities.add(new TouristEntity(32, "Hampi", 1600, "Architecture", 458, "All time"));
		touristEntities.add(new TouristEntity(33, "Koodasangama", 1020, "Basavanna's aikya linga", 0, "All time"));
		touristEntities.add(new TouristEntity(34, "Shringeri", 100, "Sharadamba temple", 100, "All time"));
		touristEntities.add(new TouristEntity(35, "Karkala", 1600, "gommateshwar statue", 0, "All time"));
		touristEntities.add(new TouristEntity(36, "Udupi", 100, "Krishna temple", 100, "All time"));
		touristEntities.add(new TouristEntity(37, "Mysore Zoo", 100, "Animals and Birds", 200, "Winter"));
		touristEntities.add(new TouristEntity(38, "Mysore", 1600, "Chamundi Betta", 100, "Winter"));
		touristEntities.add(new TouristEntity(39, "Kundapur", 1020, "Maravanthe", 0, "All time"));
		touristEntities.add(new TouristEntity(40, "Agumbe", 1600, "Sun set", 54, "Evening"));
		touristEntities.add(new TouristEntity(41, "Badami", 100, "Curves", 0, "All time"));
		touristEntities.add(new TouristEntity(42, "Shrirangapatna", 1020, "shriranga temple", 54, "All time"));
		touristEntities.add(new TouristEntity(43, "Pilikula Nisargadama", 1600, "Biological park", 0, "Winter"));
		touristEntities.add(new TouristEntity(44, "Bara kaman", 100, "Architecture", 15, "All time"));
		touristEntities.add(new TouristEntity(45, "Ibrahim Rouza", 1600,
				"islamic monoments that is inspiration for tajmahal", 100, "All time"));
		touristEntities.add(new TouristEntity(46, "Matanga hill", 1020, "hill", 10, "Winter"));
		touristEntities.add(new TouristEntity(47, "Hampi", 1600, "Lotus mahal", 100, "All time"));
		touristEntities.add(new TouristEntity(48, "Tungabadra River", 0, "River", 0, "Rainy"));
		touristEntities.add(new TouristEntity(49, "Daria doulat", 1600, "tippu's summer palac", 100, "All time"));
		touristEntities.add(new TouristEntity(50, "Talakaveri", 1020, "Source of River Kaveri", 0, "Rainy"));
		touristEntities.add(new TouristEntity(51, "Mandalpatti", 100, "hill view point ", 500, "Winter"));
		touristEntities.add(new TouristEntity(52, "Kodachadri", 100, "Trekking", 500, "Winter"));
		touristEntities.add(new TouristEntity(53, "Hidlumane falls", 1600, "Falls", 100, "Rainy and winter"));
		touristEntities.add(new TouristEntity(54, "Mirjan fort ", 100, "fort", 100, "Winter"));

		TouristDAO dao = new TouristDAOImpl();
		dao.putAll(touristEntities);
	}

}
