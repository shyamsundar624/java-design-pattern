package com.shyam.design;

public class TestFacade {
public static void main(String[] args) throws InterruptedException {
	ScheduleServer scheduleServer = new ScheduleServer();
	ScheduleServerFacade scheduleServerFacade = new ScheduleServerFacade(scheduleServer);
	scheduleServerFacade.startServer();
	
	System.out.println("Start working........");	
	Thread.sleep(5000);
	System.out.println("After work done........");
	
	scheduleServerFacade.stopServer();
}
}
