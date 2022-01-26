package com.xworkz.shopgrocery.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data

@Entity
@Table(name = "shopgrocery_details")

public class ShopGroceryEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "s_id")
	private int id;
	@Column(name = "s_name")
	private String name;
	@Column(name = "s_mailId")
	private String mailId;
	@Column(name = "s_mobNumber")
	private long mobNumber;
	@Column(name = "s_address")
	private String address;
	@Column(name = "s_city")
	private String city;
	@Column(name = "s_state")
	private String state;
	@Column(name = "s_pincode")
	private int pincode;
	@Column(name = "s_groceryName")
	private String groceryName;
	@Column(name = "s_brand")
	private String brand;
	@Column(name = "s_quantity")
	private float quantity;
	@Column(name = "s_createdBy")
	private String createdBy;
	@Column(name = "s_createdAt")
	private LocalDateTime createdAt;
	@Column(name = "s_updatedBy")
	private String updatedBy;
	@Column(name = "s_updatedAt")
	private LocalDateTime updatedAt;

	public ShopGroceryEntity(String name, String mailId, long mobNumber, String address, String city, String state,
			int pincode, String groceryName, String brand, float quantity, String createdBy, LocalDateTime createdAt,
			String updatedBy, LocalDateTime updatedAt) {
		super();
		this.name = name;
		this.mailId = mailId;
		this.mobNumber = mobNumber;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.groceryName = groceryName;
		this.brand = brand;
		this.quantity = quantity;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
		this.updatedBy = updatedBy;
		this.updatedAt = updatedAt;
	}

}
