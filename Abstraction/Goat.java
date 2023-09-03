package Abstraction;

public class Goat extends Animals{

	@Override
	public void saySomething() {
		System.out.println("Goat says meah ");
		
	}

	@Override
	public void cry() {
		System.out.println("Meah meah");
		
	}

	@Override
	public void fly() {
		System.out.println("Goat cannot fly");
		
	}

	@Override
	public void walk(int noOfLegs) {
		System.out.println("Walk with "+noOfLegs+"legs");
		
	}

}
