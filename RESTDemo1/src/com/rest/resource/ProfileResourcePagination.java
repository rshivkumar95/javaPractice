package com.rest.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.rest.model.Profile;
import com.rest.service.ProfileService;

@Path("/msg")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProfileResourcePagination {
	
	ProfileService service = new ProfileService();
//	
//	@Path("/{year}/")
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
//	@POST
//	@Produces(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Profile addMessage(Profile m){
//		return service.addMessage(m);
//	}
//	

}
