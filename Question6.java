package VariablesAndDatatypes;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the distance between two cities in KM:");
		float distance = scan.nextFloat();
		System.out.println("Distance in meters = "+distance*1000+"m");
		System.out.println("Distance in feet = "+distance*3280.84+"ft");
		System.out.println("Distance in Inches = "+distance*39370.1+"in");
		System.out.println("Distance in Inches = "+distance*100000+"cm");

	}

}
