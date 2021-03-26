package com.flightSharing.ws;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.flightSharing.dao.Pilot;
import com.flightSharing.dao.PilotDao;
import com.flightSharing.dao.User;
import com.flightSharing.dao.UserDao;

@Path("/users")
public class UserWs implements UserDao, PilotDao {

	List<User> users = new ArrayList<User>();
	List<Pilot> pilots = new ArrayList<Pilot>();

	public UserWs() {
		User a = new User(0);
		User b = new User(1);
		Pilot c = new Pilot(0);
		Pilot d = new Pilot(1);
		users.add(a);
		users.add(b);
		pilots.add(c);
		pilots.add(d);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/list")
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return users;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public User getUser(@PathParam("id") int id) {
		// TODO Auto-generated method stub
		return users.get(0);
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/sign-up")
	public boolean addUser(User p) {
		// TODO Auto-generated method stub
		users.add(p);
		return true;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/edit")
	public boolean updateUser(User p) {
		// TODO Auto-generated method stub
		p.setFirstName("updated");
		return true;
	}

	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/delete")
	public boolean delUser(User p) {
		// TODO Auto-generated method stub
		users.remove(0);
		// remove from the pilots list if p is also a pilot
		return true;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/pilots/list")
	public List<Pilot> getPilots() {
		// TODO Auto-generated method stub
		return pilots;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/pilots/{id}")
	public Pilot getPilot(@PathParam("id") int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/pilot/add")
	public boolean addPilot(Pilot p) {
		// TODO Auto-generated method stub
		pilots.add(p);
		return true;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/pilot/edit")
	public boolean updatePilot(Pilot p) {
		// TODO Auto-generated method stub
		p.setExperience("experience updated");
		return true;
	}

	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/pilot/delete")
	public boolean delPilot(Pilot p) {
		// TODO Auto-generated method stub
		pilots.remove(2);
		return true;
	}

	public Pilot getPilot(Pilot p) {
		// TODO Auto-generated method stub
		return null;
	}

}
