package com.flightSharing.dao;

import java.time.LocalDate;
import java.util.List;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate birthday;
	private int phone;
	private String email;
	private List<Flight> bookedFlights;

	public User(int id) {
		this.id = id;
		this.firstName = "user" + id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Flight> getBookedFlights() {
		return bookedFlights;
	}

	public void setBookedFlights(List<Flight> bookedFlights) {
		this.bookedFlights = bookedFlights;
	}
}
