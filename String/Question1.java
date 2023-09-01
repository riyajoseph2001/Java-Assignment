package String;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=scan.nextLine();
		int sum=0;
		for(int i=0;i<str.length();i++){ 
			if(Character.isDigit(str.charAt(i)))
			{
				String temp = str.substring(i,i+1);
				sum+=Integer.parseInt(temp);
			}
		}
		System.out.println("Sum of all digits in the string :" +sum );

	}

}
