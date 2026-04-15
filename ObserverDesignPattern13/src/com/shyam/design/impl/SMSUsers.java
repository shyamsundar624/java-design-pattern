package com.shyam.design.impl;

import com.shyam.design.Observer;
import com.shyam.design.Subject;

public class SMSUsers implements Observer {

	private final Subject subject;
	private  String desc;
	private  String userInfo;
	
	public SMSUsers(Subject subject, String userInfo) {
		if(subject == null) {
			throw new IllegalArgumentException("Subject cannot be null");
		}
		this.subject = subject;
		this.userInfo = userInfo;
	}
	
	@Override
	public void update(String desc) {
		System.out.println("SMS User "+userInfo+" received update: "+desc);		
		this.desc = desc;
	}

	@Override
	public void subcribe() {

		subject.subscribeObserver(this);
		System.out.println("SMS User "+userInfo+" subscribed to subject: "+subject.subjectDetails());
	}

	@Override
	public void unSubcribe() {
		subject.unSubscribeObserver(this);
		System.out.println("SMS User "+userInfo+" unsubscribed from subject: "+subject.subjectDetails());		
	}

}
