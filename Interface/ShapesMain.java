package Interface;
//Question1
import java.util.Scanner;

public class ShapesMain {
	
	public static void calculateArea(Shape obj) {
		System.out.println("Area :"+obj.area());
	
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Rectangle[] r = new Rectangle[5];
		Square[] s = new Square[5];
		int i=0,j=0;
		char choice ='n';
		do {		
			System.out.println("Enter length of rectangle:");
			double l= scan.nextDouble();
			System.out.println("Enter width of rectangle:");
			double w=scan.nextDouble();
			r[i++]=new  Rectangle(l,w);
			System.out.println("Enter side of square:");
			double side = scan.nextDouble();
			s[j++]=new  Square(side);
			System.out.println("Do you want to continue?(y/n)");	
			choice = scan.next().charAt(0);
			
			
		}while(choice=='y'||choice=='Y');
		
		System.out.println("Area of Rectangle");
		for(Rectangle rectangle: r ) {
			try {
			calculateArea(rectangle);
			}catch(NullPointerException e) {
				
			}
		}
		System.out.println("Area of Square");
		for(Square square: s ) {
			try {
			calculateArea(square);
			}catch(NullPointerException e) {
				
			}
		}
	}

}
