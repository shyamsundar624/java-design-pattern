package com.shyam.design;

public interface Subject {
public void subscribeObserver(Observer observer);
public void unSubscribeObserver(Observer observer);
public void notifyObserver();
public String subjectDetails();
}
