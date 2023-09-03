package Abstraction;

public class Cat extends Animals{
	@Override
	public void saySomething() {
		System.out.println("Cat says meow");
	}

	@Override
	public void cry() {
		System.out.println("Meow");
		
	}

	@Override
	public void fly() {
		System.out.println("Cat cannot fly");
		
	}

	@Override
	public void walk(int noOfLegs) {
		System.out.println("Walk with "+noOfLegs+"legs");
		
	}
	

}
