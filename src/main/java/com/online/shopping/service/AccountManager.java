package com.online.shopping.service;

import java.util.List;

import com.online.shopping.entity.Account;
import com.online.shopping.entity.Item;
import com.online.shopping.entity.Member;
import com.online.shopping.entity.Order;
import com.online.shopping.entity.Product;

public class AccountManager {
	public boolean createAccount(final Account account) {
		return false;
	}
	
	public boolean addProduct(final Product product) {
		return false;
	}
	
	public List<Product> fetchProductsByName(final String productName) {
		return null;
	}
	
	public List<Product> fetchProductsByCategory(final String productCategory){
		return null;
	}
	
	public boolean addItemToCart(final Item item, final Member member) {
		return false;
	}
	
	public boolean removeItemFromCart(final Item item, final Member member) {
		return false;
	}
	
	public boolean placeOrder(final Member member, final Order order) {
		return false;
	}
}
