/**@文件名: inIBuyOrder.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月26日上午11:14:44
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月26日上午11:14:44</li> 
 *	 <li>内容: </li>
 * </pre>
 */
package com.eryong.domain;

import java.util.List;

/**@文件名: inIBuyOrder.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月26日上午11:14:44
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月26日上午11:14:44</li> 
 *	 <li>内容: </li>
 * </pre>
 */
/**
 * @author Lenovo
 *
 */
public class InIBuyOrder {
	
	private Integer inboId; //采购订单id
	private String inboCode; //订单编码
	private String inboName; //订单名
	private Integer insiId; //供货商id
	private String insiName; //供应商名称
	private Integer userId; //下单人id
	private String userName; //下单人姓名	
	private String inboDate; //下单时间
	private Double inboTotalPrice; //总价
	private Double inboOfferprice; //优惠价
	private Double inboActualPrice; //实价
	private String inboDeliveryDate; //预计交货时间	
	private String inboDeliveryAddress; //交货地点
	private Integer inboState; //完成状态
	private Integer inboPayState; //已付款，0表示已付款，1表示未付款
	private Integer inboBillState; //已开票，0表示已开票，1表示未开票
	private String inboRemark; //备注
	private Integer state; //状态
	private Integer inboDelflag; //删除标记，0为未删除，1为已删除
	private Integer optId; //操作人id
	private String optName; //操作人姓名
	private String currDate; //业务发生时间
	
	private List<InBuyOrderDetail> inBuyOrderDetail;

	public Integer getInboId() {
		return inboId;
	}

	public void setInboId(Integer inboId) {
		this.inboId = inboId;
	}

	public String getInboCode() {
		return inboCode;
	}

	public void setInboCode(String inboCode) {
		this.inboCode = inboCode;
	}

	public String getInboName() {
		return inboName;
	}

	public void setInboName(String inboName) {
		this.inboName = inboName;
	}

	public Integer getInsiId() {
		return insiId;
	}

	public void setInsiId(Integer insiId) {
		this.insiId = insiId;
	}

	public String getInsiName() {
		return insiName;
	}

	public void setInsiName(String insiName) {
		this.insiName = insiName;
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

	public String getInboDate() {
		return inboDate;
	}

	public void setInboDate(String inboDate) {
		this.inboDate = inboDate;
	}

	public Double getInboTotalPrice() {
		return inboTotalPrice;
	}

	public void setInboTotalPrice(Double inboTotalPrice) {
		this.inboTotalPrice = inboTotalPrice;
	}

	public Double getInboOfferprice() {
		return inboOfferprice;
	}

	public void setInboOfferprice(Double inboOfferprice) {
		this.inboOfferprice = inboOfferprice;
	}

	public Double getInboActualPrice() {
		return inboActualPrice;
	}

	public void setInboActualPrice(Double inboActualPrice) {
		this.inboActualPrice = inboActualPrice;
	}

	public String getInboDeliveryDate() {
		return inboDeliveryDate;
	}

	public void setInboDeliveryDate(String inboDeliveryDate) {
		this.inboDeliveryDate = inboDeliveryDate;
	}

	public String getInboDeliveryAddress() {
		return inboDeliveryAddress;
	}

	public void setInboDeliveryAddress(String inboDeliveryAddress) {
		this.inboDeliveryAddress = inboDeliveryAddress;
	}

	public Integer getInboState() {
		return inboState;
	}

	public void setInboState(Integer inboState) {
		this.inboState = inboState;
	}

	public Integer getInboPayState() {
		return inboPayState;
	}

	public void setInboPayState(Integer inboPayState) {
		this.inboPayState = inboPayState;
	}

	public Integer getInboBillState() {
		return inboBillState;
	}

	public void setInboBillState(Integer inboBillState) {
		this.inboBillState = inboBillState;
	}

	public String getInboRemark() {
		return inboRemark;
	}

	public void setInboRemark(String inboRemark) {
		this.inboRemark = inboRemark;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getInboDelflag() {
		return inboDelflag;
	}

	public void setInboDelflag(Integer inboDelflag) {
		this.inboDelflag = inboDelflag;
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

	public String getCurrDate() {
		return currDate;
	}

	public void setCurrDate(String currDate) {
		this.currDate = currDate;
	}

	public List<InBuyOrderDetail> getInBuyOrderDetail() {
		return inBuyOrderDetail;
	}

	public void setInBuyOrderDetail(List<InBuyOrderDetail> inBuyOrderDetail) {
		this.inBuyOrderDetail = inBuyOrderDetail;
	}
	
	
	
	
	
}

