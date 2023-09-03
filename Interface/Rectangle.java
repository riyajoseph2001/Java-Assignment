package Interface;
//Question1
public class Rectangle implements Shape {
	
	double length;
	double width;
	

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}


	@Override
	public double area() {
		
		return length*width;
	}

}
