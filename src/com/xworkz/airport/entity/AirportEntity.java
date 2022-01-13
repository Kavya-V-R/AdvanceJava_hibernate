package com.xworkz.airport.entity;

import javax.persistence.*;

@Entity
@Table(name="airport_table")
public class AirportEntity {
	@Id
	@Column(name="a_id")
	private int id;
	@Column(name="a_name")
	private String airportName;
	@Column(name="a_src")
	private String src;
	@Column(name="a_dest")
	private String dest;
	@Column(name="a_price")
	private int price;
	public AirportEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AirportEntity(int id, String airportName, String src, String dest, int price) {
		super();
		this.id = id;
		this.airportName = airportName;
		this.src = src;
		this.dest = dest;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "AirportEntity [id=" + id + ", airportName=" + airportName + ", src=" + src + ", dest=" + dest
				+ ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airportName == null) ? 0 : airportName.hashCode());
		result = prime * result + id;
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
		AirportEntity other = (AirportEntity) obj;
		if (airportName == null) {
			if (other.airportName != null)
				return false;
		} else if (!airportName.equals(other.airportName))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	

}