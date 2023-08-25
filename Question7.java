package VariablesAndDatatypes;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit :");
		float fahrenheit = scan.nextFloat();
		float celsius = ((fahrenheit-32)*5)/9  ;
		System.out.println("Temperature in Celsius = "+celsius+" C");
		

	}

}
