CREATE DATABASE filesystem_db;
USE filesystem_db;

-- Spring JPA will auto-create the table via ddl-auto=update
-- But here's the structure for reference:

CREATE TABLE file_system_item (
    id          BIGINT AUTO_INCREMENT PRIMARY KEY,
    name        VARCHAR(255) NOT NULL,
    type        VARCHAR(10) NOT NULL,   -- 'FILE' or 'FOLDER'
    size_kb     DOUBLE DEFAULT 0,       -- for files
    parent_id   BIGINT,                 -- null = root
    created_at  DATETIME,
    FOREIGN KEY (parent_id) REFERENCES file_system_item(id)
);