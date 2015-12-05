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
import com.mycompany.webapp.model.Subscription;

//public class SubscriptionManagerImplTest extends BaseManagerMockTestCase {
public class SubscriptionManagerImplTest  {
	
	@InjectMocks
    private SubscriptionManagerImpl manager;

    @Mock
    private SubscriptionDao dao;

/*    
    @Test
    public void testGetSubscription() {
        log.debug("testing get...");
        //given
        final Long id = 7L;
        final Subscription subscription = new Subscription();
        given(dao.get(id)).willReturn(subscription);

        //when
        Subscription result = manager.get(id);

        //then
        assertSame(subscription, result);
    }
	
    
    
    @Test
    public void testGetSubscriptions() {
    	
        log.debug("testing getAll...");
        //given
        final List subscriptions = new ArrayList();
        
        given(dao.getAll()).willReturn(subscriptions);

        //when
        List result = manager.getAll();

        //then
        assertSame(subscriptions, result);
    }

    
    
    @Test
    public void testSaveSubscription() {
        log.debug("testing save...");

        //given
        final Subscription subscription = new Subscription();
        // enter all required fields

        given(dao.save(subscription)).willReturn(subscription);

        //when
        manager.save(subscription);

        //then
        verify(dao).save(subscription);
    }
    
    
    @Test
    public void testRemoveSubscription() {
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
