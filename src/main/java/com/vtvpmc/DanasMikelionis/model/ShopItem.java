package com.vtvpmc.DanasMikelionis.model;

public class ShopItem {
	private long shopId;
	private long itemId;
	private int quantity;
	
	protected ShopItem() { }
	
	public ShopItem(long shopId, long itemId, int quantity) {
		this.shopId = shopId;
		this.itemId = itemId;
		this.quantity = quantity;
	}

	public long getShopId() {
		return shopId;
	}

	public long getItemId() {
		return itemId;
	}

	public int getQuantity() {
		return quantity;
	}
	
}
