package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class MultiColoredSquare {
	public static void main(String[] args) {
		Robot R2D2 = new Robot();
		R2D2.setSpeed(600);
		for (int i = 0; i < 100; i++) {

			R2D2.setRandomPenColor();
			for (int j = 0; j < 4; j++) {

				R2D2.penDown();
				R2D2.setPenWidth(30);
				R2D2.move(100);
				R2D2.turn(90);

			}
		}
		R2D2.sparkle();
	}
}
