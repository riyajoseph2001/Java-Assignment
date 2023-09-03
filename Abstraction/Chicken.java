package Abstraction;

public class Chicken extends Animals{
	
	@Override
	public void saySomething() {
		System.out.println("Chicken says ko ko");
		
	}

	@Override
	public void cry() {
		System.out.println("ko ko");
		
	}

	@Override
	public void fly() {
		System.out.println("Chicken can fly upto 6ft");
		
	}

	@Override
	public void walk(int noOfLegs) {
		System.out.println("Walk with "+noOfLegs+"legs");
		
	}

}
