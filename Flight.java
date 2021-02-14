package genie_logicil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Flight {
	String departureAerodrome;
	String arrivalAerodrome;
	LocalDate departureDate;
	LocalDateTime departureTime;
	LocalDate arrivalDate;
	LocalDateTime arrivalTime;
	LocalDateTime flightDuration;
	int availablePlaces;
	int price;
	String meetingPlace;
	Pilot pilot; 
	List <Passenger> passengersLists; 

}


