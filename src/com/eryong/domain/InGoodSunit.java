package com.eryong.domain;

public class InGoodSunit {
	//物品单位id
    private Integer inguId;
    //物品单位编码
    private String inguCode;
    //物品单位名称
    private String inguName;
    //简拼
    private String inguSpell;
    //状态 1:正常  2:禁用  (用不了0呀)
    private Integer inguState;
    //删除标志，0为未删除，1为已删除
    private Integer inguDdelflag;
    //备注
    private String inguRremark;
    //业务发生时间
    private String currDate;
    //操作人id
    private Integer optId;
    //操作人名
    private String optName;
	public Integer getInguId() {
		return inguId;
	}
	public void setInguId(Integer inguId) {
		this.inguId = inguId;
	}
	public String getInguCode() {
		return inguCode;
	}
	public void setInguCode(String inguCode) {
		this.inguCode = inguCode;
	}
	public String getInguName() {
		return inguName;
	}
	public void setInguName(String inguName) {
		this.inguName = inguName;
	}
	public String getInguSpell() {
		return inguSpell;
	}
	public void setInguSpell(String inguSpell) {
		this.inguSpell = inguSpell;
	}
	public Integer getInguState() {
		return inguState;
	}
	public void setInguState(Integer inguState) {
		this.inguState = inguState;
	}
	public Integer getInguDdelflag() {
		return inguDdelflag;
	}
	public void setInguDdelflag(Integer inguDdelflag) {
		this.inguDdelflag = inguDdelflag;
	}
	public String getInguRremark() {
		return inguRremark;
	}
	public void setInguRremark(String inguRremark) {
		this.inguRremark = inguRremark;
	}
	public String getCurrDate() {
		return currDate;
	}
	public void setCurrDate(String currDate) {
		this.currDate = currDate;
	}
	public Integer getOptId() {
		return optId;
	}
	public void setOptId(Integer optId) {
		this.optId = optId;
	}
	public String getOptName() {
		return optName;
	}
	public void setOptName(String optName) {
		this.optName = optName;
	}
	
}