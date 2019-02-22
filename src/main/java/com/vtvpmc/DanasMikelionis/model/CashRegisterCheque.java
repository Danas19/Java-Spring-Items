package com.vtvpmc.DanasMikelionis.model;

public class CashRegisterCheque {
	private long cashRegisterId;
	private long chequeId;
	
	protected CashRegisterCheque() { }
	
	public CashRegisterCheque(long cashRegisterId, long chequeId) {
		this.cashRegisterId = cashRegisterId;
		this.chequeId = chequeId;
	}

	public long getCashRegisterId() {
		return cashRegisterId;
	}

	public long getChequeId() {
		return chequeId;
	}
	
}
