package com.mycompany.webapp.dto;

import javax.xml.bind.annotation.XmlRootElement;

import com.mycompany.webapp.model.UserSubscription;

@XmlRootElement(name = "userCus")
public class UserCusDTO {
		
	private Long userId;	
	private String nickName;
	private String idProfile;
	private boolean state;
	private String password;
	private UserSubscription[]  userSubscription;
		
	public UserCusDTO(){
		super();
	}

	public UserCusDTO(Long userId, String nickName, String idProfile, boolean state, String password,
			UserSubscription[] userSubscription) {
		super();
		this.userId = userId;
		this.nickName = nickName;
		this.idProfile = idProfile;
		this.state = state;
		this.password = password;
		this.userSubscription = userSubscription;
	}

	public UserSubscription[] getUserSubscription() {
		return userSubscription;
	}

	public void setUserSubscription(UserSubscription[] userSubscription) {
		this.userSubscription = userSubscription;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getIdProfile() {
		return idProfile;
	}

	public void setIdProfile(String idProfile) {
		this.idProfile = idProfile;
	}

	public boolean getState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", nickName=" + nickName + ", idProfile=" + idProfile + ", state=" + state
				+ ", password=" + password + "]";
	}	
}
