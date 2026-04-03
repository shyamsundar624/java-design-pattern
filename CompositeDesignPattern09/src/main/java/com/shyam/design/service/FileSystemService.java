package com.shyam.design.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shyam.design.entity.FileSystemItem;
import com.shyam.design.leaf.FileItem;
import com.shyam.design.leaf.FolderItem;
import com.shyam.design.repository.FileSystemRepository;
import com.shyam.design.util.FileSystemComponent;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FileSystemService {
private final FileSystemRepository repository;

//Create a File
public FileSystemItem createFile(String name, double sizeKb, Long parentId) {
	FileSystemItem file = FileSystemItem.builder()
			.name(name)
			.sizeKb(sizeKb)
			.type("FILE")
			.parent(parentId!=null?repository.findById(parentId).orElseThrow(()->new RuntimeException("Parent not found")):null)
			.build();
	
	return repository.save(file);
	
}

//CREATE A FOLDER
public FileSystemItem createFolder(String name, Long parentId) {
	FileSystemItem folder = FileSystemItem.builder()
			.name(name)
			.sizeKb(0)
			.type("FOLDER")
			.parent(parentId!=null?repository.findById(parentId).orElseThrow(()->new RuntimeException("Parent not found")):null)
			.build();
	
	return repository.save(folder);
}

//GET all root items
public List<FileSystemItem> getRootItems() {
	return repository.findByParentIsNull();
}

//BUILD composite tree from DB
public FileSystemComponent buildTree(Long itemId) {
FileSystemItem item = repository.findById(itemId).orElseThrow(()->new RuntimeException("Item not found"));
return buildComponent(item);

}

private FileSystemComponent buildComponent(FileSystemItem item) {
if("FILE".equals(item.getType())) {
	return new FileItem(item.getName(), item.getSizeKb());
}

FolderItem folder = new FolderItem(item.getName());
List<FileSystemItem> children = repository.findByParentId(item.getId());
for(FileSystemItem child:children) {
	folder.add(buildComponent(child));
}
return folder;
}

//GET total size of a folder
public double getTotalSize(Long itemId) {
	return buildTree(itemId).getSize();
}

public void printTree(Long itemId) {
	buildTree(itemId).showStructure("");
}

//Delete Item and all its children
public void deleteItem(Long itemId) {
	repository.deleteById(itemId);
}

}
