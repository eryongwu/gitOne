package com.eryong.domain;
/**
 * 
 * @author 曹植
 *
 */

public class InGoodsType {
    private Integer ingtId;//物品类型id

    private String ingtCode;//物品类型编码

    private String ingtName;//物品类型名称

    private String ingtSpell;//简拼

    private String ingtRemark;//备注

    private int ingtState;//状态

    private int ingtDelflag;//删除标志,0为未删除，1为已删除

    private int optId;//操作人

    private String currDate;//业务发生时间
    
    private String optName;

	public Integer getIngtId() {
		return ingtId;
	}

	public String getOptName() {
		return optName;
	}

	public void setOptName(String optName) {
		this.optName = optName;
	}

	public void setIngtId(Integer ingtId) {
		this.ingtId = ingtId;
	}

	public String getIngtCode() {
		return ingtCode;
	}

	public void setIngtCode(String ingtCode) {
		this.ingtCode = ingtCode;
	}

	public String getIngtName() {
		return ingtName;
	}

	public void setIngtName(String ingtName) {
		this.ingtName = ingtName;
	}

	public String getIngtSpell() {
		return ingtSpell;
	}

	public void setIngtSpell(String ingtSpell) {
		this.ingtSpell = ingtSpell;
	}

	public String getIngtRemark() {
		return ingtRemark;
	}

	public void setIngtRemark(String ingtRemark) {
		this.ingtRemark = ingtRemark;
	}

	public int getIngtState() {
		return ingtState;
	}

	public void setIngtState(int ingtState) {
		this.ingtState = ingtState;
	}

	public int getIngtDelflag() {
		return ingtDelflag;
	}

	public void setIngtDelflag(int ingtDelflag) {
		this.ingtDelflag = ingtDelflag;
	}

	public int getOptId() {
		return optId;
	}

	public void setOptId(int optId) {
		this.optId = optId;
	}

	public String getCurrDate() {
		return currDate;
	}

	public void setCurrDate(String currDate) {
		this.currDate = currDate;
	}

	
	

}
