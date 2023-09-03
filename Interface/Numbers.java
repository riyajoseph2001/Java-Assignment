package Interface;
//Question 2
public class Numbers implements Ifirst,Isecond {

	public static void main(String[] args) {
		int value;
		
		Ifirst obj= new Numbers();
		obj.display();
		System.out.println("Value="+obj.getValue());
		Isecond obj1= new Numbers();
		obj1.display();
		obj1.demo();

	}

	@Override
	public void demo() {
		System.out.println("Demo method of Isecond");
		
	}

	@Override
	public void display() {
		System.out.println("Display method");
		
	}

	@Override
	public int getValue() {
		return 10;
		
		
	}

}
