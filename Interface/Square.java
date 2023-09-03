package Interface;
//Question1
public class Square implements Shape{
	
	double side;
	

	public Square(double side) {
		super();
		this.side = side;
	}


	@Override
	public double area() {
		return side*side;
	}

}
