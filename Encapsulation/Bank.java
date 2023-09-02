package Encapsulation;
//Question 1
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose one option:");
		System.out.println("1.Fixed");
		System.out.println("2.Savings");
		int choice = scan.nextInt();
		Account a= new Account();
		System.out.println("Enter principal:");
		a.setPrincipal(Double.parseDouble(scan.next()));
		System.out.println("Enter time:");
		a.setTime(Integer.parseInt(scan.next()));
		if(choice==1) {
			a.setRate(11);
		}
		else {
			a.setRate(4);
			
		}
		a.calculateInterest();
		
		

	}

}
