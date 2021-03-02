package com.example.jetty_jersey.ws;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dao.Passenger;
import dao.PassengerDao;
import dao.Pilot;
import dao.PilotDao;

@Path("/users")
public class PassengerWs implements PassengerDao, PilotDao{
	
	List<Passenger> passengers = new ArrayList<Passenger>();
	List<Pilot> pilots = new ArrayList<Pilot>();
	
	public PassengerWs() {
		Passenger a = new Passenger(0);
		Passenger b = new Passenger(1);
		Pilot c = new Pilot(0);
		Pilot d = new Pilot(1);
		passengers.add(a);
		passengers.add(b);
		pilots.add(c);
		pilots.add(d);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/list")
	public List<Passenger> getPassengers() {
		// TODO Auto-generated method stub
		return passengers;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Passenger getPassenger(@PathParam("id") int id) {
		// TODO Auto-generated method stub
		return passengers.get(0);
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/sign-up")
	public boolean addPassenger(Passenger p) {
		// TODO Auto-generated method stub
		passengers.add(p);
		return true;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/edit")
	public boolean updatePassenger(Passenger p) {
		// TODO Auto-generated method stub
		p.firstName = "updated";
		return true;
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/delete")
	public boolean delPassenger(Passenger p) {
		// TODO Auto-generated method stub
		passengers.remove(0);
		//remove from the pilots list if p is also a pilot
		return true;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/pilots/list")
	public List<Pilot> getPilots() {
		// TODO Auto-generated method stub
		return pilots;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/pilots/{id}")
	public Pilot getPilot(@PathParam("id") int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/pilot/add")
	public boolean addPilot(Pilot p) {
		// TODO Auto-generated method stub
		pilots.add(p);
		return true;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/pilot/edit")
	public boolean updatePilot(Pilot p) {
		// TODO Auto-generated method stub
		p.experience = "experience updated";
		return true;
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/pilot/delete")
	public boolean delPilot(Pilot p) {
		// TODO Auto-generated method stub
		pilots.remove(2);
		return true;
	}

}
