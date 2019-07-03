package com.eryong.domain;


public class UserInfo {
    private Integer userId;

    private String userName;

    private String password;

    private Integer state;

    private Integer roleId;
    
    private String roleName;

    private String userDescription;
    
    public Integer getUserDelflag() {
		return userDelflag;
	}

	public void setUserDelflag(Integer userDelflag) {
		this.userDelflag = userDelflag;
	}

	private String currentTime;
    
    private Integer optId;
    
    private Integer userDelflag;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getUserDescription() {
		return userDescription;
	}

	public void setUserDescription(String userDescription) {
		this.userDescription = userDescription;
	}

	public String getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}

	public Integer getOptId() {
		return optId;
	}

	public void setOptId(Integer optId) {
		this.optId = optId;
	}

	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userName=" + userName
				+ ", password=" + password + ", state=" + state + ", roleId="
				+ roleId + ", roleName=" + roleName + ", userDescription="
				+ userDescription + ", currentTime=" + currentTime + ", optId="
				+ optId + ", userDelflag=" + userDelflag + "]";
	}
    
	
    
  
}