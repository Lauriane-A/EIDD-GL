package gltp4;

public interface PassengerDao {
	
	/*
	 * @return a list of all registered passengers
	 */
	 List<Passenger> getPassengers();
	 
	 /*
	  * @param flight to add
	  * add to the passenger's list the booked flight
	  */
	 void bookFlight (Flight flight);
	 
	 /*
	  * @param passenger who signs up
	  * add the passenger to the list of all registered passengers
	  */
	 void signUp (Passenger passenger);
}
