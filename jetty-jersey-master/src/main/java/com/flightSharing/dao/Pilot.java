package com.flightSharing.dao;

import java.util.List;

public class Pilot extends User {

	public Pilot(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	private String experience;
	private String qualifications;
	private int numFlightHours;
	private String airplaneBrand;
	private List<Flight> flightList;

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getQualifications() {
		return qualifications;
	}

	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}

	public int getNumFlightHours() {
		return numFlightHours;
	}

	public void setNumFlightHours(int numFlightHours) {
		this.numFlightHours = numFlightHours;
	}

	public String getAirplaneBrand() {
		return airplaneBrand;
	}

	public void setAirplaneBrand(String airplaneBrand) {
		this.airplaneBrand = airplaneBrand;
	}

	public List<Flight> getFlightList() {
		return flightList;
	}

	public void setFlightList(List<Flight> flightList) {
		this.flightList = flightList;
	}
}