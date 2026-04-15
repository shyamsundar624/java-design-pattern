package com.shyam.design.impl;

import com.shyam.design.StockObserver;

public class TradingBot implements StockObserver {

	private double buyThreshold;

	public TradingBot(double buyThreshold) {
		this.buyThreshold = buyThreshold;
	}

	@Override
	public void update(String stockName, double price) {
		if (price <= buyThreshold) {
			System.out.println("[Trading Bot] Buying " + stockName + " at " + price);
		} else {
			System.out.println("[Trading Bot] Price of " + stockName + " is " + price + ". Not buying.");
		}
	}

}
