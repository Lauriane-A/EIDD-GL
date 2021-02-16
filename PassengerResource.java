package com.example.jetty_jersey.ws;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/passenger")
public class PassengerResource implements PassengerDao{
	List<Passenger> passengers = new ArrayList<Passenger>();

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
	@Path("/flight-sharing/passengers")
	public List<Passenger> getPassengers() {
		// TODO Auto-generated method stub
		return passengers;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/flight-sharing/flightid/book")
	public void bookFlight(Passenger passenger, Flight flight) {
		// TODO Auto-generated method stub
	}
	
	@PUT
	@Path("/flight-sharing/sign-up")
	public void signUp(Passenger passenger) {
		// TODO Auto-generated method stub
		passengers.add(passenger);
	}
}
