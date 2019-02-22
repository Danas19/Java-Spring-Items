package com.vtvpmc.DanasMikelionis;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class CreateItemCommand {
	private long id;
	
	@NotNull
	@Length(min = 1, max = 30)
	private String name;
	
	@NotNull
	private int priceEuros;
	
	@NotNull
	private int priceCents;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPriceEuros() {
		return priceEuros;
	}

	public int getPriceCents() {
		return priceCents;
	}
	
}
