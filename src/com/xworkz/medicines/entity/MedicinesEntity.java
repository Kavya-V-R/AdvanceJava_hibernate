package com.xworkz.medicines.entity;

import javax.persistence.*;

@Entity
@Table(name="medicines_table")
public class MedicinesEntity {
	@Id
	@Column(name="m_id")
	private int id;
	@Column(name="m_name")
	private String name;
	@Column(name="m_type")
	private String type;
	@Column(name="m_price")
	private int price;
	@Column(name="m_location")
	private String location;
	@Column(name="m_onlineShop")
	private String onlineShop;
	@Column(name="m_composition")
	private String composition;
	public MedicinesEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MedicinesEntity(int id, String name, String type, int price, String location, String onlineShop,
			String composition) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
		this.location = location;
		this.onlineShop = onlineShop;
		this.composition = composition;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getOnlineShop() {
		return onlineShop;
	}
	public void setOnlineShop(String onlineShop) {
		this.onlineShop = onlineShop;
	}
	public String getComposition() {
		return composition;
	}
	public void setComposition(String composition) {
		this.composition = composition;
	}
	@Override
	public String toString() {
		return "MedicinesEntity [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + ", location="
				+ location + ", onlineShop=" + onlineShop + ", composition=" + composition + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MedicinesEntity other = (MedicinesEntity) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

}