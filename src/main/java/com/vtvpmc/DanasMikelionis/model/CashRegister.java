package com.vtvpmc.DanasMikelionis.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CashRegister {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private long shopId;
	
	protected CashRegister() { }
	
	public CashRegister(long id, long shopId) {
		this.id = id;
		this.shopId = shopId;
	}

	public long getId() {
		return id;
	}

	public long getShopId() {
		return shopId;
	}
	
}
