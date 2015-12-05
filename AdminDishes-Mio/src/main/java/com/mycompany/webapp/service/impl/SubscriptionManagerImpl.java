package com.mycompany.webapp.service.impl;

import java.util.List;

import javax.jws.WebService;

import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.webapp.dao.SubscriptionDao;
import com.mycompany.webapp.dto.SubscriptionDTO;
import com.mycompany.webapp.mapper.SubscriptionMapper;
import com.mycompany.webapp.model.Subscription;
import com.mycompany.webapp.services.SubscriptionManager;

@Transactional
@Service("subscriptionManager")
@WebService(serviceName = "SubscriptionService", endpointInterface = "com.mycompany.webapp.services.SubscriptionManager")
public class SubscriptionManagerImpl  extends GenericManagerImpl<Subscription, Long>implements SubscriptionManager {


	SubscriptionDao subscriptionDao;
	
	public SubscriptionManagerImpl(){		
	}
	
	@Autowired
	public SubscriptionManagerImpl(SubscriptionDao subscriptionDao){
		super(subscriptionDao);
		this.subscriptionDao = subscriptionDao;
	}

	public List<SubscriptionDTO> findByYear(int year) {		
		List<SubscriptionDTO> subscriptionDTOs = null;
		List<Subscription> subscriptionList = subscriptionDao.findByYear(year);
		subscriptionDTOs = SubscriptionMapper.INSTANCE.subscriptionsToSubscriptionsDTOs(subscriptionList);
		return subscriptionDTOs;
	}
	
	public List<SubscriptionDTO> findByWeek(int week) {		
		List<SubscriptionDTO> subscriptionDTOs = null;
		List<Subscription> subscriptionList = subscriptionDao.findByWeek(week);
		subscriptionDTOs = SubscriptionMapper.INSTANCE.subscriptionsToSubscriptionsDTOs(subscriptionList);
		return subscriptionDTOs;
	}
	
	public List<SubscriptionDTO> findByName(String name) {		
		List<SubscriptionDTO> subscriptionDTOs = null;
		List<Subscription> subscriptionList = subscriptionDao.findByName(name);
		subscriptionDTOs = SubscriptionMapper.INSTANCE.subscriptionsToSubscriptionsDTOs(subscriptionList);
		return subscriptionDTOs;
	}
	
	public List<SubscriptionDTO> findByState(String state) {		
		List<SubscriptionDTO> subscriptionDTOs = null;
		List<Subscription> subscriptionList = subscriptionDao.findByState(state);
		subscriptionDTOs = SubscriptionMapper.INSTANCE.subscriptionsToSubscriptionsDTOs(subscriptionList);
		return subscriptionDTOs;
	}
	
	public List<SubscriptionDTO> findByDescription(String description) {		
		List<SubscriptionDTO> subscriptionDTOs = null;
		List<Subscription> subscriptionList = subscriptionDao.findByDescription(description);
		subscriptionDTOs = SubscriptionMapper.INSTANCE.subscriptionsToSubscriptionsDTOs(subscriptionList);
		return subscriptionDTOs;
	}

	public List<SubscriptionDTO> getSubscriptions() {
		List<SubscriptionDTO> subscriptionDTOs = null;
		List<Subscription> subscriptionList = subscriptionDao.getAll();
		subscriptionDTOs = SubscriptionMapper.INSTANCE.subscriptionsToSubscriptionsDTOs(subscriptionList);
		return subscriptionDTOs;
	}
	
}
