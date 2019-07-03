/**@文件名: InBuyOrderDetail.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月26日上午11:15:24
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月26日上午11:15:24</li> 
 *	 <li>内容: </li>
 * </pre>
 */
package com.eryong.domain;
/**@文件名: InBuyOrderDetail.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月26日上午11:15:24
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月26日上午11:15:24</li> 
 *	 <li>内容: </li>
 * </pre>
 */
/**
 * @author Lenovo
 *
 */
public class InBuyOrderDetail {
	
	private Integer inbodId; //订单明细id
	private int inbaId; //采购申请id
	private String inbaName;//采购申请名称
	private Integer inbadId; //采购申请明细id
	private Integer inbcId; //合同id
	private String inbcName; //合同名称
	private Integer inbcdId; //合同明细id
	private Integer inboId; //订单id
	private String inboName; //订单名称
	private Integer insiId; //供应商id
	private String insiName; //供应商名称
	private Integer ingiId; //商品id
	private String ingiName;//商品名称
	private double myPrice; //单价
	private int myCou; //数量
	private double myMoney; //总价
	private double taxPrice; //含税单价
	private double taxMoney; //含税金额
	private double invoicesMoney; //开票金额
	private double payMoney; //付款金额
	private String inbodRemark; //备注
	private int inbodState; //状态
	private int inmbodDelflag; //删除标记，0为未删除，1为已删除
	public Integer getInbodId() {
		return inbodId;
	}
	public void setInbodId(Integer inbodId) {
		this.inbodId = inbodId;
	}
	public int getInbaId() {
		return inbaId;
	}
	public void setInbaId(int inbaId) {
		this.inbaId = inbaId;
	}
	public String getInbaName() {
		return inbaName;
	}
	public void setInbaName(String inbaName) {
		this.inbaName = inbaName;
	}
	public Integer getInbadId() {
		return inbadId;
	}
	public void setInbadId(Integer inbadId) {
		this.inbadId = inbadId;
	}
	public Integer getInbcId() {
		return inbcId;
	}
	public void setInbcId(Integer inbcId) {
		this.inbcId = inbcId;
	}
	public String getInbcName() {
		return inbcName;
	}
	public void setInbcName(String inbcName) {
		this.inbcName = inbcName;
	}
	public Integer getInbcdId() {
		return inbcdId;
	}
	public void setInbcdId(Integer inbcdId) {
		this.inbcdId = inbcdId;
	}
	public Integer getInboId() {
		return inboId;
	}
	public void setInboId(Integer inboId) {
		this.inboId = inboId;
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
	public Integer getIngiId() {
		return ingiId;
	}
	public void setIngiId(Integer ingiId) {
		this.ingiId = ingiId;
	}
	public String getIngiName() {
		return ingiName;
	}
	public void setIngiName(String ingiName) {
		this.ingiName = ingiName;
	}
	public double getMyPrice() {
		return myPrice;
	}
	public void setMyPrice(double myPrice) {
		this.myPrice = myPrice;
	}
	public int getMyCou() {
		return myCou;
	}
	public void setMyCou(int myCou) {
		this.myCou = myCou;
	}
	public double getMyMoney() {
		return myMoney;
	}
	public void setMyMoney(double myMoney) {
		this.myMoney = myMoney;
	}
	public double getTaxPrice() {
		return taxPrice;
	}
	public void setTaxPrice(double taxPrice) {
		this.taxPrice = taxPrice;
	}
	public double getTaxMoney() {
		return taxMoney;
	}
	public void setTaxMoney(double taxMoney) {
		this.taxMoney = taxMoney;
	}
	public double getInvoicesMoney() {
		return invoicesMoney;
	}
	public void setInvoicesMoney(double invoicesMoney) {
		this.invoicesMoney = invoicesMoney;
	}
	public double getPayMoney() {
		return payMoney;
	}
	public void setPayMoney(double payMoney) {
		this.payMoney = payMoney;
	}
	
	public String getInbodRemark() {
		return inbodRemark;
	}
	public void setInbodRemark(String inbodRemark) {
		this.inbodRemark = inbodRemark;
	}
	public int getInbodState() {
		return inbodState;
	}
	public void setInbodState(int inbodState) {
		this.inbodState = inbodState;
	}
	public int getInmbodDelflag() {
		return inmbodDelflag;
	}
	public void setInmbodDelflag(int inmbodDelflag) {
		this.inmbodDelflag = inmbodDelflag;
	}

	
}
