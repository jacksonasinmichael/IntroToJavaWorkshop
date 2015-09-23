package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE

		Robot LaShawna=new Robot();
		for (int i = 0; i < 30; i++) {
			
		LaShawna.setSpeed(100);
		LaShawna.penDown();
		LaShawna.setRandomPenColor();
		LaShawna.move(300);
		LaShawna.turn(180);
		
	}
}

	}
