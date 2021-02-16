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

@Path("/fligthSharing")
public class PilotResource implements PilotDao{

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/fligthSharing/sign-up")
	public List<Pilot> getPilots() {
		// TODO Auto-generated method stub
		List<Pilot> pilotList= new ArrayList<Pilot>();
		Pilot pilot1 = new Pilot();
		pilot1.experience = "5 ans";
		pilot1.qualifications = "pilotdegree";
		pilot1.numFlightHours = 15;
		return pilotList;
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/fligthSharing/sign-in")
	public Pilot getPilotInfo(String firstName, String lastName) {
		// TODO Auto-generated method stub
		Pilot pilot2 = new Pilot();
		pilot2.experience = "5 ans";
		return pilot2;
	}
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/fligthSharing/sign-up")
	public Pilot signUpPilot(String experience, String  qualifications, int numFlightHours, String flightInformation) {
		// TODO Auto-generated method stub
		Pilot pilot3 = new Pilot();
		pilot3.experience = " experiences";
		pilot3.qualifications = " qualifications";
		pilot3.numFlightHours = 15;
		pilot3.flightInformation="fligthID";
		return pilot3;
	}
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/flight-sharing/sign-in/booked flights")
	public List<Flight> getFlightsPlanned(String firstName, String lastName) {
		// TODO Auto-generated method stub
		List<Flight> fligthList= new ArrayList<Flight>();
		Flight fligth1 = new Flight();
		fligth1.departureAerodrome= " versailles";
		fligth1.availablePlaces=3;
		return fligthList;
	}

}
