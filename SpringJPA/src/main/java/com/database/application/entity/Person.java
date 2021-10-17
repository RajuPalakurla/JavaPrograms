package com.database.application.entity;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private String location;
	private Date birt_date;
	
	public Person() {
		
	}
	public Person(String name, String location, Date birt_date) {
		super();
		this.name = name;
		this.location = location;
		this.birt_date = birt_date;
	}

	public Person(int id, String name, String location, Date birt_date) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birt_date = birt_date;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getBirt_date() {
		return birt_date;
	}

	public void setBirt_date(Date birt_date) {
		this.birt_date = birt_date;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", location=" + location + ", birt_date=" + birt_date + "]";
	}
}
