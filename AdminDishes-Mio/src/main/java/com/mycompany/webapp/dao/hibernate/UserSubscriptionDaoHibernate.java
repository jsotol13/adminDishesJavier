package com.mycompany.webapp.dao.hibernate;


import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.springframework.stereotype.Repository;
import com.mycompany.webapp.dao.UserSubscriptionDao;
import com.mycompany.webapp.model.UserSubscription;

@Repository("userSubscriptionDao")
public class UserSubscriptionDaoHibernate extends GenericDaoHibernate<UserSubscription, Long>implements UserSubscriptionDao {

	public UserSubscriptionDaoHibernate() {
		super(UserSubscription.class);
	}

}
