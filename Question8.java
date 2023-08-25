package VariablesAndDatatypes;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number :");
		int i= scan.nextInt();
		System.out.println("Enter second number :");
		int j= scan.nextInt();
		System.out.println("Before Swapping : "+i+" "+j);
		
		int temp = i;
		i = j;
		j = temp;
		System.out.println("After Swapping : "+i+" "+j);
		
		
				
	}

}
