package ControlStructures;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the month :");
		int month = scan.nextInt();
		String result = " ";
		switch(month){
		case 1:
		case 2:
		case 12:
			result="Winter";
			break;
		case 3:
		case 4:
		case 5:
			result="Spring";
			break;
		case 6:
		case 7:
		case 8:
			result="Summer";
			break;
		case 9:
		case 10:
		case 11:
			result="Autumn";
			break;
		default:
			result="None";
	}
	System.out.println("Season is "+result);
}

}
