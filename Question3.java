package ControlStructures;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the month :");
		int month = scan.nextInt();
		String result = " ";
		if(month ==1||month==2||month==12)
		{
			result = "winter";
		}
		else if(month ==3||month==4||month==5)
		{
			result = "spring";
		}
		else if(month ==6||month==7||month==8)
		{
			result = "summer";
		}
		else if(month ==9||month==10||month==11)
		{
			result = "spring";
		}
		System.out.println("Season is "+result);
	}

}
