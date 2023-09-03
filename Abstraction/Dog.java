package Abstraction;

public class Dog extends Animals {
	
	@Override
	public void saySomething() {
		System.out.println("Dogs Say Bow Wow");

	}

	@Override
	public void cry() {
		System.out.println("Bow bow");

	}

	@Override
	public void fly() {
		System.out.println("Dog cannot fly");

	}

	@Override
	public void walk(int noOfLegs) {
		System.out.println("Walk with " + noOfLegs + "legs");

	}

}
