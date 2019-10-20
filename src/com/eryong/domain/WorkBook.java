package com.eryong.domain;


import java.util.List;

public class WorkBook {
    private Integer wBId;

    private String wBName;

    private Integer wBDelFlag;

    private String wBRemark;

    private String currentTime;

    private Integer optId;

    private Integer wBState;
    
    private List<WorkBookDetail> workBookDetail;

	public Integer getwBId() {
		return wBId;
	}

	public void setwBId(Integer wBId) {
		this.wBId = wBId;
	}

	public String getwBName() {
		return wBName;
	}

	public void setwBName(String wBName) {
		this.wBName = wBName;
	}

	public Integer getwBDelFlag() {
		return wBDelFlag;
	}

	public void setwBDelFlag(Integer wBDelFlag) {
		this.wBDelFlag = wBDelFlag;
	}

	public String getwBRemark() {
		return wBRemark;
	}

	public void setwBRemark(String wBRemark) {
		this.wBRemark = wBRemark;
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

	public Integer getwBState() {
		return wBState;
	}

	public void setwBState(Integer wBState) {
		this.wBState = wBState;
	}

	public List<WorkBookDetail> getWorkBookDetail() {
		return workBookDetail;
	}

	public void setWorkBookDetail(List<WorkBookDetail> workBookDetail) {
		this.workBookDetail = workBookDetail;
	}

	@Override
	public String toString() {
		return "WorkBook [wBId=" + wBId + ", wBName=" + wBName + ", wBDelFlag="
				+ wBDelFlag + ", wBRemark=" + wBRemark + ", currentTime="
				+ currentTime + ", optId=" + optId + ", wBState=" + wBState
				+ ", workBookDetail=" + workBookDetail + "]";
	}

    
}