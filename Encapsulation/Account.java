package Encapsulation;
//Question 1
import java.util.Scanner;

public class Account {
	private double principal=0.0;
	private int time;
	private double rate=0.0;
	

	public double getPrincipal() {
		return principal;
	}


	public void setPrincipal(double principal) {
		this.principal = principal;
	}


	public int getTime() {
		return time;
	}


	public void setTime(int time) {
		this.time = time;
	}


	public double getRate() {
		return rate;
	}


	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public void calculateInterest() {
		double interest = (principal*time*rate)/100;
		System.out.println("Interest ="+interest);
	}
	

}
