package Inheritance;
//Question 4
public class Grad extends Student{
	public Grad(String name, int id, double grade, int age, String address) {
		super(name, id, grade, age, address);
		// TODO Auto-generated constructor stub
	}

	boolean isPassed() {
		if(grade>80.0) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
