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
import com.mycompany.webapp.model.UserCus;

public class UserCusDaoTest extends BaseDaoTestCase{
	
	 @Autowired
	    private UserCusDao userCusDao;
	 
	 /*
	 @Test
	    public void testFindByUserId() throws Exception {
	        List<UserCus> usersCus = userCusDao.findByUserId("1");
	        assertTrue(usersCus.size() > 0);
	    }
	    */
	 
	 @Test
	    public void testFindByNickName() throws Exception {
	        List<UserCus> usersCus = userCusDao.findByNickName("jsoto");
	        assertTrue(usersCus.size() > 0);
	    }
	 
	 @Test
	    public void testFindByIdProfile() throws Exception {
	        List<UserCus> usersCus = userCusDao.findByIdProfile("600255");
	        assertTrue(usersCus.size() > 0);
	    }
	 
	 /*
	 @Test
	    public void testFindByState() throws Exception {
	        List<UserCus> usersCus = subscriptionDao.findByState(1);
	        assertTrue(usersCus.size() > 0);
	    }
	 */
	
	 
	 
	 
	 
	 
	 @Test(expected=DataAccessException.class)
	    public void testAddAndRemoveUserCus() throws Exception {
		 	UserCus userCus = new UserCus();
		 	
		 	//userCus.setUserId(2);
		 	userCus.setNickName("ledezma");
		 	userCus.setIdProfile("255");
		 	userCus.setState(false);		 	
		 	
		 	
		 	userCus = userCusDao.save(userCus);	       
	        flush();

	        userCus = userCusDao.get(userCus.getUserId());

	        assertEquals("ledezma", userCus.getNickName());	        
	        assertNotNull(userCus.getUserId());

	        log.debug("removing subscription...");

	        userCusDao.remove(userCus.getUserId());
	        flush();

	        // should throw DataAccessException
	        userCusDao.get(userCus.getUserId());
	    }
	  
}
