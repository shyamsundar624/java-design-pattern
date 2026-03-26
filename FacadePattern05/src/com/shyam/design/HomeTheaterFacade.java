package com.shyam.design;

public class HomeTheaterFacade {

	private Amplifier amplifier;
	private DVDPalyer dvdPlayer;
	private TV tv;
	private Lights lights;
//Facade class that simplifies the interaction with the complex subsystem of home theater components
	public HomeTheaterFacade(Amplifier amplifier, DVDPalyer dvdPlayer, TV tv, Lights lights) {
		this.amplifier = amplifier;
		this.dvdPlayer = dvdPlayer;
		this.tv = tv;
		this.lights = lights;
	}

	public void watchMovie(String movie) {
		System.out.println("Get ready to watch a movie...");
		lights.dim(10);
		tv.on();
		tv.setInput("DVD");
		amplifier.turnOn();
		amplifier.setVolume(5);
		dvdPlayer.turnOn();
		dvdPlayer.play(movie);
	}

	public void endMovie() {
		System.out.println("Shutting down the home theater...");
		lights.on();
		tv.off();
		amplifier.turnOff();
		dvdPlayer.stop();
		dvdPlayer.turnOff();
	}
}
