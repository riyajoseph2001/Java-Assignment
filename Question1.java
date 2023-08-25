package VariablesAndDatatypes;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n = scan.nextInt();
		System.out.println("Enter second number:");
		int m = scan.nextInt();
		System.out.println("Before Swapping :"+n+" "+m);
		
		n = n+m;
		m = n-m;
		n = n-m;
		System.out.println("After Swapping :"+n+" "+m);

	}

}
