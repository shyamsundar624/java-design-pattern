package com.shyam.design.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shyam.design.entity.Notificatin;
import com.shyam.design.repository.Notificationrepository;
import com.shyam.design.service.NotificationSender;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
private final NotificationSender emailSender;
private final NotificationSender smsSender;
private final Notificationrepository repository;

public NotificationController(@Qualifier("emailSender") NotificationSender emailSender,@Qualifier("smsSender") NotificationSender smsSender,
		Notificationrepository repository) {
	this.emailSender = emailSender;
	this.smsSender = smsSender;
	this.repository = repository;
}

@PostMapping("/send")
public String sendNotification(@RequestParam String channel,
		@RequestParam	String recipient, 
		@RequestParam String message) {
NotificationSender sender= channel.equalsIgnoreCase("SMS")?smsSender:emailSender;
sender.send(recipient, message);

//Persist the notification details in the database
Notificatin notification = new Notificatin();
notification.setRecipient(recipient);
notification.setMessage(message);
notification.setChannel(channel.toUpperCase());
notification.setSentAt(LocalDateTime.now());
repository.save(notification);

return channel.toUpperCase()+" notification sent to "+recipient;
}

@GetMapping("/all")
public List<Notificatin> getAllNotifications(){
	return repository.findAll();
}

}
