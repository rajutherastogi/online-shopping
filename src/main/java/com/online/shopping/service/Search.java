package com.online.shopping.service;

import java.util.List;

import com.online.shopping.entity.Product;

public interface Search {
	public List<Product> searchProductByName(final String name);
	public List<Product> searchProdcutByCategory(final String name);
}
