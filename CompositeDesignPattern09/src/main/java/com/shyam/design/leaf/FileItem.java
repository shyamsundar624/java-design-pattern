package com.shyam.design.leaf;

import com.shyam.design.util.FileSystemComponent;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class FileItem implements FileSystemComponent {

	private String name;
	private double sizeKb;


	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getSize() {
		return sizeKb;
	}
	@Override
	public String getType() {
		return "FILE";
	}
	@Override
	public void showStructure(String indent) {
		System.out.println(indent + "- FILE" + name + " (" + sizeKb + " KB)");
	}

	

}
