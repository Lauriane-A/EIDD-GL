package com.flightSharing.dao;

import java.util.ArrayList;
import java.util.List;

public class FlightDaoImplement implements FlightDao {
	
	List<Flight> flights = new ArrayList<Flight>();
	
	public FlightDaoImplement () {
		Flight a = new Flight(123);
		Flight b = new Flight(456);
		flights.add(a);
		flights.add(b);
	}
	
	public List<Flight> getFlights() {
		// TODO Auto-generated method stub
		return flights;
	}
	
	public Flight getFlight(int id) {
		// TODO Auto-generated method stub
		return flights.get(1);
	}
	
	public boolean addFlight(Flight f) {
		// TODO Auto-generated method stub
		flights.add(f);
		return true;
	}
	
	public boolean updateFlight(Flight f) {
		// TODO Auto-generated method stub
		f.price = 100;
		return true;
	}
	
	public boolean delFlight(Flight f) {
		// TODO Auto-generated method stub
		flights.remove(0);
		return true;
	}

}
