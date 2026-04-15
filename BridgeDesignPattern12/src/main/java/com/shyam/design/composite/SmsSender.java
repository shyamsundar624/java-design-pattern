package com.shyam.design.composite;

import org.springframework.stereotype.Component;

import com.shyam.design.repository.NotificationRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component("smsSender")
@RequiredArgsConstructor
@Slf4j
public class SmsSender implements MessageSender {
	
	private final NotificationRepository repo;

	@Override
	public void sendMessage(String recipient, String subject, String body) {
log.info("Sent SMS to: {} ", recipient);
		
		repo.save(com.shyam.design.entity.NotificationLog.builder()
				.channel("SMS")
				.recipient(recipient)
				.subject(subject)
				.body(body)
				.status("SENT")
				.build());
	}

	@Override
	public String getSenderType() {
		return "SMS";
	}

}
