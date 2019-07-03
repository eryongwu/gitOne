package com.eryong.domain;

import java.util.Date;

public class WorkBookDetail {
    private Integer wBDId;

    private Integer wBId;

    private String wBDName;

    private String wBDRemark;

    private Integer wBDDelFlag;

    private Integer wBDState;

    private String currentTime;

    private Integer optId;

	public Integer getwBDId() {
		return wBDId;
	}

	public void setwBDId(Integer wBDId) {
		this.wBDId = wBDId;
	}

	public Integer getwBId() {
		return wBId;
	}

	public void setwBId(Integer wBId) {
		this.wBId = wBId;
	}

	public String getwBDName() {
		return wBDName;
	}

	public void setwBDName(String wBDName) {
		this.wBDName = wBDName;
	}

	public String getwBDRemark() {
		return wBDRemark;
	}

	public void setwBDRemark(String wBDRemark) {
		this.wBDRemark = wBDRemark;
	}

	public Integer getwBDDelFlag() {
		return wBDDelFlag;
	}

	public void setwBDDelFlag(Integer wBDDelFlag) {
		this.wBDDelFlag = wBDDelFlag;
	}

	public Integer getwBDState() {
		return wBDState;
	}

	public void setwBDState(Integer wBDState) {
		this.wBDState = wBDState;
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
		return "WorkBookDetail [wBDId=" + wBDId + ", wBId=" + wBId + ", wBDName="
				+ wBDName + ", wBDRemark=" + wBDRemark + ", wBDDelFlag="
				+ wBDDelFlag + ", wBDState=" + wBDState + ", currentTime="
				+ currentTime + ", optId=" + optId + "]";
	}

	
	
  
}