package com.flightSharing.dao;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImplement implements UserDao, PilotDao {

	List<User> users = new ArrayList<User>();
	List<Pilot> pilots = new ArrayList<Pilot>();

	public UserDaoImplement() {
		User a = new User(0);
		User b = new User(1);
		Pilot c = new Pilot(0);
		Pilot d = new Pilot(1);
		users.add(a);
		users.add(b);
		pilots.add(c);
		pilots.add(d);
	}

	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return users;
	}

	public User getUser(int id) {
		// TODO Auto-generated method stub
		for (User u : users) {
			if (u.getId() == id) {
				return u;
			}
		}
		return null;
	}

	public boolean addUser(User u) {
		// TODO Auto-generated method stub
		users.add(u);
		if (u instanceof Pilot) {
			pilots.add((Pilot) u);
		}
		return true;
	}

	public boolean updateUser(User u) {
		// TODO Auto-generated method stub
		u.setFirstName("update");
		return true;
	}

	public boolean delUser(User u) {
		// TODO Auto-generated method stub
		int id = u.getId();
		for (User user : users) {
			if (user.getId() == id) {
				users.remove(u);
				if (user instanceof Pilot) {
					pilots.remove((Pilot) user);
				}
				return true;
			}
		}
		return false;
	}

	public List<Pilot> getPilots() {
		// TODO Auto-generated method stub
		return pilots;
	}

	public Pilot getPilot(int id) {
		// TODO Auto-generated method stub
		for (Pilot p : pilots) {
			if (p.getId() == id) {
				return p;
			}
		}
		return null;
	}

	public Pilot getPilot(Pilot p) {
		// TODO Auto-generated method stub
		int id = p.getId();
		return getPilot(id);
	}

	public boolean addPilot(Pilot p) {
		// TODO Auto-generated method stub
		pilots.add(p);
		return true;
	}

	public boolean updatePilot(Pilot p) {
		// TODO Auto-generated method stub
		p.setExperience("experience updated");
		return true;
	}

	public boolean delPilot(Pilot p) {
		// TODO Auto-generated method stub
		int id = p.getId();
		for (Pilot pilot : pilots) {
			if (pilot.getId() == id) {
				pilots.remove(pilot);
				users.remove(pilot);
				return true;
			}
		}
		return false;
	}

}
