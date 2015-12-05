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
import javax.xml.bind.annotation.XmlTransient;

import org.appfuse.model.BaseObject;


import com.fasterxml.jackson.annotation.JsonIgnore;

@XmlRootElement
@Entity
@Table(name = "userCus")
public class UserCus extends BaseObject {
	
	private Long userId;	
	private String nickName;
	private String idProfile;
	private boolean state;
	private String password;
	private Set<UserSubscription> userSubscription;
	
				
	// START SNIPPET: userId
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userId", unique = true, nullable = false)	
	public Long getUserId() {
		return userId;
	}
	// END SNIPET: userId
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	// END SNIPET: userId
	
	@Column(name = "nickName", length = 10)
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	
	@Column(name = "idProfile", length = 8)
	public String getIdProfile() {
		return idProfile;
	}
	public void setIdProfile(String idProfile) {
		this.idProfile = idProfile;
	}
	
	
	@Column(name = "state", length = 1)
	public boolean getState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	
	
	@Column(name = "password", length = 15)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userCus", cascade = CascadeType.ALL)
	@JsonIgnore
	@XmlTransient
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
		result = prime * result + ((idProfile == null) ? 0 : idProfile.hashCode());
		result = prime * result + ((nickName == null) ? 0 : nickName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + (state ? 1231 : 1237);
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		UserCus other = (UserCus) obj;
		if (idProfile == null) {
			if (other.idProfile != null)
				return false;
		} else if (!idProfile.equals(other.idProfile))
			return false;
		if (nickName == null) {
			if (other.nickName != null)
				return false;
		} else if (!nickName.equals(other.nickName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (state != other.state)
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", nickName=" + nickName + ", idProfile=" + idProfile + ", state=" + state
				+ ", password=" + password + "]";
	}
}
