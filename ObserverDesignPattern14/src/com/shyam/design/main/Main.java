package com.shyam.design.main;

import com.shyam.design.StockMarket;
import com.shyam.design.StockObserver;
import com.shyam.design.impl.EmailNotification;
import com.shyam.design.impl.MobileAppAlert;
import com.shyam.design.impl.TradingBot;

public class Main {
	public static void main(String[] args) {
		// Create the stock market
		StockMarket stockMarket = new StockMarket();

		// Create observers
		StockObserver investor1 = new MobileAppAlert("Alice");
		StockObserver investor2 = new EmailNotification("rahul@gmail.com");
		StockObserver investor3 = new TradingBot(1500.00);

		// Register observers
		stockMarket.registerObserver(investor1);
		stockMarket.registerObserver(investor2);
		stockMarket.registerObserver(investor3);
		
		// Simulate stock price changes
		stockMarket.setStockPrice("AAPL", 1850.00);	
		stockMarket.setStockPrice("AAPL", 2800.00);
		
		//unsubscrib email notification
		stockMarket.removeObserver(investor2);

		stockMarket.setStockPrice("AAPL", 1450.00);	
	}

}
