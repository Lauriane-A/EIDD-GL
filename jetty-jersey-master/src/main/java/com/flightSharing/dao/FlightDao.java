package com.flightSharing.dao;

import java.util.List;

public interface FlightDao {
	/**
	 * @return this list of flights 
	 */
	List<Flight> getFlights();
	
	/**
	 * @return a flight
	 */
	Flight getFlight(int id);
	
	/**
	  * add a flight
	  * @param f
	  * @return boolean if f has been added
	  */
	 boolean addFlight(Flight f);
	 
	 /**
	  * modify flight's field
	  * @param f
	  * @return true if succeed
	  */
	 boolean updateFlight(Flight f);
	 
	 /**
	  * remove a flight
	  * @param f
	  * @return true if succeed
	  */
	 boolean delFlight(Flight f);
}
