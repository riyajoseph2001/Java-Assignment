package VariablesAndDatatypes;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter basic salary :");
		float salary = scan.nextFloat();
		float dearness = (40*salary)/100;
		float rent = (20*salary)/100;
		float totalSalary = salary+dearness+rent;
		System.out.println("Total Salary = "+totalSalary);
		
		

	}

}
