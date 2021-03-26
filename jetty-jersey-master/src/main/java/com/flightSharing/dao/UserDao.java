package com.flightSharing.dao;

import java.util.List;

public interface UserDao {

	/*
	 * @return a list of all registered passengers
	 */
	List<User> getUsers();

	/**
	 * find a passenger by id number
	 * 
	 * @param id
	 * @return passenger who matches with id
	 */
	User getUser(int id);

	/**
	 * add a new signed up passenger
	 * 
	 * @param p
	 * @return boolean if p has been added
	 */
	boolean addUser(User p);

	/**
	 * modify passenger's field
	 * 
	 * @param p
	 * @return true if succeed
	 */
	boolean updateUser(User p);

	/**
	 * remove a passenger
	 * 
	 * @param p
	 * @return true if succeed
	 */
	boolean delUser(User p);
}
