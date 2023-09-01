package Inheritance;
//Question 3
public class Money {
	private int basicPay=1200;
	private int tax = 50;
	
	public double paymentPerYear() {
		return this.basicPay+this.tax;
	}

}
