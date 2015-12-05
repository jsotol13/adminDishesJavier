package com.mycompany.webapp.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.mycompany.webapp.dao.UserCusDao;
import com.mycompany.webapp.model.UserCus;


@Repository("userCusDao")
public class UserCusDaoHibernate extends GenericDaoHibernate<UserCus, Long>implements UserCusDao {

	public UserCusDaoHibernate() {
		super(UserCus.class);
	}

	@SuppressWarnings("unchecked")
	public List<UserCus> findByUserId(int userId) {
		return getSession().createCriteria(UserCus.class).add(Restrictions.eq("userId", userId)).list();
	}

	@SuppressWarnings("unchecked")
	public List<UserCus> findByNickName(String nickName) {
		return getSession().createCriteria(UserCus.class).add(Restrictions.eq("nickName", nickName)).list();
	}
		
	@SuppressWarnings("unchecked")
	public List<UserCus> findByIdProfile(String idProfile) {
		return getSession().createCriteria(UserCus.class).add(Restrictions.eq("idProfile", idProfile)).list();
	}
			
	@SuppressWarnings("unchecked")
	public List<UserCus> findByState(boolean state) {
		return getSession().createCriteria(UserCus.class).add(Restrictions.eq("state", state)).list();
	}
	
	
}
