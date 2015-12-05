package com.mycompany.webapp.dto;

import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

import com.mycompany.webapp.model.Subscription;
import com.mycompany.webapp.model.UserCus;
import com.mycompany.webapp.model.UserSubscription;

@XmlRootElement(name = "userSubscription")
public class UserSubscriptionDTO {
	
	private Long userSubscriptionID;
	private Subscription subscription;
	private UserCus userCus;	
		
	public UserSubscriptionDTO(){
		super();
	}
	
	public UserSubscriptionDTO(Long userSubscriptionID, Subscription subscription, UserCus userCus) {
		super();
		this.userSubscriptionID = userSubscriptionID;
		this.subscription = subscription;
		this.userCus = userCus;
	}
	
	public Long getUserSubscriptionID() {
		return userSubscriptionID;
	}

	public void setUserSubscriptionID(Long userSubscriptionID) {
		this.userSubscriptionID = userSubscriptionID;
	}

	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	public UserCus getUserCus() {
		return userCus;
	}

	public void setUserCus(UserCus userCus) {
		this.userCus = userCus;
	}

	@Override
	public String toString() {
		return "UserSubscriptionDTO [userSubscriptionID=" + userSubscriptionID + ", subscription=" + subscription
				+ ", userCus=" + userCus + "]";
	}
	

}
