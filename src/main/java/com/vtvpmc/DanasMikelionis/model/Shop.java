package com.vtvpmc.DanasMikelionis.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Shop {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name;
	private String streetAddress;
	private String country;
	private String city;
	
	public Shop() { }
	
	public Shop(long id, String name, String streetAddress, String country,
			String city) {
		this.id = id;
		this.name = name;
		this.streetAddress = streetAddress;
		this.country = country;
		this.city = city;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public String getCountry() {
		return country;
	}

	public String getCity() {
		return city;
	}
	
}
