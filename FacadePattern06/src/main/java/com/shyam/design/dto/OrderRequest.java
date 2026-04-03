package com.shyam.design.dto;

import lombok.Data;

@Data
public class OrderRequest {
private Long customerId;
private Long productId;
private int quantity;
}
