package com.eryong.domain;

/**
 * @文件名: InSupplierInfo.java
 * @类功能说明: 供应商管理
 * @作者: QISHAOFAN
 * @Email: 1743152247@qq.com
 * @日期: 2019年6月26日上午10:11:56
 * @修改说明:<br> <pre>
 * 	 <li>作者: QISHAOFAN</li> 
 * 	 <li>日期: 2019年6月26日上午10:11:56</li> 
 *  <li>内容: </li>
 * </pre>
 */
public class InSupplierInfo {

	private Integer insiId;// 供货商id
	private String insiCode;// 供货商编码
	private String insiName;// 供货商名称
	private String insiAddress;// 供货商地址
	private String insiPhone;// 供货商联系电话
	private String insiLicense;// 供货商营业执照号
	private String insiPermitLicense;// 供货商经营许可证号
	private String insiLegalMan;// 供货商法人
	private String insiTaxNum;// 供货商税号
	private String insiBank;// 供货商开户行
	private String insiBankacCount;// 供货商开户行账号
	private String insiRemark;// 备注
	private int insiState;// 状态
	private int insiDelflag;// 删除状态，0为未删除，1为已删除
	private int optId;// 操作人id
	private String currDate;// 业务发生时间

	public Integer getInsiId() {
		return insiId;
	}

	public void setInsiId(Integer insiId) {
		this.insiId = insiId;
	}

	public String getInsiCode() {
		return insiCode;
	}

	public void setInsiCode(String insiCode) {
		this.insiCode = insiCode;
	}

	public String getInsiName() {
		return insiName;
	}

	public void setInsiName(String insiName) {
		this.insiName = insiName;
	}

	public String getInsiAddress() {
		return insiAddress;
	}

	public void setInsiAddress(String insiAddress) {
		this.insiAddress = insiAddress;
	}

	public String getInsiPhone() {
		return insiPhone;
	}

	public void setInsiPhone(String insiPhone) {
		this.insiPhone = insiPhone;
	}

	public String getInsiLicense() {
		return insiLicense;
	}

	public void setInsiLicense(String insiLicense) {
		this.insiLicense = insiLicense;
	}

	public String getInsiPermitLicense() {
		return insiPermitLicense;
	}

	public void setInsiPermitLicense(String insiPermitLicense) {
		this.insiPermitLicense = insiPermitLicense;
	}

	public String getInsiLegalMan() {
		return insiLegalMan;
	}

	public void setInsiLegalMan(String insiLegalMan) {
		this.insiLegalMan = insiLegalMan;
	}

	public String getInsiTaxNum() {
		return insiTaxNum;
	}

	public void setInsiTaxNum(String insiTaxNum) {
		this.insiTaxNum = insiTaxNum;
	}

	public String getInsiBank() {
		return insiBank;
	}

	public void setInsiBank(String insiBank) {
		this.insiBank = insiBank;
	}

	public String getInsiBankacCount() {
		return insiBankacCount;
	}

	public void setInsiBankacCount(String insiBankacCount) {
		this.insiBankacCount = insiBankacCount;
	}

	public String getInsiRemark() {
		return insiRemark;
	}

	public void setInsiRemark(String insiRemark) {
		this.insiRemark = insiRemark;
	}

	public int getInsiState() {
		return insiState;
	}

	public void setInsiState(int insiState) {
		this.insiState = insiState;
	}

	public int getInsiDelflag() {
		return insiDelflag;
	}

	public void setInsiDelflag(int insiDelflag) {
		this.insiDelflag = insiDelflag;
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
