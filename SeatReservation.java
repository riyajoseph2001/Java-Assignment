package ControlStructures;

public class SeatReservation {
	String trainID;
	String trainName;
	String passengerName;
	SeatReservation(String trainID,String trainName,String passengerName){
		this.trainID = trainID;
		this.trainName = trainName;
		this.passengerName = passengerName;
	}
	public String getReservationDetails() {
		if (trainID.equals("16432"))
			return "Seat is Confirmed";
		return "Seat is Not Confirmed";
	
	}
}

