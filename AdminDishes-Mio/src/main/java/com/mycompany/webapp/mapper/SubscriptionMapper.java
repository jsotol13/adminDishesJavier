package com.mycompany.webapp.mapper;

import java.util.List;

import org.mapstruct.factory.Mappers;
import com.mycompany.webapp.dto.SubscriptionDTO;
import com.mycompany.webapp.model.Subscription;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper
public interface SubscriptionMapper {

	SubscriptionMapper INSTANCE = Mappers.getMapper(SubscriptionMapper.class);
	
	List<SubscriptionDTO> subscriptionsToSubscriptionsDTOs(List<Subscription> subscriptions); 

	
	@Mappings({ 
		@Mapping(source = "subscriptionID", target = "subscriptionID"),
		@Mapping(source = "year", target = "year"),		
		@Mapping(source = "week", target = "week"), 
		@Mapping(source = "name", target = "name"),
		@Mapping(source = "state", target = "state"),
		@Mapping(source = "description", target = "description")
		})
	
	SubscriptionDTO subscriptionToSubscriptionDTO(Subscription subscription);
	 
}

