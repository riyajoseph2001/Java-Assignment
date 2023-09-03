package Polymorphism;
//Question1
import java.util.Scanner;

public class ShapeMain {
	public static void calculateArea(Shape obj) {
		obj.area();
	
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of rectangle:");
		int l= scan.nextInt();
		System.out.println("Enter width of rectangle:");
		int w=scan.nextInt();
		Rectangle r = new Rectangle(l,w);
		System.out.println("Enter side of square:");
		Square s = new Square(scan.nextInt());
		
		calculateArea(r);
		calculateArea(s);
		
		

	}

}
