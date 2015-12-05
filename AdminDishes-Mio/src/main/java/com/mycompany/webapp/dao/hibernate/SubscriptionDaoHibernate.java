package com.mycompany.webapp.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.mycompany.webapp.dao.SubscriptionDao;
import com.mycompany.webapp.model.Subscription;

@Repository("subscriptionDao")
public class SubscriptionDaoHibernate extends GenericDaoHibernate<Subscription, Long>implements SubscriptionDao {

	public SubscriptionDaoHibernate() {
		super(Subscription.class);
	}

	@SuppressWarnings("unchecked")
	public List<Subscription> findByYear(int year) {
		return getSession().createCriteria(Subscription.class).add(Restrictions.eq("year", year)).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Subscription> findByWeek(int week) {
		return getSession().createCriteria(Subscription.class).add(Restrictions.eq("week", week)).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Subscription> findByName(String name) {
		return getSession().createCriteria(Subscription.class).add(Restrictions.eq("name", name)).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Subscription> findByState(String state) {
		return getSession().createCriteria(Subscription.class).add(Restrictions.eq("state", state)).list();
	}	
	
	@SuppressWarnings("unchecked")
	public List<Subscription> findByDescription(String description) {
		return getSession().createCriteria(Subscription.class).add(Restrictions.eq("description", description)).list();
	}	
}
