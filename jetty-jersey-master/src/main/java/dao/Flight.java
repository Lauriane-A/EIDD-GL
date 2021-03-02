package dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Flight {
	public int id;
	String departureAerodrome;
	String arrivalAerodrome;
	LocalDate departureDate;
	LocalDateTime departureTime;
	LocalDate arrivalDate;
	LocalDateTime arrivalTime;
	LocalDateTime flightDuration;
	int availablePlaces;
	public int price;
	String meetingPlace;
	Pilot pilot; 
	List <Passenger> passengersLists;
	
	public Flight (int id) {
		this.id = id;
	}
}
