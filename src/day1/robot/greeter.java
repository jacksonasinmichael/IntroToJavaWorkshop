package day1.robot;

import javax.swing.JOptionPane;

public class greeter {
public static void main(String[] args) {
	String answer= JOptionPane.showInputDialog("Love u :]");
			JOptionPane.showMessageDialog(null, "Whenever you say " + answer + "it makes me want to hurt you"
					+ "");
	String answer1 =JOptionPane.showInputDialog("What's your name");
			JOptionPane.showMessageDialog(null, "your face bothers me, " + answer1);
}
}
