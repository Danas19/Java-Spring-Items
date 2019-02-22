package com.vtvpmc.DanasMikelionis;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class CreateShopCommand {
	private long id;
	
	@NotNull
	@Length(min = 1, max = 30)
	private String name;
	
	@NotNull
	@Length(min = 1, max = 255)
	private String streetAddress;
	
	@NotNull
	@Length(min = 1, max = 100)
	private String country;
	
	@NotNull
	@Length(min = 1, max = 100)
	private String city;

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
