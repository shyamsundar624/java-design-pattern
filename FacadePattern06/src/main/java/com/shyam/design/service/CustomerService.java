package com.shyam.design.service;

import org.springframework.stereotype.Service;

import com.shyam.design.entity.Customer;
import com.shyam.design.repository.CustomerRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerService {

	private final CustomerRepository customerRepository;
	
	
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	public Customer validateCustomer(Long customerId) {
		Customer customer = customerRepository.findById(customerId).orElseThrow(()-> new RuntimeException("Customer not found"+ customerId));
		if(!customer.isActive()) {
			throw new RuntimeException("Customer is not active"+ customerId);
		}
		log.info("Customer {} is valid", customerId);
		return customer;
	}
}
