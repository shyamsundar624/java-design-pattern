package com.shyam.design.composite;

import org.springframework.stereotype.Component;

import com.shyam.design.entity.NotificationLog;
import com.shyam.design.repository.NotificationRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component("pushNotificationSender")
@RequiredArgsConstructor
@Slf4j
public class PushNotification implements MessageSender {
	
	private final NotificationRepository repo;

	@Override
	public void sendMessage(String recipient, String subject, String body) {
		log.info("Sent Push Notification to: {} ", recipient);
		
		repo.save(NotificationLog.builder()
				.channel("PUSH_NOTIFICATION")
				.recipient(recipient)
				.subject(subject)
				.body(body)
				.status("SENT")
				.build());
	}

	@Override
	public String getSenderType() {
		return "PUSH_NOTIFICATION";
	}

}
