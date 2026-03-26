package com.shyam.design;

public class ScheduleServer {
public void startBooting() {
	System.out.println("Start booting");
}
public void readSystemConfigFile() {
	System.out.println("Reading system config file");
}

public void init() {
	System.out.println("Initializing the schedule server");
}
public void initializeContext() {
	System.out.println("Initializing the context");
}
public void initializeListeners() {
	System.out.println("Initializing the listeners");
	
}
public void createSystemObjects() {
	System.out.println("Creating system objects");
}

public void releaseProcesses() {
	System.out.println("Releasing processes");
}
public void destory() {
	System.out.println("Destroying the schedule server");
}

public void destroySystemObjects() {
	System.out.println("Destroying system objects");
}

public void destoryListeners() {
	System.out.println("Destroying listeners");
}
public void destoryContext() {
	System.out.println("Destroying context");
}
public void shutdown() {
	System.out.println("Shutting down the schedule server");
}

}
