package com.mycompany.webapp.services;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.appfuse.service.GenericManager;

import com.mycompany.webapp.dto.SubscriptionDTO;
import com.mycompany.webapp.dto.UserCusDTO;
import com.mycompany.webapp.model.Subscription;
import com.mycompany.webapp.model.UserCus;

@WebService
@Path("/usersCus")
public interface UserCusManager  extends GenericManager<UserCus, Long> {
	
	@GET
	@Path("{nickName}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<UserCusDTO> findByNickName(@PathParam("nickName") String nickName);
	// URL: /services/api/usersCus/jsoto
		
	@GET
	@Path("/search/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<UserCusDTO> findByIdProfile(@QueryParam("idProfile") String idProfile);
	// URL: /services/api/users/search?idProfile=600255
	
	@GET
	@Path("/state/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<UserCusDTO> findByState(@QueryParam("state") boolean state);
	// URL: /services/api/users/state?state=1
			
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<UserCusDTO> getUsersCus();
	
}
