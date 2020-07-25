package com.amazon.shopping.service;

import java.util.List;
import java.util.Map;

import com.amazon.shopping.entity.Product;

public class Catalogue implements Search {
	private Map<String, List<Product>> productNames;
	private Map<String, List<Product>> productCategories;

	public List<Product> searchProductByName(final String productName) {
		return productNames.get(productName);
	}

	public List<Product> searchProdcutByCategory(final String productCategory) {
		return productCategories.get(productCategory);
	}
}
