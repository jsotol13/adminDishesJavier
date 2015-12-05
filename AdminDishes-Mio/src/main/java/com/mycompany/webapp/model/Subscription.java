package com.mycompany.webapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


import org.appfuse.model.BaseObject;


@XmlRootElement
@Entity
@Table(name = "subscription")
public class Subscription extends BaseObject {
	
	private Long subscriptionID;
	private int year;
	private int week;
	private String name;
	private boolean state;
	private String description;
	private Set<UserSubscription> userSubscription;
	
	
	// START SNIPPET: subscriptionID
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "subscriptionID", unique = true, nullable = false)
	public Long getSubscriptionID() {
		return subscriptionID;
	}
	// END SNIPET: subscriptionID
	public void setSubscriptionID(Long subscriptionID) {
		this.subscriptionID = subscriptionID;
	}
	
	@Column(name = "year", length = 4)
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	@Column(name = "week", length = 2)
	public int getWeek() {
		return week;
	}
	public void setWeek(int week) {
		this.week = week;
	}
	
	@Column(name = "name", length = 20)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "state", length = 1)
	public boolean getState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	
	@Column(name = "description", length = 200)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "subscription", cascade = CascadeType.ALL)
	//@JsonIgnore
	//@XmlTransient
	public Set<UserSubscription> getUserSubscription() {
		return userSubscription;
	}
	public void setUserSubscription(Set<UserSubscription> userSubscription) {
		this.userSubscription = userSubscription;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (state ? 1231 : 1237);
		result = prime * result + ((subscriptionID == null) ? 0 : subscriptionID.hashCode());
		result = prime * result + week;
		result = prime * result + year;
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
		Subscription other = (Subscription) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (state != other.state)
			return false;
		if (subscriptionID == null) {
			if (other.subscriptionID != null)
				return false;
		} else if (!subscriptionID.equals(other.subscriptionID))
			return false;
		if (week != other.week)
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Subscription [subscriptionID=" + subscriptionID + ", year=" + year + ", week=" + week + ", name=" + name
				+ ", state=" + state + ", description=" + description + "]";
	}
	
}
