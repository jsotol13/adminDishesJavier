package com.mycompany.webapp.service.impl;

import static org.junit.Assert.assertSame;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willDoNothing;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.appfuse.service.impl.BaseManagerMockTestCase;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.mycompany.webapp.dao.SubscriptionDao;
import com.mycompany.webapp.dao.UserCusDao;
import com.mycompany.webapp.model.Subscription;
import com.mycompany.webapp.model.UserCus;

//public class UserCusManagerImplTest extends BaseManagerMockTestCase {
public class UserCusManagerImplTest {
	
	@InjectMocks
    private UserCusManagerImpl manager;

    @Mock
    private UserCusDao dao;
    /*
    @Test
    public void testGetUserCus() {
        log.debug("testing get...");
        //given
        final Long id = 7L;
        final UserCus userCus = new UserCus();
        given(dao.get(id)).willReturn(userCus);

        //when
        UserCus result = manager.get(id);

        //then
        assertSame(userCus, result);
    }
	
    
   
    @Test
    public void testGetUsersCus() {
    	
        log.debug("testing getAll...");
        //given
        final List usesrCus = new ArrayList();
        
        given(dao.getAll()).willReturn(usesrCus);

        //when
        List result = manager.getAll();

        //then
        assertSame(usesrCus, result);
    }

    
    
    @Test
    public void testSaveUserCus() {
        log.debug("testing save...");

        //given
        final UserCus userCus = new UserCus();
        // enter all required fields

        given(dao.save(userCus)).willReturn(userCus);

        //when
        manager.save(userCus);

        //then
        verify(dao).save(userCus);
    }
    
    
    @Test
    public void testRemoveUserCus() {
        log.debug("testing remove...");

        //given
        final Long id = -11L;
        willDoNothing().given(dao).remove(id);

        //when
        manager.remove(id);

        //then
        verify(dao).remove(id);
    }
    */
}
