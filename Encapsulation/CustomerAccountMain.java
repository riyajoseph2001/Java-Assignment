package Encapsulation;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerAccountMain {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<CustomerAccount> customers = new ArrayList<CustomerAccount>();
	
	public static void main(String[] args) {
		int opt;
		do {
				System.out.println("Choose an option");
				System.out.println("1-Add Customers");
				System.out.println("2-List Cutomers");
				System.out.println("3-Search");
				System.out.println("4-Exit");
				System.out.print("Option : ");
				opt = scan.nextInt();
				if(opt==1) {
					System.out.println("Enter the details of 5 customers");
					for(int i=0;i<5;i++) {
						System.out.print("Enter the Account number : ");
						long accno = scan.nextLong();
						System.out.print("Enter the customer name : ");
						String name = scan.next();
						System.out.print("Enter the customer age : ");
						int age = scan.nextInt();
						System.out.print("Enter the customer place : ");
						String place = scan.next();
						System.out.print("Enter the customer Account type : ");
						String acctype = scan.next();
						CustomerAccount c = new CustomerAccount(accno,name,age,place,acctype);
						customers.add(c);
					}
					System.out.println("Details entered ....");
				}
				else if (opt==2) {
					for(int i=0;i<customers.size();i++)
						System.out.println(customers.get(i).toString()+"\n");
				}
				else if (opt==3) {
					int flag=0;
					System.out.print("Enter the account no : ");
					long tempAccNo = scan.nextLong();
					for(int i=0;i<customers.size();i++) {
						if(customers.get(i).getAccountNo()==tempAccNo){
							System.out.println(customers.get(i).toString());
							flag=1;
							break;
						}
					}
					if(flag==0)
						System.out.println("Record not found...");
				}
		}while(opt!=4);
	}

}

