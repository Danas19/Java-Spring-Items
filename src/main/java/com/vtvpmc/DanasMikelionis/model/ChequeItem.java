package com.vtvpmc.DanasMikelionis.model;

public class ChequeItem {
	private long itemId;
	private long chequeId;
	private int quantity;
	
	protected ChequeItem() { }
	
	public ChequeItem(long itemId, long chequeId, int quantity) {
		this.itemId = itemId;
		this.chequeId = chequeId;
		this.quantity = quantity;
	}

	public long getItemId() {
		return itemId;
	}

	public long getChequeId() {
		return chequeId;
	}

	public int getQuantity() {
		return quantity;
	}
	
}
