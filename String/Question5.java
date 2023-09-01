package String;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String newString="";
		System.out.print("Enter String : ");
		String s=scan.nextLine();
		for (int i = 0; i < s.length(); i++) 
		  {
		    if (i == 0 && s.charAt(i) != '#')
		      newString += s.charAt(i);
		    if (i > 0 && s.charAt(i) != '#' && s.charAt(i-1) != '#')
		      newString += s.charAt(i);
		    if (i > 0 && s.charAt(i) == '#' && s.charAt(i-1) != '#')
		      newString = newString.substring(0,newString.length()-1);
		  }

		System.out.println("The final string is "+newString);
	}

}
