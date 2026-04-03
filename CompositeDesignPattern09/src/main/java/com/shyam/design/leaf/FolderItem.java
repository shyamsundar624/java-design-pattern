package com.shyam.design.leaf;

import java.util.ArrayList;
import java.util.List;

import com.shyam.design.util.FileSystemComponent;

public class FolderItem implements FileSystemComponent {

	private String name;
	private List<FileSystemComponent> children = new ArrayList<>();

	public FolderItem(String name) {
		this.name = name;
	}
	public void add(FileSystemComponent component) {
		children.add(component);
	}
	public void remove(FileSystemComponent component) {
		children.remove(component);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getSize() {
//KEY: total size=sum of all children sizes
return children.stream().mapToDouble(FileSystemComponent::getSize).sum();
	}

	@Override
	public void showStructure(String indent) {
		System.out.println(indent + "+ FOLDER: " + name
				+"(Total:"+getSize()+" KB)");
		for(FileSystemComponent child:children) {
			child.showStructure(indent+" ");
		}
	}

	@Override
	public String getType() {
		return "FOLDER";
	}

}
