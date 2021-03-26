package com.flightSharing.dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Flight {
	private int id;
	private String departureAerodrome;
	private String arrivalAerodrome;
	private LocalDate departureDate;
	private LocalDateTime departureTime;
	private LocalDate arrivalDate;
	private LocalDateTime arrivalTime;
	private LocalDateTime flightDuration;
	private int availablePlaces;
	private int price;
	private String meetingPlace;
	private Pilot owner;
	private List<User> subscribed = new ArrayList<User>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartureAerodrome() {
		return departureAerodrome;
	}

	public void setDepartureAerodrome(String departureAerodrome) {
		this.departureAerodrome = departureAerodrome;
	}

	public String getArrivalAerodrome() {
		return arrivalAerodrome;
	}

	public void setArrivalAerodrome(String arrivalAerodrome) {
		this.arrivalAerodrome = arrivalAerodrome;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}

	public LocalDateTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public LocalDateTime getFlightDuration() {
		return flightDuration;
	}

	public void setFlightDuration(LocalDateTime flightDuration) {
		this.flightDuration = flightDuration;
	}

	public int getAvailablePlaces() {
		return availablePlaces;
	}

	public void setAvailablePlaces(int availablePlaces) {
		this.availablePlaces = availablePlaces;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMeetingPlace() {
		return meetingPlace;
	}

	public void setMeetingPlace(String meetingPlace) {
		this.meetingPlace = meetingPlace;
	}

	public Pilot getOwner() {
		return owner;
	}

	public void setOwner(Pilot owner) {
		this.owner = owner;
	}

	public List<User> getSubscribed() {
		return subscribed;
	}

	public void setSubscribed(List<User> subscribed) {
		this.subscribed = subscribed;
	}

}
