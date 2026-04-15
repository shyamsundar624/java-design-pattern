package com.shyam.design;

public class ReminderNotification extends Notification {

	public ReminderNotification(MessageSender messageSender) {
		super(messageSender);
	}

	@Override
	public void send(String recipient, String message) {
		String subject = "REMINDER: Don't Forget!";
		String body = "[Reminder] " + message + " | Please remember to complete the task.";
		
		System.out.println("Sending  REMINDER via " + messageSender.getSenderType());
		messageSender.sendMessage(recipient, subject, body);

	}

	@Override
	public String getNotificationType() {
		return "Reminder Notification";
	}

}
