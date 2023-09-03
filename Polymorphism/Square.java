package Polymorphism;
//Question1
public class Square extends Shape{
	private int side;

	public Square(int side) {
		super();
		this.side = side;
	}
	
	@Override
	public void area() {
		System.out.println("Area of Square="+(side*side));
	}

}
