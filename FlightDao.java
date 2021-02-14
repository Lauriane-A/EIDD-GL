package gltp4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface FlightDao {
	
	/**
	 * @return this list of flights 
	 */
	List<Flight> getFlights();

	/**
	 * @param departure_aerodrome,from and to
	 * @return this list of flights corresponding to the parameters
	 */
	List<Flight> getFlightWished(String departure_aerodrome, LocalDate from, LocalDate to);

	/**
	 * @param departure_aerodrome,arrivalAerodrome,departureDate,departureTime,arrivalDate,arrivalTime,flightDuration ,availablePlaces,price,meetingPlace
	 * @return nothing but add a new flight to the database
	 */
	void setFlight(String departure_aerodrome, String arrivalAerodrome, LocalDate departureDate,
			LocalDateTime departureTime, LocalDate arrivalDate, LocalDateTime arrivalTime, LocalDateTime flightDuration,
			int availablePlaces, int price, String meetingPlace);
	
	/**
	 * @param Flight
	 * delete a flight 
	 */
	void deleteFlights(Flight flight);
	
	/**
	 * @param availablePlaces
	 * modify available places 
	 */
	void updateFlightPlace(int availablePlaces);
	
	/**
	 * @param price
	 * modify price  
	 */
	void updateFlightPrice(int price);
	
	/**
	 * @param String meetingPlace
	 * modify meetingPlace
	 */
	void updateFlightMeetingPlace(String meetingPlace);
	

}
