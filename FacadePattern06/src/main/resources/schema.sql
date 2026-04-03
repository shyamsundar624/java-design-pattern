CREATE TABLE customer (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255),
    email VARCHAR(255),
    active TINYINT(1) DEFAULT 0,
    PRIMARY KEY (id)
);

CREATE TABLE product (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255),
    price DOUBLE,
    stock INT,
    PRIMARY KEY (id)
);

CREATE TABLE orders (
    id BIGINT NOT NULL AUTO_INCREMENT,
    customer_id BIGINT,
    product_id BIGINT,
    quantity INT,
    total_amount DOUBLE,
    status VARCHAR(255),
    PRIMARY KEY (id),
    FOREIGN KEY (customer_id) REFERENCES customer(id),
    FOREIGN KEY (product_id) REFERENCES product(id)
);