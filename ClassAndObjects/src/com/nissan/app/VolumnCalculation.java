package com.nissan.app;
//Question 1
import java.util.Scanner;

import com.nissan.bean.Box;

public class VolumnCalculation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Box obj = new Box();
		Box obj1 = new Box();
		System.out.println("Enter width:");
		obj.setWidth(Double.parseDouble(scan.nextLine()));
		System.out.println("Enter height:");
		obj.setHeight(Double.parseDouble(scan.nextLine()));
		System.out.println("Enter depth:");
		obj.setDepth(Double.parseDouble(scan.nextLine()));
		System.out.println("Volumn = "+obj.volumn());
		
		System.out.println("Enter width:");
		obj1.setWidth(Double.parseDouble(scan.nextLine()));
		System.out.println("Enter height:");
		obj1.setHeight(Double.parseDouble(scan.nextLine()));
		System.out.println("Enter depth:");
		obj1.setDepth(Double.parseDouble(scan.nextLine()));
		System.out.println("Volumn = "+obj1.volumn());

		
		

	}

}
