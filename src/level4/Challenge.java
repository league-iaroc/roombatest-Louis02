package level4;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level4.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * complete the MAZE
	 * Hint: use bump sensors
	 */
	
	
	public void initialize() {
driveDirect(1000,1000);
sleep(500);
driveDirect(300,800);
sleep(500);
driveDirect(1000,1000);
sleep(2800);
driveDirect(870,300);
sleep(500);
driveDirect(1000,1000);
sleep(900);
driveDirect(700,300);
sleep(500);
driveDirect(1000,1000);
sleep(700);
driveDirect(300,700);
sleep(500);
driveDirect(1000,1000);
sleep(500);
driveDirect(300,700);
sleep(500);
driveDirect(1000,1000);
	}

	public void loop() {

	}
}
