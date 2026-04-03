package com.shyam.design.util;

public interface FileSystemComponent {
	String getName();

	double getSize(); // total size in kb

	void showStructure(String indent);

	String getType();
}
