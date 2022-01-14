package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class UnBirthday {
	public static void main(String[] args) {
		
		 
		
		String birthday = JOptionPane.showInputDialog(null,"What day is your birthday");
		if (birthday.equals("1/13")) {
			System.out.print("Happy Birthday!");
		} 
		else  {
			System.out.print("UNbirthday!");
		}
			
		}
		
			
		
	}


