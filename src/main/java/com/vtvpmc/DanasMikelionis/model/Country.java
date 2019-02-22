package com.vtvpmc.DanasMikelionis.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Country {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name;
	private int priceEuros;
	private int priceCents;
	
	protected Country() { }
	
	
}
