package genie_logicil;

import java.util.List;

public interface PilotDao {
	/**
     * @return this list of pilots registered
     */
    List<Pilot> getPilots();
    
    /**
     * @return information of a Pilot assigned to a specific user 
     */
    Pilot getPilotInfo(String firstName,String lastName);

    /**
     * @param experience,qualifications,numFlightHours,flightInformation 
     * @return information of a Pilot assigned to a specific user 
     */
    Pilot signUpPilot(String experience,String qualifications,int numFlightHours,String flightInformation);
    
	/**
	 * @param firstName,lastName 
	 * @return this list of  flights planned by the pilot
	 */
	List<Flight> getFlightsPlanned(String firstName,String lastName);

}