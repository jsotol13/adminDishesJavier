package com.mycompany.webapp.mapper;

import java.util.List;

import org.mapstruct.factory.Mappers;
import com.mycompany.webapp.dto.SubscriptionDTO;
import com.mycompany.webapp.dto.UserCusDTO;
import com.mycompany.webapp.model.Subscription;
import com.mycompany.webapp.model.UserCus;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper
public interface UserCusMapper {

	UserCusMapper INSTANCE = Mappers.getMapper(UserCusMapper.class);
	
	List<UserCusDTO> usersCusToUsersCusDTOs(List<UserCus> users); 

	
	@Mappings({ 
		@Mapping(source = "userId", target = "userId"),
		@Mapping(source = "nickName", target = "nickName"),		
		@Mapping(source = "idProfile", target = "idProfile"),
		@Mapping(source = "state", target = "state"),		
		@Mapping(source = "userSubscription", target = "userSubscription")		
		})
	
	UserCusDTO userToUserDTO(UserCus userCus);
	 
}

