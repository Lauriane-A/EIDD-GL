package com.flightSharing.dao;

import java.util.List;

public interface PassengerDao {
	
	/*
	 * @return a list of all registered passengers
	 */
	 List<Passenger> getPassengers();
	 
	 /**
	  * find a passenger by id number
	  * @param id
	  * @return passenger who matches with id
	  */
	 Passenger getPassenger(int id);
	 
	 /**
	  * add a new signed up passenger
	  * @param p
	  * @return boolean if p has been added
	  */
	 boolean addPassenger(Passenger p);
	 
	 /**
	  * modify passenger's field
	  * @param p
	  * @return true if succeed
	  */
	 boolean updatePassenger(Passenger p);
	 
	 /**
	  * remove a passenger
	  * @param p
	  * @return true if succeed
	  */
	 boolean delPassenger(Passenger p);
}
