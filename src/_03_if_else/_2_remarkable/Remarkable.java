package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String Deren = "Amazing";
		String Mark = "Nice";
		String Jeff = "Smart";
		String Joe = "Always Exicted";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String name = JOptionPane.showInputDialog(null, "Enter you name");
		if (name.equals("Deren")) {
			JOptionPane.showMessageDialog(null, Deren);
		}
		if (name.equals("Mark")) {
			JOptionPane.showMessageDialog(null, Mark);
		}
			
		if (name.equals("Jeff")) {
			JOptionPane.showMessageDialog(null, Jeff);
		}
			
		if (name.equals("Joe")) {
			JOptionPane.showMessageDialog(null, Joe);
		}
			
			
		// 3. In a pop-up, tell the user what is remarkable about that person. 

	}
}

