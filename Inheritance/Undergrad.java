package Inheritance;
//Question 4
public class Undergrad extends Student {
	
	public Undergrad(String name, int id, double grade, int age, String address) {
		super(name, id, grade, age, address);
		// TODO Auto-generated constructor stub
	}

	boolean isPassed() {
		if(grade>70.0) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
