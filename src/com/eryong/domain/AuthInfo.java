package com.eryong.domain;



public class AuthInfo {
    private Integer authId;

    private String authName;

    private String authPath;

    private Integer parentId;

    private String authDescription;

    private String state;

    private String iconCls;

    private Integer authDelFlag;

    private String currentTime;
    
    public String getOptName() {
		return optName;
	}

	public void setOptName(String optName) {
		this.optName = optName;
	}

	private Integer optId;
    
    private String optName;

    @Override
	public String toString() {
		return "Auth [authId=" + authId + ", authName=" + authName
				+ ", authPath=" + authPath + ", parentId=" + parentId
				+ ", authDescription=" + authDescription + ", state=" + state
				+ ", iconCls=" + iconCls + ", authDelFlag=" + authDelFlag
				+ ", currentTime=" + currentTime + ", optId=" + optId + "]";
		
	}

	public Integer getAuthId() {
		return authId;
	}

	public void setAuthId(Integer authId) {
		this.authId = authId;
	}

	public String getAuthName() {
		return authName;
	}

	public void setAuthName(String authName) {
		this.authName = authName;
	}

	public String getAuthPath() {
		return authPath;
	}

	public void setAuthPath(String authPath) {
		this.authPath = authPath;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getAuthDescription() {
		return authDescription;
	}

	public void setAuthDescription(String authDescription) {
		this.authDescription = authDescription;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getIconCls() {
		return iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

	public Integer getAuthDelFlag() {
		return authDelFlag;
	}

	public void setAuthDelFlag(Integer authDelFlag) {
		this.authDelFlag = authDelFlag;
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