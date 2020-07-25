package com.amazon.shopping.entity;

public abstract class Customer {
	private ShoppingCart shoppingCart;
	private Order order;

	public ShoppingCart getShoppingCart() {
		return this.shoppingCart;
	}

	public boolean addItemToCart(final Item item) {
		return false;
	}

	public boolean removeItemFromCart(final Item item) {
		return false;
	}
}
