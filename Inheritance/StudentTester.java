package Inheritance;
//Question 4
public class StudentTester {

	public static void main(String[] args) {
		Grad obj = new Grad("anu",101,60,20,"kochi");
		Undergrad obj1 = new Undergrad("rahul",102,20,22,"kollam");
		boolean b1=obj.isPassed();
		boolean b2=obj1.isPassed();
		if(b1==true) {
			System.out.println(obj.name+" passed");
		}
		else 
		{
			System.out.println(obj.name+" failed");
			
		}
		if(b2==true) {
			System.out.println(obj1.name+" passed");
		}
		else 
		{
			System.out.println(obj1.name+" failed");
			
		}
			
		

	}

}
