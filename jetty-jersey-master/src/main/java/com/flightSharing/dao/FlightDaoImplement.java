package com.flightSharing.dao;

import java.util.ArrayList;
import java.util.List;

public class FlightDaoImplement implements FlightDao {

	List<Flight> flights = new ArrayList<Flight>();

	public FlightDaoImplement() {
		Flight a = new Flight();
		Flight b = new Flight();
		a.setId(123);
		b.setId(456);
		flights.add(a);
		flights.add(b);
	}

	public List<Flight> getFlights() {
		// TODO Auto-generated method stub
		return flights;
	}

	public Flight getFlight(int id) {
		// TODO Auto-generated method stub
		for (Flight f : flights) {
			if (f.getId() == id) {
				return f;
			}
		}
		return null;
	}

	public Flight getFlight(Flight f) {
		// TODO Auto-generated method stub
		int id = f.getId();
		return getFlight(id);
	}

	public boolean addFlight(Flight f) {
		// TODO Auto-generated method stub
		flights.add(f);
		return true;
	}

	public boolean updateFlight(Flight f) {
		// TODO Auto-generated method stub
		f.setPrice(100);
		return true;
	}

	public boolean delFlight(Flight f) {
		// TODO Auto-generated method stub
		int id = f.getId();
		for (Flight flight : flights) {
			if (flight.getId() == id) {
				flights.remove(f);
				return true;
			}
		}
		return false;
	}
}
