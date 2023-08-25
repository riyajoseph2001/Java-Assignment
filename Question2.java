package ControlStructures;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String pinNumber="NULL";
			System.out.println("Enter the pin : ");
			pinNumber = scan.nextLine();
			
			if(checkPin(pinNumber))
					System.out.println("Entered PIN is correct!!");
			else
					System.out.println("Entered PIN is incorrect!!");
		}
		public static boolean checkPin(String pin) {
			String actualPin = "7425";
			return pin.equals(actualPin);
		}

	}
