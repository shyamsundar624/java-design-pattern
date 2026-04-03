package com.shyam.design.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shyam.design.dto.OrderRequest;
import com.shyam.design.entity.Order;
import com.shyam.design.service.OrderFacade;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {

	private final OrderFacade orderFacade;
	
	@PostMapping("/place")
	public ResponseEntity<Order> placeOrder(@RequestBody OrderRequest orderRequest) {
		Order order = orderFacade.placeOrder(orderRequest);
		return ResponseEntity.ok(order);
	}
}
