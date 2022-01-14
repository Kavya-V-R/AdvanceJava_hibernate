package com.xworkz.airport;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.airport.dao.AirportDAO;
import com.xworkz.airport.dao.AirportDAOImpl;
import com.xworkz.airport.entity.AirportEntity;

public class AirportRunner {

	public static void main(String[] args) {
		List<AirportEntity> airportEntities = new ArrayList<AirportEntity>();

		airportEntities.add(new AirportEntity(1, "karnataka", "Kempegowda International Airport",
		"Jayprakash Narayan International Airport", 8000));
		airportEntities.add(new AirportEntity(2, "Andra pradesh", "Vizag airport", " KIA", 5000));
		airportEntities.add(new AirportEntity(3, "Andra pradesh", "Vijayawada airport", "All KIA", 5000));
		airportEntities.add(new AirportEntity(4, "Andaman and Nicobar", "Veer sarkar airport", "All KIA", 5000));
		airportEntities.add(new AirportEntity(5, "Assam", "LGBIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(6, "Bihar", "Gaya airport", "All IA", 5000));
		airportEntities.add(new AirportEntity(7, "Chandigarh", "Chandigarh airport", "All IA", 5000));
		airportEntities.add(new AirportEntity(8, "Delhi", "IGIA", "All time", 5000));
		airportEntities.add(new AirportEntity(9, "Goa", "Dambolim Airport", "All IA", 5000));
		airportEntities.add(new AirportEntity(10, "Gujarath ", "SVPIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(11, "Gujarath", "SIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(12, "Jammu and Kashmir", "SUAIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(13, "karnataka", "MIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(14, "Kerala", "TIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(15, "Kerala", "CIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(16, "Kerala", "KCIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(17, "Kerala", "KIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(18, "Kerala", "CIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(19, "Mandya Pradesh", "DABHA", "All IA", 5000));
		airportEntities.add(new AirportEntity(20, "Maharastra", "CSIMA", "All IA", 5000));
		airportEntities.add(new AirportEntity(21, "Maharastra", "DBAIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(22, "Pune", "PIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(23, "Manipur", "MIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(24, "Odisha", "BPIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(25, "Punjab", "SGRDJIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(26, "Rajastan", "JIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(27, "Tamilnadu", "CIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(28, "Tamilnadu", "CIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(29, "Tamilnadu", "MIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(30, "Tamilnadu", "TIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(31, "Telangan", "RGIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(32, "Uttar Pradesh", "CCSIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(33, "Uttar Pradesh", "LBSIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(34, "West Bengal", "NSCBIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(35, "West Bengal", "BA", "All IA", 5000));
		airportEntities.add(new AirportEntity(36, "New yark", "JFKIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(37, "lOS Angles", "LAIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(38, "Chicago", "CHIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(39, "Miami", "MIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(40, "San Francisco", "SFIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(41, "Washington", "WDIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(42, "Atlanta", "HJAIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(43, "Newark", "NLIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(44, "Orlando", "OIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(45, "Boston", "GELLIA", "All IA", 8000));
		airportEntities.add(new AirportEntity(46, "Las Vegas", "MCIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(47, "Seattle", "STIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(48, "New orleans", "LANOIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(49, "Houseton", "DFWIA", "All IA", 4000));
		airportEntities.add(new AirportEntity(50, "San Diego", "SDIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(51, "Honolulu", "DKIIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(52, "Fort lauderldale", "FLHIA", "All IA", 8000));
		airportEntities.add(new AirportEntity(53, "Las Vegas", "MCIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(54, "Tamilnadu", "MIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(55, "Washington", "WDIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(56, "New yark", "JFKIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(57, "Seattle", "STIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(58, "Washington", "WDIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(59, "Seattle", "STIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(60, "Las Vegas", "MCIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(61, "Tamilnadu", "MIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(62, "Tamilnadu", "MIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(63, "Miami", "MIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(64, "Las Vegas", "MCIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(65, "New yark", "JFKIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(66, "Seattle", "STIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(67, "New yark", "JFKIA", "KIA", 5000));
		airportEntities.add(new AirportEntity(68, "West Bengal", "NSCBIA", "KIA", 5000));
		airportEntities.add(new AirportEntity(69, "Las Vegas", "MCIA", "KIA", 5000));
		airportEntities.add(new AirportEntity(70, "New yark", "JFKIA", "KIA", 5000));
		airportEntities.add(new AirportEntity(71, "Miami", "MIA", "All IA", 5000));
		airportEntities.add(new AirportEntity(72, "Washington", "WDIA", "KIA", 6000));
		airportEntities.add(new AirportEntity(73, "Las Vegas", "MCIA", "KIA", 5000));

		AirportDAO dao = new AirportDAOImpl();

		dao.putAll(airportEntities);
	}

}