package com.example.jetty_jersey.ws;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.flightSharing.dao.Flight;

@Path("/flights")
public class FlightWs {
	
	List<Flight> flights = new ArrayList<Flight>();
	
	public FlightWs () {
		Flight a = new Flight(123);
		Flight b = new Flight(456);
		flights.add(a);
		flights.add(b);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/list")
	public List<Flight> getFlights() {
		// TODO Auto-generated method stub
		return flights;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Flight getFlight(@PathParam("id") int id) {
		// TODO Auto-generated method stub
		return flights.get(1);
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/add")
	public boolean addFlight(Flight f) {
		// TODO Auto-generated method stub
		flights.add(f);
		return true;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/edit")
	public boolean updateFlight(Flight f) {
		// TODO Auto-generated method stub
		f.price = 100;
		return true;
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/delete")
	public boolean delFlight(Flight f) {
		// TODO Auto-generated method stub
		flights.remove(0);
		return true;
	}

}
