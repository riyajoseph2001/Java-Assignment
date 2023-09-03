package Polymorphism;
//Question2
public class Triangle extends Figure {
	
	@Override
	public double area(double dim1,double dim2) {
		
		return (dim1*dim2/2);
	}

}
