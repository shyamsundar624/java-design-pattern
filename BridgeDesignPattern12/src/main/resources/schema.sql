CREATE DATABASE notification_db;
USE notification_db;

CREATE TABLE notification_log (
    id                BIGINT AUTO_INCREMENT PRIMARY KEY,
    notification_type VARCHAR(50),   -- ALERT, REMINDER, PROMOTION
    channel           VARCHAR(50),   -- EMAIL, SMS, PUSH
    recipient         VARCHAR(255),
    subject           VARCHAR(255),
    body              TEXT,
    status            VARCHAR(20),   -- SENT, FAILED
    sent_at           DATETIME 
);