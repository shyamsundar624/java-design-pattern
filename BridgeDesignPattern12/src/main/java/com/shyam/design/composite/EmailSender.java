package com.shyam.design.composite;

import org.springframework.stereotype.Component;

import com.shyam.design.entity.NotificationLog;
import com.shyam.design.repository.NotificationRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component("emailSender")
@RequiredArgsConstructor
@Slf4j
public class EmailSender implements MessageSender {
private final NotificationRepository repo;

@Override
public void sendMessage(String recipient, String subject, String body) {
log.info("SenT Email to: {} ", recipient);

	repo.save(NotificationLog.builder()
			.channel("EMAIL")
			.recipient(recipient)
			.subject(subject)
			.body(body)
			.status("SENT")
			.build());

	
}

@Override
public String getSenderType() {
	// TODO Auto-generated method stub
	return "EMAIL";
}




}
