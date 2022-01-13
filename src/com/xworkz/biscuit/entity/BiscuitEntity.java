package com.xworkz.biscuit.entity;

import javax.persistence.*;

@Entity
@Table(name="biscuit_table")
public class BiscuitEntity {
	@Id
	@Column(name="b_id")
	private int id;
	@Column(name="b_name")
	private String name;
	@Column(name="b_price")
	private int price;
	@Column(name="b_type")
	private String type;
	@Column(name="b_madeIn")
	private String madeIn;
	@Column(name="b_color")
	private String color;
	@Column(name="b_shoppingSite")
	private String shoppingSite;
	public BiscuitEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BiscuitEntity(int id, String name, int price, String type, String madeIn, String color,
			String shoppingSite) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
		this.madeIn = madeIn;
		this.color = color;
		this.shoppingSite = shoppingSite;
	}
	@Override
	public String toString() {
		return "BiscuitEntity [id=" + id + ", name=" + name + ", price=" + price + ", type=" + type + ", madeIn="
				+ madeIn + ", color=" + color + ", shoppingSite=" + shoppingSite + "]";
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
		BiscuitEntity other = (BiscuitEntity) obj;
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