package com.xworkz.railwaystation.entity;

import javax.persistence.*;

@Entity
@Table(name="railway_table")
public class RailwayStationEntity {
	@Id
	@Column(name="r_id")
	private int id;
	@Column(name="r_name")
	private String name;
	@Column(name="r_noOfLines")
	private int noOfLines;
	@Column(name="r_noOfPlatforms")
	private int noOfplatforms;
	@Column(name="r_src")
	private String src;
	@Column(name="r_dest")
	private String dest;
	@Column(name="r_price")
	private int price;
	public RailwayStationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RailwayStationEntity(int id, String name, int noOfLines, int noOfplatforms, String src, String dest,
			int price) {
		super();
		this.id = id;
		this.name = name;
		this.noOfLines = noOfLines;
		this.noOfplatforms = noOfplatforms;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfLines() {
		return noOfLines;
	}
	public void setNoOfLines(int noOfLines) {
		this.noOfLines = noOfLines;
	}
	public int getNoOfplatforms() {
		return noOfplatforms;
	}
	public void setNoOfplatforms(int noOfplatforms) {
		this.noOfplatforms = noOfplatforms;
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
		return "RailwayStationEntity [id=" + id + ", name=" + name + ", noOfLines=" + noOfLines + ", noOfplatforms="
				+ noOfplatforms + ", src=" + src + ", dest=" + dest + ", price=" + price + "]";
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
		RailwayStationEntity other = (RailwayStationEntity) obj;
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