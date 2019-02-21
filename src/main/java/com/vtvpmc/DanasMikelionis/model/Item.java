package com.vtvpmc.DanasMikelionis.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name;
	private int priceEuros;
	private int priceCents;
	
	protected Item() { }
	
	public Item(String name, int priceEuros, int priceCents) {
		this.name = name;
		this.priceEuros = priceEuros;
		this.priceCents = priceCents;
	}
	
	@Override
	public String toString() {
		return String.format("%s (id: '%d', price: %d.%s EUR)",
				this.name, this.id, this.priceEuros, this.printPriceCents(priceCents));
	}
	
	private String printPriceCents(int priceCents) {
		if (priceCents < 10) {
			return priceCents + "0";
		} else {
			return "" + priceCents;
		}
	}

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
