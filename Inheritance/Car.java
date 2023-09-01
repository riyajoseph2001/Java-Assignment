package Inheritance;
//Question 1
public class Car extends Vehicle {
	
	public void brandName() {
		System.out.println("GTR");
	}
	
	public void color() {
		System.out.println("Color is Red");
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.brandName();
		c.color();

	}

}
