package ControlStructures;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the train id : ");
		String trainId = scan.nextLine();
		String trainName = args[1];
		String passengerName = args[2];
		SeatReservation s1 = new SeatReservation(trainId,trainName,passengerName);
		System.out.println(s1.getReservationDetails());
	}

}
