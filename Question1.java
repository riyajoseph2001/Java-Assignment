package ControlStructures;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice,reading;
		char ch;
		do {
		System.out.println("Choose the type of customer : ");
		System.out.println("1.Domestic");
		System.out.println("2.Industrial");
		System.out.print("Choose an option : ");
		choice=scan.nextInt();
		System.out.print("Enter the reading : ");
		reading=scan.nextInt();
		if(choice==1)
			domesticBill(reading);
		else if(choice==2)
			industrial(reading);
		else
			System.out.println("Invalid option chosen!!");
		System.out.println("Do you want to continue ?(y/n)");
		ch = scan.next().charAt(0);
		}while(ch=='y');
		
	}

	private static void industrial(int reading) {
		float bill;
		bill=reading*10;
		System.out.println("The total bill amount is "+bill);
	}

	private static void domesticBill(int reading) {
		float bill;
		if (reading>=0 && reading<=100)
			bill=reading*1;
		else if (reading>=100 && reading<=200)
			bill=(float) (reading*1.5);
		else if (reading>=200 && reading<=500)
			bill=reading*2;
		else
			bill=reading*5;
			System.out.println("The total bill amount is "+bill);
	}

}