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
import com.mycompany.webapp.dto.UserSubscriptionDTO;
import com.mycompany.webapp.model.Subscription;
import com.mycompany.webapp.model.UserSubscription;

@WebService
@Path("/userSubscriptions")
public interface UserSubscriptionManager  extends GenericManager<UserSubscription, Long> {

	
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<UserSubscriptionDTO> getUserSubscriptions();
	
}
