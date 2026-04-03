package com.shyam.design.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shyam.design.entity.Product;
import com.shyam.design.service.InventoryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
	private final InventoryService productService;

	@PostMapping("/add")
	public ResponseEntity<Product> addProduct(@RequestBody Product product) {
		Product savedProduct = productService.saveProduct(product);
		return ResponseEntity.ok(savedProduct);

	}
}
