package com.shyam.design.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.shyam.design.composite.MessageSender;
import com.shyam.design.entity.NotificationLog;
import com.shyam.design.repository.NotificationRepository;
import com.shyam.design.type.AlertNotification;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class NotificationService {

	private final MessageSender emailSender;
	private final MessageSender smsSender;
	private final MessageSender pushSender;
	
	private final NotificationRepository repo;
	
	// ✅ @Qualifier must go on constructor parameters, not fields
    public NotificationService(
            @Qualifier("emailSender") MessageSender emailSender,
            @Qualifier("smsSender") MessageSender smsSender,
            @Qualifier("pushNotificationSender") MessageSender pushSender,
            NotificationRepository repo) {

        this.emailSender = emailSender;
        this.smsSender   = smsSender;
        this.pushSender  = pushSender;
        this.repo        = repo;
    }
	//pick channel dynamically
	
	private MessageSender resolveSender(String channel) {
		return switch (channel.toUpperCase()) {
		case "EMAIL" -> emailSender;
		case "SMS" -> smsSender;
		case "PUSH_NOTIFICATION" -> pushSender;
		default -> throw new IllegalArgumentException("Invalid channel: " + channel);
		};
	}
	
	public void sendAlert(String recipient,String message, String channel) {
		AlertNotification notification = new AlertNotification(resolveSender(channel));
		
		notification.send(recipient, message);
	}
	
	public void sendReminder(String recipient,String message, String channel) {
		AlertNotification notification = new AlertNotification(resolveSender(channel));
		
		notification.send(recipient, message);
	}
	
	public void sendPromotion(String recipient,String message, String channel) {
		AlertNotification notification = new AlertNotification(resolveSender(channel));
		
		notification.send(recipient, message);
	}
	
	public List<NotificationLog> getNotificationHistory() {
		return repo.findAll();
	}
	
}
