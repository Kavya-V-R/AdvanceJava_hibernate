package com.xworkz.silkmanufacture.entity;

import javax.persistence.*;

@Entity
@Table(name="silk_table")
public class SilkManufactureEntity {
	@Id
	@Column(name="s_id")
	private int id;
	@Column(name="s_name")
	private String name;
	@Column(name="s_material")
	private String material;
	@Column(name="s_price")
	private int price;
	@Column(name="s_noOfWorkers")
	private int noOfWorkers;
	@Column(name="s_state")
	private String state;
	@Column(name="s_city")
	private String city;
	public SilkManufactureEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SilkManufactureEntity(int id, String name, String material, int price, int noOfWorkers, String state,
			String city) {
		super();
		this.id = id;
		this.name = name;
		this.material = material;
		this.price = price;
		this.noOfWorkers = noOfWorkers;
		this.state = state;
		this.city = city;
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
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNoOfWorkers() {
		return noOfWorkers;
	}
	public void setNoOfWorkers(int noOfWorkers) {
		this.noOfWorkers = noOfWorkers;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "SilkManufactureEntity [id=" + id + ", name=" + name + ", material=" + material + ", price=" + price
				+ ", noOfWorkers=" + noOfWorkers + ", state=" + state + ", city=" + city + "]";
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
		SilkManufactureEntity other = (SilkManufactureEntity) obj;
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