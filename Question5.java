package ControlStructures;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result;
		do {
			System.out.println("Choose an option :");
			System.out.println("1.if");
			System.out.println("2.switch");
			System.out.println("3.while");
			System.out.println("4.do-while");
			System.out.println("5.for");
			result = scan.nextInt();
			
			switch(result)
			{
			case 1:
				System.out.println("if (condition) {");
				System.out.println("	  // block of code to be executed if the condition is true");
				System.out.println("	}");
				break;
			case 2:
				System.out.println("switch(expression) {");
				System.out.println("  case x:");
				System.out.println("    // code block");
				System.out.println("    break;");
				System.out.println("  case y:");
				System.out.println("    // code block");
				System.out.println("    break;");
				System.out.println("  default:");
				System.out.println("    // code block");
				System.out.println("}");
				break;
			case 3:
				System.out.println("while (condition) {");
				System.out.println("	  // code block to be executed");
				System.out.println("	}");
				break;
			case 4:
				System.out.println("do {");
				System.out.println("	  // code block to be executed");
				System.out.println("	}");
				System.out.println("	while (condition);");
				break;
			case 5:
				System.out.println("for (statement 1; statement 2; statement 3) {");
				System.out.println("	  // code block to be executed");
				System.out.println("	}");
				break;
		}
	}while(result!=6);
}

}
