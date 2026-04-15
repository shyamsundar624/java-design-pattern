package com.shyam.design.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shyam.design.entity.NotificationLog;
import com.shyam.design.service.NotificationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/notify")
@RequiredArgsConstructor
public class NotificationController {
private final NotificationService service;

@PostMapping("/alert")
public String sendAlert(@RequestParam String recipient,
		@RequestParam String message,
		@RequestParam String channel) {
	service.sendAlert(recipient, message, channel);
	return "Alert sent successfully!";
}

@PostMapping("/reminder")
public String sendReminder(@RequestParam String recipient,
		@RequestParam String message,
		@RequestParam String channel) {
	service.sendReminder(recipient, message, channel);
	return "Reminder sent successfully!";
}

@PostMapping("/promotion")
public String sendPromotion(@RequestParam String recipient,
		@RequestParam String message,
		@RequestParam String channel) {
	service.sendPromotion(recipient, message, channel);
	return "Promotion sent successfully!";
}

@GetMapping("/history")
public List<NotificationLog> getNotificationHistory() {
	return service.getNotificationHistory();
}

}
