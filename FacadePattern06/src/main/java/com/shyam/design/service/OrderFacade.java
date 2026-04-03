package com.shyam.design.service;

import org.springframework.stereotype.Service;

import com.shyam.design.dto.OrderRequest;
import com.shyam.design.entity.Customer;
import com.shyam.design.entity.Order;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderFacade {
//All Subsystems Injected here
	private final CustomerService customerService;
	private final InventoryService inventoryService;
	private final PaymentService paymentService;
	private final OrderService orderService;
	private final NotificationService notificationService;
	
	public Order placeOrder(OrderRequest orderRequest) {
		log.info("Starting order placement process for customer {}", orderRequest.getCustomerId());
		
		//step 1: Validate Customer(subsystem 1)
		
		Customer customer = customerService.validateCustomer(orderRequest.getCustomerId());
		
		//step 2: Check and Reserve Stock(subsystem 2)
		var product = inventoryService.checkAndReserveStock(orderRequest.getProductId(), orderRequest.getQuantity());
		
		//step 3: Calculate total amount & process payment(subsystem 3)
		
		double totalAmount = product.getPrice() * orderRequest.getQuantity();	
		boolean paid = paymentService.processPayment(orderRequest.getCustomerId(), totalAmount);
		
		if(!paid) {
			throw new RuntimeException("Payment failed for customer"+ orderRequest.getCustomerId());
		}
		
		//step 4: Save Order(subsystem 4)
		Order order = orderService.SaveOrder(orderRequest.getCustomerId(), orderRequest.getProductId(), orderRequest.getQuantity(), totalAmount);
		
		//step 5: Send Notification(subsystem 5)
		notificationService.sendConfirmationEmail(customer.getEmail(), order.getId(),totalAmount);
	
	log.info("Order placement process completed successfully for customer {}", orderRequest.getCustomerId());
	
	return order;
	}
}
