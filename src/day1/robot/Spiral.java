package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		Robot Ladasha=new Robot();
		Ladasha.penDown();
		Ladasha.setSpeed(10);

		for (int i = 0; i < 60; i++) {
			Ladasha.setRandomPenColor();
			Ladasha.move(2*i);
			Ladasha.turn(360/);
			Ladasha.setPenWidth(200+i);
		}
		Ladasha.sparkle();
	}
}
