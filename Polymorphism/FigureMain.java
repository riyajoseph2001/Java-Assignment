package Polymorphism;
//Question2
import java.util.Scanner;


public class FigureMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Rectangle2 obj = new Rectangle2();
		System.out.println("Enter length and breath of triangle:");
		obj.setDim1(scan.nextDouble());
		obj.setDim2(scan.nextDouble());
		System.out.println("Area of Rectangle ="+obj.area(obj.getDim1(), obj.getDim2()));
		Triangle obj2 = new Triangle();
		System.out.println("Enter base and height of triangle:");
		obj2.setDim1(scan.nextDouble());
		obj2.setDim2(scan.nextDouble());
		System.out.println("Area of Triangle ="+obj.area(obj2.getDim1(), obj2.getDim2()));
		

	}

}
