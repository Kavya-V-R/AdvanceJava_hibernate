package com.xworkz.entity;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data

@Entity
@Table(name = "register_details")

public class RegisterEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "r_id")
	private int id;
	@Column(name = "r_userName")
	private String userName;
	@Column(name = "r_email")
	private String email;
	@Column(name = "r_password")
	private String password;
	@Column(name = "r_city")
	private String city;
	@Column(name = "r_country")
	private String country;
	@Column(name = "r_mobNumber")
	private long mobNumber;
	@Column(name = "r_indianCitizen")
	private boolean indianCitizen;

	public RegisterEntity(String userName, String email, String password, String city, String country, long mobNumber,
			boolean indianCitizen) {
		super();
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.city = city;
		this.country = country;
		this.mobNumber = mobNumber;
		this.indianCitizen = indianCitizen;
	}
}
