package Inheritance;
//Question 3
import java.time.Year;
import java.util.Date;

public class Patient extends Person {
	private int patientNumber;
	private String hospital;
	private int yearOfJoining;
	private String address;
	private double medicalFees;
	public Patient(String name, String phoneNumber, int patientNumber, String hospital, int yearOfJoining,
			String address) {
		super(name, phoneNumber);
		this.patientNumber = patientNumber;
		this.hospital = hospital;
		this.yearOfJoining = yearOfJoining;
		this.address = address;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Patient [patientNumber=" + patientNumber + ", hospital=" + hospital + ", yearOfJoining=" + yearOfJoining
				+ ", address=" + address + ", medicalFees=" + medicalFees + "]";
	}
	public double calculateMedicalFees(Money obj) {
		double amount = obj.paymentPerYear();
		//Date d = new Date();
		int year = Year.now().getValue();
		int noOfYears = year-yearOfJoining;
		double medicalFees = noOfYears*amount;
		return medicalFees;
	}	
		
	}
	