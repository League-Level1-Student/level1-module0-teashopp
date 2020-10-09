package _01_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	
	Robot rob = new Robot();
	
	public void run() {
		
		rob.setX(40);
		rob.penDown();
		rob.setSpeed(10);

		for (int i = 0; i < 10; i++) {
			int num = new Random().nextInt(3)-1;
			
			if (num == 1) {
				smallhouse();
			}
			
			else if (num == 2) {
				mediumhouse();
			}
			
			else {
				largehouse();
			}
			
			grass();
			
		}
		
	}
	
	public void smallhouse() {
		rob.setPenColor(255,0,0);
		rob.move(60);
		rob.turn(90);
		rob.move(30);
		rob.turn(90);
		rob.move(60);
	}

	public void mediumhouse() {
		rob.setPenColor(255,0,0);
		rob.move(120);
		rob.turn(90);
		rob.move(30);
		rob.turn(90);
		rob.move(120);
	}
	
	public void largehouse() {
		rob.setPenColor(255,0,0);
		rob.move(250);
		rob.turn(90);
		rob.move(30);
		rob.turn(90);
		rob.move(250);
	}
	
	public void grass() {
		rob.setPenColor(0,0,255);
		rob.turn(270);
		rob.move(30);
		rob.turn(270);
	}
	
}
