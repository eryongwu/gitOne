package com.eryong.domain;

public class InGoodsProducer {
    private Integer ingpId;//物品生产商id

    private String ingpCode;//物品生产商编码

    private String ingpName;//物品生产商名称

    private String ingpSpell;//简拼

    private String ingpLinkMan;//物品生产商联系人

    private String ingpPhone;//物品生产商联系电话

    private String ingpAddress;//物品生产商地址

    private String ingpRemark;//备注

    private Integer ingpDelflag;//删除标记，0为未删除，1为已删除

    private Integer ingpState;//状态

    private Integer optid;//操作人id

    private String  currDate;//业务发生时间
    
    private String optName;//操作人姓名

	public Integer getIngpId() {
		return ingpId;
	}

	public void setIngpId(Integer ingpId) {
		this.ingpId = ingpId;
	}

	public String getIngpCode() {
		return ingpCode;
	}

	public void setIngpCode(String ingpCode) {
		this.ingpCode = ingpCode;
	}

	public String getIngpName() {
		return ingpName;
	}

	public void setIngpName(String ingpName) {
		this.ingpName = ingpName;
	}

	public String getIngpSpell() {
		return ingpSpell;
	}

	public void setIngpSpell(String ingpSpell) {
		this.ingpSpell = ingpSpell;
	}

	public String getIngpLinkMan() {
		return ingpLinkMan;
	}

	public void setIngpLinkMan(String ingpLinkMan) {
		this.ingpLinkMan = ingpLinkMan;
	}

	public String getIngpPhone() {
		return ingpPhone;
	}

	public void setIngpPhone(String ingpPhone) {
		this.ingpPhone = ingpPhone;
	}

	public String getIngpAddress() {
		return ingpAddress;
	}

	public void setIngpAddress(String ingpAddress) {
		this.ingpAddress = ingpAddress;
	}

	public String getIngpRemark() {
		return ingpRemark;
	}

	public void setIngpRemark(String ingpRemark) {
		this.ingpRemark = ingpRemark;
	}

	public Integer getIngpDelflag() {
		return ingpDelflag;
	}

	public void setIngpDelflag(Integer ingpDelflag) {
		this.ingpDelflag = ingpDelflag;
	}

	public Integer getIngpState() {
		return ingpState;
	}

	public void setIngpState(Integer ingpState) {
		this.ingpState = ingpState;
	}

	public Integer getOptid() {
		return optid;
	}

	public void setOptid(Integer optid) {
		this.optid = optid;
	}

	public String getCurrDate() {
		return currDate;
	}

	public void setCurrDate(String currDate) {
		this.currDate = currDate;
	}

	public String getOptName() {
		return optName;
	}

	public void setOptName(String optName) {
		this.optName = optName;
	}

	

	
}