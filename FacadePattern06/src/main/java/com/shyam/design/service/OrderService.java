package com.shyam.design.service;

import org.springframework.stereotype.Service;

import com.shyam.design.entity.Order;
import com.shyam.design.repository.OrderRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {
private final OrderRepository orderRepository;

public Order SaveOrder(Long customerId, Long productId, int quantity, double totalAmount) {
	Order order = new Order();
	order.setCustomerId(customerId);
	order.setProductId(productId);
	order.setQuantity(quantity);
	order.setTotalAmount(totalAmount);
	orderRepository.save(order);
	log.info("Order saved successfully for customer {}", customerId);
	return order;
	
}
}
