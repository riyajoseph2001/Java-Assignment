package String;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		int flag=0;
		Scanner scan=new Scanner(System.in);
		String finalString = "NULL";
		System.out.print("Enter String : ");
		String str=scan.nextLine();
		int length = str.length();
		for (int i = length / 2; i > 0; i--) {
            String p = str.substring(0, i);
            String s = str.substring(length - i);
                       
            if (p.equals(s)) {
                finalString = p;
                flag++;
                break;
            }
        }
		if(flag==0)
            	System.out.println("No common end substring found.");
		else
			System.out.println("Longest common end substring: "+finalString);
	}

}
