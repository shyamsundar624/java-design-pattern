package com.shyam.design;
//Observer interface - All Investors will implement this interface to get the updates
public interface StockObserver {
void update(String stockName,double price);
}
