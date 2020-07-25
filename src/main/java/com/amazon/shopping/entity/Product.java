package com.amazon.shopping.entity;

public class Product {
	private String productId;
	private String name;
	private String description;
	private int quantity;
	private Account seller;
	private ProductCategory productCategory;
	private int availableQuantity;
	private double price;
	
	public int getAvailableCount() {
		return this.availableQuantity;
	}
	
	public boolean updatePrice(final double newPrice) {
		return false;
	}
}
