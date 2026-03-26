package com.shyam.design;

public class Main {
public static void main(String[] args) {
	
TV tv = new TV();
DVDPalyer dvdPlayer = new DVDPalyer();
Amplifier amplifier = new Amplifier();
Lights lights = new Lights();
	HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, dvdPlayer, tv, lights);
	
	//Client call one method no subsystem details needed
	homeTheater.watchMovie("Inception");
	TheaterUtils.waitFor(5000); // Simulate watching the movie for a while
	homeTheater.endMovie();
}
}
