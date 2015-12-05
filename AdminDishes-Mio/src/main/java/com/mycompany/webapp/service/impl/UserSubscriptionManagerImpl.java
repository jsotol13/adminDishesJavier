package com.mycompany.webapp.service.impl;

import java.util.List;

import javax.jws.WebService;

import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.webapp.dao.SubscriptionDao;
import com.mycompany.webapp.dao.UserSubscriptionDao;
import com.mycompany.webapp.dto.SubscriptionDTO;
import com.mycompany.webapp.dto.UserSubscriptionDTO;
import com.mycompany.webapp.mapper.SubscriptionMapper;
import com.mycompany.webapp.mapper.UserSubscriptionMapper;
import com.mycompany.webapp.model.Subscription;
import com.mycompany.webapp.model.UserSubscription;
import com.mycompany.webapp.services.SubscriptionManager;
import com.mycompany.webapp.services.UserSubscriptionManager;

@Transactional
@Service("userSubscriptionManager")
@WebService(serviceName = "UserSubscriptionService", endpointInterface = "com.mycompany.webapp.services.UserSubscriptionManager")
public class UserSubscriptionManagerImpl  extends GenericManagerImpl<UserSubscription, Long>implements UserSubscriptionManager {


	UserSubscriptionDao userSubscriptionDao;
	
	public UserSubscriptionManagerImpl(){		
	}
	
	@Autowired
	public UserSubscriptionManagerImpl(UserSubscriptionDao userSubscriptionDao){
		super(userSubscriptionDao);
		this.userSubscriptionDao = userSubscriptionDao;
	}
	
	
	public List<UserSubscriptionDTO> getUserSubscriptions() {
		List<UserSubscriptionDTO> userSubscriptionDTOs = null;
		List<UserSubscription> userSubscriptionList = userSubscriptionDao.getAll();
		userSubscriptionDTOs = UserSubscriptionMapper.INSTANCE.userSubscriptionsToUserSubscriptionsDTOs(userSubscriptionList);
		return userSubscriptionDTOs;
	}
	
}
