package com.shyam.design.impl;

import com.shyam.design.StockObserver;

public class EmailNotification implements StockObserver {

	private String email;

	public EmailNotification(String email) {
		this.email = email;
	}

	@Override
	public void update(String stockName, double price) {
		System.out.println("[Email Notification to " + email + "] " + stockName + " is now " + price);
	}

}
