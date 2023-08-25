package VariablesAndDatatypes;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = scan.nextInt();
		int remainder=0,reverse=0;
		while(number > 0)  
		{  
		remainder = number % 10;  
		reverse = (reverse*10) + remainder;  
		number = number / 10;  
		}  
		System.out.println("Sum of Digits: "+reverse);

	}

}
