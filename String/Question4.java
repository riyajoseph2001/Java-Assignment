package String;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter String : ");
		String str=input.nextLine();
		System.out.println(str.replace("is", "is not"));
	}

}
