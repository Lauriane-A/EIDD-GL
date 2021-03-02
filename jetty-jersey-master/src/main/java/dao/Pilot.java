package dao;

import java.util.List;

public class Pilot extends Passenger {
	
	public String experience; 
	String qualifications;
	int numFlightHours;
	String airplaneBrand;
	List<Flight> flightList; 
	
	public Pilot(int id) {
		super(id);
		// TODO Auto-generated constructor stub
		this.firstName = "pilot" + id;
	}
}
