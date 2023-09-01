package com.nissan.app;
//Question 2
import java.util.Scanner;
import com.nissan.bean.Account;
public class Bank {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Account ac =new Account();
		char choice ='n';
		do {
			System.out.println("Select any banking option:");
			System.out.println("1.Withdraw");
			System.out.println("2.Deposite");
			System.out.println("3.Balance");
			int option = Integer.parseInt(scan.nextLine());
			switch(option) 
			{
			case 1:
				System.out.println("Enter the amount:");
				ac.withdraw(Double.parseDouble(scan.nextLine()));
				break;
			case 2:
				System.out.println("Enter the amount:");
				ac.deposite(Double.parseDouble(scan.nextLine()));
				break;
			case 3:
				System.out.println("Balance amount :"+ac.getBalance());
			default:
				System.out.println("Enter valid option");
				break;
			}
			System.out.println("Do you want to continue?(y/n)");	
			choice = scan.nextLine().charAt(0);
			}while(choice=='Y'||choice=='y');
		}
		

	}

