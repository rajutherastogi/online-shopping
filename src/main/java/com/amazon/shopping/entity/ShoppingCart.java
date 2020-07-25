package com.amazon.shopping.entity;

import java.util.List;

public class ShoppingCart {
	private List<Item> items;

	public boolean addItem(final Item item) {
		return this.items.add(item);
	}

	public boolean removeItem(final Item item) {
		return this.items.remove(item);
	}

	public boolean updateItemQuantity(final Item item, final int quantity) {
		return item.updateQuantity(quantity);
	}

	public List<Item> getItems() {
		return this.items;
	}

	public boolean checkout() {
		return false;
	}
}
