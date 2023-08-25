package VariablesAndDatatypes;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First number :");
		int n = scan.nextInt();
		System.out.println("Enter second number :");
		int m = scan.nextInt();
		int quotient = n/m;
		int remainder = n%m;
		System.out.println("Quotient = "+quotient);
		System.out.println("Remainder = "+remainder);
		
		

	}

}
