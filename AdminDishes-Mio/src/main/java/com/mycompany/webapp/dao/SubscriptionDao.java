package com.mycompany.webapp.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;


import com.mycompany.webapp.model.Subscription;

public interface SubscriptionDao  extends GenericDao<Subscription, Long> {

	public List<Subscription> findByYear(int year);
	
	public List<Subscription> findByWeek(int weekr);
	
	public List<Subscription> findByName(String name);

	public List<Subscription> findByState(String state);
	
	public List<Subscription> findByDescription(String description);
}
