package Polymorphism;
//Question1
public class Rectangle extends Shape {
	private int length;
	private int width;
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	@Override
	public void area() {
		System.out.println("Area of Rectangle="+(length*width));
	}


}
