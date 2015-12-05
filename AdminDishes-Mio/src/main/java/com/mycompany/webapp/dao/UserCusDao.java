package com.mycompany.webapp.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;


import com.mycompany.webapp.model.Subscription;
import com.mycompany.webapp.model.UserCus;


public interface UserCusDao  extends GenericDao<UserCus, Long> {

	public List<UserCus> findByUserId(int userId);
	
	public List<UserCus> findByNickName(String nickName) ;
	
	public List<UserCus> findByIdProfile(String idProfile);

	public List<UserCus>  findByState(boolean state);
}
