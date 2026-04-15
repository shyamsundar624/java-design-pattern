package com.shyam.design.impl;

import com.shyam.design.StockObserver;

public class MobileAppAlert implements StockObserver {

	private String userName;

	public MobileAppAlert(String userName) {
		this.userName = userName;
	}

	@Override
	public void update(String stockName, double price) {
		System.out.println("[Mobile ALert - " + userName + "]" + stockName + " is now " + price);
	}

}
