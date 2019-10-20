package com.eryong.domain;

import java.util.List;

/**@文件名: InBuyContract.java
 * @类功能说明: 
 * @作者: RenQian
 * @Email: 2509401056@qq.com
 * @日期: 2019年6月26日下午3:52:26
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: RenQian</li> 
 * 	 <li>日期: 2019年6月26日下午3:52:26</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class InBuyContract {
	private Integer inbcId;              //采购合同id
	private String inbcCode;   //采购合同编码
	private String inbcName;//采购合同名称
	private Integer insiId;//供货商id
	private Integer userId;//合同签订人id
	private String userName;//合同签订人姓名
	private String inbcDate;//合同签订时间
	private String inbcContent;//合同内容
	private Long   inbcTotalPrice; // 采购合同总价 
	private Long   inbcOfferPrice;//采购合同优惠金额
	private Long   inbcActualPrice;//采购合同实价
	private Long   inbcAdvanceMoney;//预付款金额
	private String   inbcCeliveryDate;//预计交货时间
	private String inbcDeliveryAddress;//交货地点
	private Integer    inbcState;//完成状态
	private Integer    inbcPayState;//已付款，0为已付款，1为未付款
	private Integer  inbcBillState;//已开票，0为已开票，1为未开票
	private String inbcRemark;//备注
	private Integer    state;//状态
	private Integer    inbcDelflag;//删除标记，0为未删除，1为已删除
	private Integer    optId;//操作人id
	private String currDate; //业务发生时间
	private List<InBuyContractDetail> inBuyContractDetail;
	public Integer getInbcId() {
		return inbcId;
	}
	public void setInbcId(Integer inbcId) {
		this.inbcId = inbcId;
	}
	public String getInbcCode() {
		return inbcCode;
	}
	public void setInbcCode(String inbcCode) {
		this.inbcCode = inbcCode;
	}
	public String getInbcName() {
		return inbcName;
	}
	public void setInbcName(String inbcName) {
		this.inbcName = inbcName;
	}
	public Integer getInsiId() {
		return insiId;
	}
	public void setInsiId(Integer insiId) {
		this.insiId = insiId;
	}
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
	public String getInbcDate() {
		return inbcDate;
	}
	public void setInbcDate(String inbcDate) {
		this.inbcDate = inbcDate;
	}
	public String getInbcContent() {
		return inbcContent;
	}
	public void setInbcContent(String inbcContent) {
		this.inbcContent = inbcContent;
	}
	public Long getInbcTotalPrice() {
		return inbcTotalPrice;
	}
	public void setInbcTotalPrice(Long inbcTotalPrice) {
		this.inbcTotalPrice = inbcTotalPrice;
	}
	public Long getInbcOfferPrice() {
		return inbcOfferPrice;
	}
	public void setInbcOfferPrice(Long inbcOfferPrice) {
		this.inbcOfferPrice = inbcOfferPrice;
	}
	public Long getInbcActualPrice() {
		return inbcActualPrice;
	}
	public void setInbcActualPrice(Long inbcActualPrice) {
		this.inbcActualPrice = inbcActualPrice;
	}
	public Long getInbcAdvanceMoney() {
		return inbcAdvanceMoney;
	}
	public void setInbcAdvanceMoney(Long inbcAdvanceMoney) {
		this.inbcAdvanceMoney = inbcAdvanceMoney;
	}
	public String getInbcCeliveryDate() {
		return inbcCeliveryDate;
	}
	public void setInbcCeliveryDate(String inbcCeliveryDate) {
		this.inbcCeliveryDate = inbcCeliveryDate;
	}
	public String getInbcDeliveryAddress() {
		return inbcDeliveryAddress;
	}
	public void setInbcDeliveryAddress(String inbcDeliveryAddress) {
		this.inbcDeliveryAddress = inbcDeliveryAddress;
	}
	public Integer getInbcState() {
		return inbcState;
	}
	public void setInbcState(Integer inbcState) {
		this.inbcState = inbcState;
	}
	public Integer getInbcPayState() {
		return inbcPayState;
	}
	public void setInbcPayState(Integer inbcPayState) {
		this.inbcPayState = inbcPayState;
	}
	public Integer getInbcBillState() {
		return inbcBillState;
	}
	public void setInbcBillState(Integer inbcBillState) {
		this.inbcBillState = inbcBillState;
	}
	public String getInbcRemark() {
		return inbcRemark;
	}
	public void setInbcRemark(String inbcRemark) {
		this.inbcRemark = inbcRemark;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Integer getInbcDelflag() {
		return inbcDelflag;
	}
	public void setInbcDelflag(Integer inbcDelflag) {
		this.inbcDelflag = inbcDelflag;
	}
	public Integer getOptId() {
		return optId;
	}
	public void setOptId(Integer optId) {
		this.optId = optId;
	}
	public String getCurrDate() {
		return currDate;
	}
	public void setCurrDate(String currDate) {
		this.currDate = currDate;
	}
	public List<InBuyContractDetail> getInBuyContractDetail() {
		return inBuyContractDetail;
	}
	public void setInBuyContractDetail(List<InBuyContractDetail> inBuyContractDetail) {
		this.inBuyContractDetail = inBuyContractDetail;
	}
	@Override
	public String toString() {
		return "InBuyContract [inbcId=" + inbcId + ", inbcCode=" + inbcCode
				+ ", inbcName=" + inbcName + ", insiId=" + insiId + ", userId="
				+ userId + ", userName=" + userName + ", inbcDate=" + inbcDate
				+ ", inbcContent=" + inbcContent + ", inbcTotalPrice="
				+ inbcTotalPrice + ", inbcOfferPrice=" + inbcOfferPrice
				+ ", inbcActualPrice=" + inbcActualPrice
				+ ", inbcAdvanceMoney=" + inbcAdvanceMoney
				+ ", inbcCeliveryDate=" + inbcCeliveryDate
				+ ", inbcDeliveryAddress=" + inbcDeliveryAddress
				+ ", inbcState=" + inbcState + ", inbcPayState=" + inbcPayState
				+ ", inbcBillState=" + inbcBillState + ", inbcRemark="
				+ inbcRemark + ", state=" + state + ", inbcDelflag="
				+ inbcDelflag + ", optId=" + optId + ", currDate=" + currDate
				+ ", inBuyContractDetail=" + inBuyContractDetail + "]";
	}
	
	
}

