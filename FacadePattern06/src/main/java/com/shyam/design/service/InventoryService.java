package com.shyam.design.service;

import org.springframework.stereotype.Service;

import com.shyam.design.entity.Product;
import com.shyam.design.repository.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class InventoryService {

	private final ProductRepository productRepository;
	
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}
	
	public Product checkAndReserveStock(Long productId, int quantity) {
		
		Product product = productRepository.findById(productId).orElseThrow(()-> new RuntimeException("Product not found"+ productId));
	
		if(product.getStock() < quantity) {
			throw new RuntimeException("Insufficient stock for product"+ product.getName());
		}
		
		product.setStock(product.getStock() - quantity);
		productRepository.save(product);
		log.info("Reserved {} units of product {}", quantity, product.getName());
		return product;
	
	
	}
}
