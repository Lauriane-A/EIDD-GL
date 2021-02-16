package com.example.jetty_jersey.ws;

import java.time.LocalDate;
import java.util.List;

public class Passenger {
	int id;
	String firstName;
	String lastName;
	LocalDate birthday;
	int phone;
	String email;
	List<Flight> bookedFlights;
}