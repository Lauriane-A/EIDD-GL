package com.example.jetty_jersey.ws;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/passenger")
public class FlightResource implements FlightDao{
	List<Flight> flights = new ArrayList<Flight>();
	List<Flight> specificFlights = new ArrayList<Flight>();

	public static class ExampleClass {
		public String field;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/aircraft")
	public ExampleClass getExample() {
		ExampleClass instance = new ExampleClass();
		instance.field = "Test";
		return instance;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/aircraft")
	public void retrieveExample(ExampleClass instance) {
		System.out.println(instance.field);
	}
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/flight-sharing/flights")
	public List<Flight> getFlights() {
		// TODO Auto-generated method stub
		return flights;
	}
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/flight-sharing/searched-flight")
	public List<Flight> getFlightWished(String departure_aerodrome, LocalDate from, LocalDate to) {
		// TODO Auto-generated method stub
		return specificFlights;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/flight-sharing/sign-in//flight-sharing/sign-in/view-and-edit-user-flights/plan-a-flight")
	public void setFlight(String departure_aerodrome, String arrivalAerodrome, LocalDate departureDate,
			LocalDateTime departureTime, LocalDate arrivalDate, LocalDateTime arrivalTime, LocalDateTime flightDuration,
			int availablePlaces, int price, String meetingPlace) {
		// TODO Auto-generated method stub	
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/flight-sharing/sign-in//flight-sharing/sign-in/view-and-edit-user’s-flights/edit-a-flight")
	public void deleteFlights(Flight flight) {
		// TODO Auto-generated method stub
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/flight-sharing/sign-in//flight-sharing/sign-in/view-and-edit-user’s-flights/edit-a-flight")
	public void updateFlightPlace(int availablePlaces) {
		// TODO Auto-generated method stub
		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/flight-sharing/sign-in//flight-sharing/sign-in/view-and-edit-user’s-flights/edit-a-flight")
	public void updateFlightPrice(int price) {
		// TODO Auto-generated method stub
		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/flight-sharing/sign-in//flight-sharing/sign-in/view-and-edit-user’s-flights/edit-a-flight")
	public void updateFlightMeetingPlace(String meetingPlace) {
		// TODO Auto-generated method stub
		
	}
	
}
