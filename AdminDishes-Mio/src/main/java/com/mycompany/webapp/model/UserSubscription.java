package com.mycompany.webapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.appfuse.model.BaseObject;

import com.fasterxml.jackson.annotation.JsonIgnore;

@XmlRootElement(name = "UserSubscription")
@Entity
@Table(name = "userSubscription")
public class UserSubscription extends BaseObject{
	
	private Long userSubscriptionID;
	private Subscription subscription;
	private UserCus userCus;
	
	
	// START SNIPPET: userSubscriptionID
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userSubscriptionID", unique = true, nullable = false)
	public Long getUserSubscriptionID() {
		return userSubscriptionID;
	}
	// END SNIPET: userSubscriptionID
	public void setUserSubscriptionID(Long userSubscriptionID) {
		this.userSubscriptionID = userSubscriptionID;
	}
		
	
	@ManyToOne
	@JoinColumn(name = "subscriptionID", nullable = false)
	@JsonIgnore
	public Subscription getSubscription() {
		return subscription;
	}
	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}
	
	
	@ManyToOne
	@JoinColumn(name = "userId", nullable = false)
	@JsonIgnore
	public UserCus getUserCus() {
		return userCus;
	}
	public void setUserCus(UserCus userCus) {
		this.userCus = userCus;
	}
	
			
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userSubscriptionID == null) ? 0 : userSubscriptionID.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserSubscription other = (UserSubscription) obj;
		if (userSubscriptionID == null) {
			if (other.userSubscriptionID != null)
				return false;
		} else if (!userSubscriptionID.equals(other.userSubscriptionID))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UserSubscription [userSubscriptionID=" + userSubscriptionID + "]";
	}
		
	
}
