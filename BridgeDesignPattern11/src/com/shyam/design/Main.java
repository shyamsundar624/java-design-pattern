package com.shyam.design;

public class Main {
public static void main(String[] args) {

	//Create the implementors
	
	MessageSender email = new EmailSender();
	MessageSender sms = new SmsSender();
	MessageSender push = new PushNotificationSender();
	
	System.out.println("===========================");
	System.out.println(" BRIDGE DESIGN PATTERN DEMO");
	System.out.println("===========================");
	
	//1. Alert by Email
	Notification alert = new AlertNotification(email);
alert.send("alert@gamil.com", "Server Down! Immediate Action Required!");

	//2. Alert By SMS-SWAP channel,same notification type
alert.setSender(sms);
alert.send("123-456-7890", "Server Down! Immediate Action Required!");

//Reminder via Push Notification
Notification reminder = new ReminderNotification(push);
reminder.send("Device123", "Meeting at 3 PM. Don't forget to join the conference call!");
}
}
