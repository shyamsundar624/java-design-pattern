package com.shyam.design.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shyam.design.entity.FileSystemItem;
import com.shyam.design.service.FileSystemService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/filesystem")
@RequiredArgsConstructor	
public class FileSystemController {

	private final FileSystemService service;
	
	@PostMapping("/folder")
	public ResponseEntity<FileSystemItem> createFolder(@RequestParam String name, @RequestParam(required = false) Long parentId) {
		FileSystemItem folder = service.createFolder(name, parentId);
		return ResponseEntity.ok(folder);
	}
	
	@PostMapping("/file")
	public ResponseEntity<FileSystemItem> createFile(@RequestParam String name, @RequestParam double sizeKb, @RequestParam(required = false) Long parentId) {
		FileSystemItem file = service.createFile(name, sizeKb, parentId);
		return ResponseEntity.ok(file);
	}
	
	@GetMapping("/root")
	public ResponseEntity<List<FileSystemItem>> getRootItems() {
		List<FileSystemItem> rootItems = service.getRootItems();
		return ResponseEntity.ok(rootItems);
	}
	
	@GetMapping("/size/{id}")
	public ResponseEntity<Map<String,Object>> getSize(@PathVariable Long id) {
double size = service.getTotalSize(id);
return ResponseEntity.ok(Map.of(
		"itemId", id,
		"totalSizeKb", size,
		"totalSizeMb", Math.round(size/1024.0*100.0)/100.0
		));
	
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteItem(@RequestParam Long id) {
		service.deleteItem(id);	
		return ResponseEntity.ok("Item with id " + id + " and its contents deleted successfully.");
	}
	
}
