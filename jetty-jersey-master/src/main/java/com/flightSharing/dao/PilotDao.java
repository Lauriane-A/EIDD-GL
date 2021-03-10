package com.flightSharing.dao;

import java.util.List;

public interface PilotDao {
	
	/**
	 * @return a list of all pilots registered
	 */
	List<Pilot> getPilots();
	
	/**
	 * @param id
	 * @return a pilot
	 */
	Pilot getPilot(int id);
	
	/**
	  * add a new signed up pilot
	  * @param p
	  * @return boolean if p has been added
	  */
	 boolean addPilot(Pilot p);
	 
	 /**
	  * modify pilot's field
	  * @param p
	  * @return true if succeed
	  */
	 boolean updatePilot(Pilot p);
	 
	 /**
	  * remove a pilot
	  * @param p
	  * @return true if succeed
	  */
	 boolean delPilot(Pilot p);
}
