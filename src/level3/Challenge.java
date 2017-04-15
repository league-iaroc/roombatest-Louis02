package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
	driveDirect(1000,1000);
	sleep(900);
	driveDirect(300,600);
	sleep(700);
	driveDirect(1000,1000);
	sleep(700);
	driveDirect(600,300);
	sleep(700);
	driveDirect(1000,1000);
	sleep(500);
	driveDirect(300,600);
	sleep(700);
	driveDirect(1000,1000);
	sleep(700);
	driveDirect(600,300);
	sleep(500);
	driveDirect(1000,1000);
	}

	public void loop() {
	
	}
}
