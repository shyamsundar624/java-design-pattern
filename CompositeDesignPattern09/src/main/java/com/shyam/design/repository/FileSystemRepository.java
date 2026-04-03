package com.shyam.design.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shyam.design.entity.FileSystemItem;

public interface FileSystemRepository extends JpaRepository<FileSystemItem, Long> {

	List<FileSystemItem> findByParentIsNull();
	
	List<FileSystemItem> findByParentId(Long parentId);
	
	List<FileSystemItem> findByNameAndType(String name,String type);
}
