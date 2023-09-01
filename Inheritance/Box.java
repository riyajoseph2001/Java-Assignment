package Inheritance;
//Question 2
public class Box {
	public double width =0.0;
	public double height =0.0;
	public double depth =0.0;
	
	
	public Box(double width, double height, double depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}


	public void volumn() {
		System.out.println("volumn = "+width*height*depth);
	}

}
