package gltp4;

import java.time.LocalDate;

public class Passenger {
	int id;
	String firstName;
	String lastName;
	LocalDate birthday;
	int phone;
	String email;
	List<Flight> bookedFlights;
}