package com.mycompany.webapp.dto;

import javax.xml.bind.annotation.XmlRootElement;

import com.mycompany.webapp.model.UserSubscription;

@XmlRootElement(name = "subscription")
public class SubscriptionDTO {
	
	private Long subscriptionID;
	private int year;
	private int week;
	private String name;
	private boolean state;
	private String description;
	private UserSubscription[] userSubscription;	
	
	
	public SubscriptionDTO(){
		super();
	}

	
	public SubscriptionDTO(Long subscriptionID, int year, int week, String name, boolean state, String description,
			UserSubscription[] userSubscription) {
		super();
		this.subscriptionID = subscriptionID;
		this.year = year;
		this.week = week;
		this.name = name;
		this.state = state;
		this.description = description;
		this.userSubscription = userSubscription;
	}

	public UserSubscription[] getUserSubscription() {
		return userSubscription;
	}
	public void setUserSubscription(UserSubscription[] userSubscription) {
		this.userSubscription = userSubscription;
	}

	public Long getSubscriptionID() {
		return subscriptionID;
	}

	public void setSubscriptionID(Long subscriptionID) {
		this.subscriptionID = subscriptionID;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getWeek() {
		return week;
	}

	public void setWeek(int week) {
		this.week = week;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "SubscriptionDTO [subscriptionID=" + subscriptionID + ", year=" + year + ", week=" + week + ", name="
				+ name + ", state=" + state + ", description=" + description + "]";
	}		
}
