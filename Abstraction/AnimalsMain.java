package Abstraction;

import java.util.Scanner;

public class AnimalsMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MyAnimals obj1 = new MyAnimals();
		System.out.println("Enter boby temperature:");
		obj1.setBodyTemp(scan.nextInt());
		
		System.out.println("Body Temperature: "+obj1.getBodyTemp());
		Cat obj2 = new Cat();
		obj2.saySomething();
		obj2.cry();
		obj2.fly();
		obj2.setNoOfLegs(4);
		obj2.walk(obj2.getNoOfLegs());
		
		Dog obj3 = new Dog();
		obj3.saySomething();
		obj3.cry();
		obj3.fly();
		obj3.setNoOfLegs(4);
		obj3.walk(obj3.getNoOfLegs());
		
		Goat obj4 = new Goat();
		obj4.saySomething();
		obj4.cry();
		obj4.fly();
		obj4.setNoOfLegs(4);
		obj4.walk(obj4.getNoOfLegs());
		
		Crow obj5 = new Crow();
		obj5.saySomething();
		obj5.cry();
		obj5.fly();
		obj5.setNoOfLegs(2);
		obj5.walk(obj5.getNoOfLegs());
		
		Chicken obj6 = new Chicken();
		obj6.saySomething();
		obj6.cry();
		obj6.fly();
		obj6.setNoOfLegs(2);
		obj6.walk(obj6.getNoOfLegs());

	}

}
