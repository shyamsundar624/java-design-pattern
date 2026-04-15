package com.shyam.design.impl;

import java.util.List;

import com.shyam.design.Commentary;
import com.shyam.design.Observer;
import com.shyam.design.Subject;

public class CommentaryObject implements Subject, Commentary {

	private final List<Observer> observers;
	private String desc;
	private final String subjectDetails;
	
	public CommentaryObject(List<Observer> observers, String subjectDetails) {
		this.observers = observers;
		this.subjectDetails = subjectDetails;
	}

	

	@Override
	public void subscribeObserver(Observer observer) {
	observers.add(observer);
		
	}

	@Override
	public void unSubscribeObserver(Observer observer) {
		int index = observers.indexOf(observer);
		observers.remove(index);
	}

	@Override
	public void notifyObserver() {
		System.out.println("Notifying Observers");
		for(Observer observer: observers) {
			observer.update(desc);
		}
		
	}

	@Override
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}
	@Override
	public String subjectDetails() {
		// TODO Auto-generated method stub
		return subjectDetails;
	}

}
