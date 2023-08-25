package VariablesAndDatatypes;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter five digit number :");
		int number = scan.nextInt();
		int sum=0,digit;
		while(number > 0)  
		{  
		digit = number % 10;  
		sum = sum + digit;  
		number = number / 10;  
		}  
		System.out.println("Sum of Digits: "+sum);  

	}

}
