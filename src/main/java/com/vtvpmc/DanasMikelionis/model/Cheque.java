package com.vtvpmc.DanasMikelionis.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Cheque {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private long cashRegisterId;
	
	protected Cheque() { }
	
	public Cheque(long id, long cashRegisterId) {
		this.id = id;
		this.cashRegisterId = cashRegisterId;
	}

	public long getId() {
		return id;
	}

	public long getCashRegisterId() {
		return cashRegisterId;
	}
	
}
