package com.rest.resource;


import java.sql.SQLException;
import java.util.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.rest.model.Profile;
import com.rest.service.ProfileService;

@Path("/profile")
public class ProfileResource {
	ProfileService service = new ProfileService();
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage(){
		return "REpresentation State Transfer";
	}
	
//	@GET
//	public List<Profile> getProfiles(@QueryParam("year") int year,@QueryParam("start") int start,@QueryParam("size") int size)
//	{
//		
//				if(start >= 0 && size > 0)
//				{
//					return service.getAllMessagePaginated(start,size);
//				}
//			
//		return service.getAllMessages();
//	}
	
//	
//	@Path("/{year}")
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<Profile> getProfiles(@QueryParam("year") int year)
//	{
//		if(year > 0)
//		{
//			return service.getAllMessagesForYear(year);
//		}
//		return service.getAllMessages();
//	}
	
//	@Path("/allprofiles")
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<Profile> getAllMessage(){
//		return service.getAllMessages();
//	}
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Profile addMessage(Profile m) throws SQLException{
		return service.addMessage(m);
	}
//	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Profile updateProfile(Profile m) throws SQLException{
		return service.updateprofile(m);
				
	}
	
	@Path("/{deleteId}")
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public String deleteMessage(@PathParam("deleteId") long id) throws SQLException{
		return service.removeProfile(id);
	}
	
	
	
	
	

}
