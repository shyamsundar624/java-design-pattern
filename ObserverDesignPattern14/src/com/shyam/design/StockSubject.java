package com.shyam.design;
//Subject interface - StockMarket will implement this interface to register,unregister and notify the investors
public interface StockSubject {
void registerObserver(StockObserver stockObserver);
void removeObserver(StockObserver stockObserver);
void notifyObservers();
}
