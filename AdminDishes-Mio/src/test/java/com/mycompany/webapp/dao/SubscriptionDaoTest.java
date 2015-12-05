package com.mycompany.webapp.dao;

import static org.junit.Assert.assertEquals;
import org.appfuse.dao.BaseDaoTestCase;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;
import static org.junit.Assert.*;

import com.mycompany.webapp.model.Subscription;

public class SubscriptionDaoTest extends BaseDaoTestCase{
	
	 @Autowired
	    private SubscriptionDao subscriptionDao;

	 
	 @Test
	    public void testFindSubscriptionByYear() throws Exception {
	        List<Subscription> subscriptions = subscriptionDao.findByYear(2015);
	        assertTrue(subscriptions.size() > 0);
	    }
	 
	 @Test
	    public void testFindSubscriptionByWeek() throws Exception {
	        List<Subscription> subscriptions = subscriptionDao.findByWeek(10);
	        assertTrue(subscriptions.size() > 0);
	    }
	 
	 @Test
	    public void testFindSubscriptionByName() throws Exception {
	        List<Subscription> subscriptions = subscriptionDao.findByName("Comida Diaria Javier");
	        assertTrue(subscriptions.size() > 0);
	    }
	 
	 /*
	 @Test
	    public void testFindSubscriptionByState() throws Exception {
	        List<Subscription> subscriptions = subscriptionDao.findByState("1");
	        assertTrue(subscriptions.size() > 0);
	    }
	 */
	 
	 @Test
	    public void testFindSubscriptionByDescription() throws Exception {
	        List<Subscription> subscriptions = subscriptionDao.findByDescription("Comida Diaria de lunes a viernes");
	        assertTrue(subscriptions.size() > 0);
	    }
	 
	 
	 @Test(expected=DataAccessException.class)
	    public void testAddAndRemoveSubscription() throws Exception {
		 	Subscription subscription = new Subscription();
		 	
		 	subscription.setYear(2016);
		 	subscription.setWeek(20);
		 	subscription.setName("Comida vegetariana");
		 	subscription.setState(false);
		 	subscription.setDescription("Comida hecha de vegetales");
		 	
		 	
		 	subscription = subscriptionDao.save(subscription);	       
	        flush();

	        subscription = subscriptionDao.get(subscription.getSubscriptionID());

	        assertEquals("Comida vegetariana", subscription.getName());	        
	        assertNotNull(subscription.getSubscriptionID());

	        log.debug("removing subscription...");

	        subscriptionDao.remove(subscription.getSubscriptionID());
	        flush();

	        // should throw DataAccessException
	        subscriptionDao.get(subscription.getSubscriptionID());
	    }
	  
}
