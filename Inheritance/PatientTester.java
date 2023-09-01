package Inheritance;
//Question 3
public class PatientTester {

	public static void main(String[] args) {
		Patient p = new Patient("anu","923732738",101,"KIMS",2019,"kochi");
		Money obj = new Money();
		double medicalFees = p.calculateMedicalFees(obj);
		System.out.println("Medical Fees ="+medicalFees);
		

	}

}
