package com.amazon.shopping.entity;

import java.sql.Date;

import com.amazon.shopping.enums.OrderStatus;

public class Order {
	private String orderId;
	private OrderStatus orderStatus;
	private Date orderedOn;
}
