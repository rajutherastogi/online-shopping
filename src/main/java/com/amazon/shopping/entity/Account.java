package com.amazon.shopping.entity;

import com.amazon.shopping.enums.AccountStatus;

public class Account {
	private String userName;
	private String password;
	private AccountStatus status;
	private String name;
	private Address shippingAddress;
	private String phone;
	private String email;

	public boolean addProduct(final Product product) {
		return false;
	}

	public boolean addProductReview(final ProductReview productReview) {
		return false;
	}

	public boolean resetPassword() {
		return false;

	}
}
