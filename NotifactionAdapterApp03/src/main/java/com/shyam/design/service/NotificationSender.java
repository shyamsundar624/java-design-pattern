package com.shyam.design.service;


// This interface defines the contract for sending notifications. It can be implemented by various classes to provide different notification sending mechanisms (e.g., email, SMS, push notifications).
public interface NotificationSender {
void send(String recipient, String message);
}
