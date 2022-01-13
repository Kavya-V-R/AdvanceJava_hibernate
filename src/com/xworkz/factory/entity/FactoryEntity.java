package com.xworkz.factory.entity;

import javax.persistence.*;

@Entity
@Table(name="factory_table")
public class FactoryEntity {
	@Id
	@Column(name="f_id")
	private int id;
	@Column(name="f_name")
	private String name;
	@Column(name="f_type")
	private String type;
	@Column(name="f_noOfWorkers")
	private int noofWorkers;
	@Column(name="f_salary")
	private int salary;
	@Column(name="f_state")
	private String state;
	@Column(name="f_city")
	private String city;
	public FactoryEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FactoryEntity(int id, String name, String type, int noofWorkers, int salary, String state, String city) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.noofWorkers = noofWorkers;
		this.salary = salary;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNoofWorkers() {
		return noofWorkers;
	}
	public void setNoofWorkers(int noofWorkers) {
		this.noofWorkers = noofWorkers;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
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
		return "FactoryEntity [id=" + id + ", name=" + name + ", type=" + type + ", noofWorkers=" + noofWorkers
				+ ", salary=" + salary + ", state=" + state + ", city=" + city + "]";
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
		FactoryEntity other = (FactoryEntity) obj;
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