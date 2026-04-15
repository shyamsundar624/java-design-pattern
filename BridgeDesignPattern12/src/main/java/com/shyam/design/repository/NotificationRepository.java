package com.shyam.design.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shyam.design.entity.NotificationLog;

public interface NotificationRepository extends JpaRepository<NotificationLog, Long> {

}
