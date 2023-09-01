package Inheritance;
//Question 2
public class BoxWeight extends Box {
	private double weight=0.0;
	
	

	public BoxWeight(double width, double height, double depth, double weight) {
		super(width, height, depth);
		this.weight = weight;
	}



	public static void main(String[] args) {
		BoxWeight b1 = new BoxWeight(20.0,18.0,16.0,50);
		BoxWeight b2 = new BoxWeight(30.0,28.0,20.0,45);
		b1.volumn();
		b2.volumn();
		System.out.println("weight of first box="+b1.weight);
		System.out.println("weight of second box="+b2.weight);
		

	}

}
