package com.shyam.design;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements StockSubject {
	private List<StockObserver> stockObservers;
	private String stockName;
	private double price;

	public StockMarket() {
		stockObservers = new ArrayList<>();
	}

	@Override
	public void registerObserver(StockObserver stockObserver) {
		stockObservers.add(stockObserver);
		System.out.println("Registered observer: " + stockObserver.getClass().getSimpleName());
	}

	@Override
	public void removeObserver(StockObserver stockObserver) {
		stockObservers.remove(stockObserver);
		System.out.println("Removed observer: " + stockObserver.getClass().getSimpleName());
		
	}

	@Override
	public void notifyObservers() {
		for (StockObserver observer : stockObservers) {
			observer.update(stockName, price);
		}
	}

	public void setStockPrice(String stockName, double price) {
		System.out.println("StockMarket: Setting stock price for " + stockName + " to " + price);
		this.stockName = stockName;
		this.price = price;
		notifyObservers();
	}

}
