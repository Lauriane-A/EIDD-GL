package com.flightSharing.dao;

import java.util.ArrayList;
import java.util.List;

public class PassengerDaoImplement implements PassengerDao, PilotDao{
	
	List<Passenger> passengers = new ArrayList<Passenger>();
	List<Pilot> pilots = new ArrayList<Pilot>();
	
	public PassengerDaoImplement() {
		Passenger a = new Passenger(0);
		Passenger b = new Passenger(1);
		Pilot c = new Pilot(0);
		Pilot d = new Pilot(1);
		passengers.add(a);
		passengers.add(b);
		pilots.add(c);
		pilots.add(d);
	}
	
	public List<Passenger> getPassengers() {
		// TODO Auto-generated method stub
		return passengers;
	}
	
	public Passenger getPassenger(int id) {
		// TODO Auto-generated method stub
		return passengers.get(0);
	}
	
	public boolean addPassenger(Passenger p) {
		// TODO Auto-generated method stub
		passengers.add(p);
		return true;
	}
	
	public boolean updatePassenger(Passenger p) {
		// TODO Auto-generated method stub
		p.firstName = "updated";
		return true;
	}
	
	public boolean delPassenger(Passenger p) {
		// TODO Auto-generated method stub
		passengers.remove(0);
		//remove from the pilots list if p is also a pilot
		return true;
	}
	
	public List<Pilot> getPilots() {
		// TODO Auto-generated method stub
		return pilots;
	}
	
	public Pilot getPilot(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean addPilot(Pilot p) {
		// TODO Auto-generated method stub
		pilots.add(p);
		return true;
	}
	
	public boolean updatePilot(Pilot p) {
		// TODO Auto-generated method stub
		p.experience = "experience updated";
		return true;
	}
	
	public boolean delPilot(Pilot p) {
		// TODO Auto-generated method stub
		pilots.remove(2);
		return true;
	}

}
