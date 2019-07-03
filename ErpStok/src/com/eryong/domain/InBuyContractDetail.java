package com.eryong.domain;
/**@文件名: InBuyContractDetail.java
 * @类功能说明: 
 * @作者: RenQian
 * @Email: 2509401056@qq.com
 * @日期: 2019年6月26日下午4:07:31
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: RenQian</li> 
 * 	 <li>日期: 2019年6月26日下午4:07:31</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class InBuyContractDetail {

	private Integer inbcdId;//合同明细id
	private Integer inbaId;//采购申请id
	private String inbaName;//采购申请名称
	private Integer inbadId;//采购申请明细id
	private Integer inbcId;//采购合同id
	private String inbcName;//采购合同名称
	private Integer insiId;//供货商id
	private String insiName;//供货商名称
	public String getInbaName() {
		return inbaName;
	}
	public void setInbaName(String inbaName) {
		this.inbaName = inbaName;
	}
	public String getInbcName() {
		return inbcName;
	}
	public void setInbcName(String inbcName) {
		this.inbcName = inbcName;
	}
	public String getInsiName() {
		return insiName;
	}
	public void setInsiName(String insiName) {
		this.insiName = insiName;
	}
	private Integer ingiId;//物品id
	private String ingiName;//物品名
	private Long myPrice;//单价
	private Integer  myCou;//数量
	private Long myMoney;//总价	
	private Long taxPrice;//含税单价
	private Long taxMoney;//含税金额
	private Long invoicesMoney;//开票金额
	private Long payMoney;//付款金额
	private String inbcRemark;//备注
	private Integer inbcState;//状态
	private Integer inbcDelflag;//删除标记，0为未删除，1为已删除
	public Integer getInbcdId() {
		return inbcdId;
	}
	public void setInbcdId(Integer inbcdId) {
		this.inbcdId = inbcdId;
	}
	public Integer getInbaId() {
		return inbaId;
	}
	public void setInbaId(Integer inbaId) {
		this.inbaId = inbaId;
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
	public Integer getInsiId() {
		return insiId;
	}
	public void setInsiId(Integer insiId) {
		this.insiId = insiId;
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
	public Long getMyPrice() {
		return myPrice;
	}
	public void setMyPrice(Long myPrice) {
		this.myPrice = myPrice;
	}
	public Integer getMyCou() {
		return myCou;
	}
	public void setMyCou(Integer myCou) {
		this.myCou = myCou;
	}
	public Long getMyMoney() {
		return myMoney;
	}
	public void setMyMoney(Long myMoney) {
		this.myMoney = myMoney;
	}
	public Long getTaxPrice() {
		return taxPrice;
	}
	public void setTaxPrice(Long taxPrice) {
		this.taxPrice = taxPrice;
	}
	public Long getTaxMoney() {
		return taxMoney;
	}
	public void setTaxMoney(Long taxMoney) {
		this.taxMoney = taxMoney;
	}
	public Long getInvoicesMoney() {
		return invoicesMoney;
	}
	public void setInvoicesMoney(Long invoicesMoney) {
		this.invoicesMoney = invoicesMoney;
	}
	public Long getPayMoney() {
		return payMoney;
	}
	public void setPayMoney(Long payMoney) {
		this.payMoney = payMoney;
	}
	public String getInbcRemark() {
		return inbcRemark;
	}
	public void setInbcRemark(String inbcRemark) {
		this.inbcRemark = inbcRemark;
	}
	public Integer getInbcState() {
		return inbcState;
	}
	public void setInbcState(Integer inbcState) {
		this.inbcState = inbcState;
	}
	public Integer getInbcDelflag() {
		return inbcDelflag;
	}
	public void setInbcDelflag(Integer inbcDelflag) {
		this.inbcDelflag = inbcDelflag;
	}
	
	
}

