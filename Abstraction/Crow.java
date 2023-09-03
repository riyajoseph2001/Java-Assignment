package Abstraction;

public class Crow extends Animals{
	@Override
	public void saySomething() {
		System.out.println("Crow says craw craw");
		
	}

	@Override
	public void cry() {
		System.out.println("craw craw");
		
	}

	@Override
	public void fly() {
		System.out.println("Crow can fly upto 1000ft");
		
	}

	@Override
	public void walk(int noOfLegs) {
		System.out.println("Walk with "+noOfLegs+"legs");
		
	}

}
