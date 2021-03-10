package com.flightSharing.dao;

import java.time.LocalDate;
import java.util.List;

public class Passenger {
	int id;
	public String firstName;
	public String lastName;
	public LocalDate birthday;
	public int phone;
	public String email;
	List<Flight> bookedFlights;
	
	public Passenger (int id) {
		this.id = id;
		this.firstName = "passenger"+id;
	}
}
