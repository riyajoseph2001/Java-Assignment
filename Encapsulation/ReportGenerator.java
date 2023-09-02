package Encapsulation;
//Question 2
import java.util.Scanner;

public class ReportGenerator {
	
	static Item[] itemDetails = new Item[5];
	static int j=0;
	static  char choice;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		do {
			Item i = new Item();
			System.out.println("Enter Item Number:");
			i.setItemNumber(Integer.parseInt(scan.nextLine()));
			System.out.println("Enter Item Name:");
			i.setItemName(scan.nextLine());
			System.out.println("Enter Item Price:");
			i.setPrice(Integer.parseInt(scan.nextLine()));
			itemDetails[j++]=i;
			System.out.println("Do you want to continue?(y/n)");	
			choice = scan.nextLine().charAt(0);
			}while(choice=='Y'||choice=='y');
		System.out.println("Display Details");
		for(Item o:itemDetails) {
			System.out.println(o);
		}
		
		

	}

}
