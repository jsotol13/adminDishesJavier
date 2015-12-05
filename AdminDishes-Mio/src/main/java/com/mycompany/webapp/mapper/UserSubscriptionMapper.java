package com.mycompany.webapp.mapper;

import java.util.List;

import org.mapstruct.factory.Mappers;
import com.mycompany.webapp.dto.SubscriptionDTO;
import com.mycompany.webapp.dto.UserSubscriptionDTO;
import com.mycompany.webapp.model.Subscription;
import com.mycompany.webapp.model.UserCus;
import com.mycompany.webapp.model.UserSubscription;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper
public interface UserSubscriptionMapper {

	UserSubscriptionMapper INSTANCE = Mappers.getMapper(UserSubscriptionMapper.class);
	
	List<UserSubscriptionDTO> userSubscriptionsToUserSubscriptionsDTOs(List<UserSubscription> userSubscriptions); 
	

	@Mappings({ 
		@Mapping(source = "userSubscriptionID", target = "userSubscriptionID"),
		@Mapping(source = "subscription", target = "subscription"),		
		@Mapping(source = "userCus", target = "userCus") 		
		})
	
	UserSubscriptionDTO userSubscriptionToUserSubscriptionDTO(UserSubscription userSubscription);
	 
}

