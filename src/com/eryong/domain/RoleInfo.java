package com.eryong.domain;


public class RoleInfo {
    private Integer roleId;

    private String roleName;

    private String authIds;

    private String roleDescription;

    private Integer state;

    private Integer roleDelFlag;

    private String currentTime;

    private Integer optId;
    
    private String optName;

	@Override
	public String toString() {
		return "RoleInfo [roleId=" + roleId + ", roleName=" + roleName
				+ ", authIds=" + authIds + ", roleDescription="
				+ roleDescription + ", state=" + state + ", roleDelFlag="
				+ roleDelFlag + ", currentTime=" + currentTime + ", optId="
				+ optId + ", optName=" + optName + "]";
	}

	public String getOptName() {
		return optName;
	}

	public void setOptName(String optName) {
		this.optName = optName;
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

	public String getAuthIds() {
		return authIds;
	}

	public void setAuthIds(String authIds) {
		this.authIds = authIds;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getRoleDelFlag() {
		return roleDelFlag;
	}

	public void setRoleDelFlag(Integer roleDelFlag) {
		this.roleDelFlag = roleDelFlag;
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

	

	

    
}