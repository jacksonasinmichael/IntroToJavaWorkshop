package day1.robot;

import javax.swing.JOptionPane;

public class SnoopDoge {
public static void main(String[] args) {
	String name= JOptionPane.showInputDialog("What's your name?");
	String color= JOptionPane.showInputDialog("What's your favorite color?");
	String anime= JOptionPane.showInputDialog("What's your favorite anime?");
	String music= JOptionPane.showInputDialog("What's your favorite type of music?");
	JOptionPane.showMessageDialog(null, "hello "+name+", Based on your answers of " + color +", "+anime+", "+" and "+music+ " we have calculated that you have an absurd "+anime+ " manga collection. Hope you can sleep when everyone knows your secret.");
}
}
