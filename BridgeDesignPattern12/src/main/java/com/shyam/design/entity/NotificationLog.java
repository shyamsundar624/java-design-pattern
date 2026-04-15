package com.shyam.design.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "notification_log")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class NotificationLog {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String notificationType;
	private String channel;
	private String recipient;
	private String subject;
	private String body;
	private String status;
	private LocalDateTime sentAt;

	@PrePersist
	public void prePersist() {
		sentAt = LocalDateTime.now();
	}

}
