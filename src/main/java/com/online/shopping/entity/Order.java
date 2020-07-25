package com.online.shopping.entity;

import java.sql.Date;

import com.online.shopping.enums.OrderStatus;

public class Order {
	private String orderId;
	private OrderStatus orderStatus;
	private Date orderedOn;
}
