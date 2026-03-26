CREATE TABLE notification (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    recipient VARCHAR(255),
    message VARCHAR(255),
    channel VARCHAR(255),
    sent_at DATETIME
);