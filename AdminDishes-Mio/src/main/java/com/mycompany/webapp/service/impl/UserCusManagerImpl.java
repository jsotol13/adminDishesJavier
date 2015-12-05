package com.mycompany.webapp.service.impl;

import java.util.List;

import javax.jws.WebService;
import javax.transaction.Transactional;

import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.webapp.dao.UserCusDao;
import com.mycompany.webapp.dto.SubscriptionDTO;
import com.mycompany.webapp.dto.UserCusDTO;
import com.mycompany.webapp.mapper.UserCusMapper;
import com.mycompany.webapp.model.Subscription;
import com.mycompany.webapp.model.UserCus;
import com.mycompany.webapp.services.UserCusManager;


@Transactional
@Service("userCusManager")
@WebService(serviceName = "UserCusService", endpointInterface = "com.mycompany.webapp.services.UserCusManager")
public class UserCusManagerImpl  extends GenericManagerImpl<UserCus, Long>implements UserCusManager {

	

	UserCusDao userCusDao;
	
	public UserCusManagerImpl(){		
	}
	
	@Autowired
	public UserCusManagerImpl(UserCusDao userCusDao){
		super(userCusDao);
		this.userCusDao = userCusDao;
	}
	
	
	public List<UserCusDTO> findByUserId(int userId) {
		List<UserCusDTO> userCusDTOs = null;
		List<UserCus> userCusList = userCusDao.findByUserId(userId);
		userCusDTOs = UserCusMapper.INSTANCE.usersCusToUsersCusDTOs(userCusList);		
		return userCusDTOs;
	}
	
	public List<UserCusDTO> findByNickName(String nickName) {		
		List<UserCusDTO> userCusDTOs = null;		
		List<UserCus> userCusList = userCusDao.findByNickName(nickName);	
		userCusDTOs = UserCusMapper.INSTANCE.usersCusToUsersCusDTOs(userCusList);		
		return userCusDTOs;
	}
	
	public List<UserCusDTO> findByIdProfile(String idProfile) {		
		List<UserCusDTO> userCusDTOs = null;	
		List<UserCus> userCusList = userCusDao.findByIdProfile(idProfile);		
		userCusDTOs = UserCusMapper.INSTANCE.usersCusToUsersCusDTOs(userCusList);		
		return userCusDTOs;
	}
	
	public List<UserCusDTO> findByState(boolean state) {				
		List<UserCusDTO> userCusDTOs = null;	
		List<UserCus> userCusList = userCusDao.findByState(state);		
		userCusDTOs = UserCusMapper.INSTANCE.usersCusToUsersCusDTOs(userCusList);		
		return userCusDTOs;
	}
			
	public List<UserCusDTO> getUsersCus() {
		List<UserCusDTO> userCusDTOs = null;		
		List<UserCus> userCusList = userCusDao.getAll();	
		userCusDTOs = UserCusMapper.INSTANCE.usersCusToUsersCusDTOs(userCusList);		
		return userCusDTOs;
	}

}
