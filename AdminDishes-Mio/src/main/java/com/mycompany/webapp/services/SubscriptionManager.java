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
import com.mycompany.webapp.model.Subscription;

@WebService
@Path("/subscriptions")
public interface SubscriptionManager  extends GenericManager<Subscription, Long> {

	
	@GET
	@Path("{name}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<SubscriptionDTO> findByName(@PathParam("name") String name);
	// URL: /services/api/subscriptions/Javier
	
	@GET
	@Path("/search/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<SubscriptionDTO> findByYear(@QueryParam("year") int year);
	// URL: /services/api/subscriptions/search?year=2015

	@GET
	@Path("/state/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<SubscriptionDTO> findByState(@QueryParam("state") String state);
	// URL: /services/api/subscriptions/state?state=1
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<SubscriptionDTO> getSubscriptions();
	
}
