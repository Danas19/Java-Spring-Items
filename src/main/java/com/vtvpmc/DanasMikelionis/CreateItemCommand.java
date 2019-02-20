package com.vtvpmc.DanasMikelionis;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class CreateItemCommand {
	long id;
	
	@NotNull
	@Length(min = 1, max = 30)
	String name;
	
	@NotNull
	int priceEuros;
	
	@NotNull
	int priceCents;

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

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPriceEuros(int priceEuros) {
		this.priceEuros = priceEuros;
	}

	public void setPriceCents(int priceCents) {
		this.priceCents = priceCents;
	}
	
	
}
