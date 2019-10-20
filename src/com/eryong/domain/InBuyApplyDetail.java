package com.eryong.domain;

import java.math.BigDecimal;




public class InBuyApplyDetail {
	//采购申请明细id
    private Integer inbadId;
    //采购申请id
    private Integer inbaId;
    //物品id
    private Integer ingiId;
    //数量
    private Integer myCou;
    //单价
    private long myPrice;
    //总价
    private long myMoney;
    //含税单价
    private long taxPrice;
    //含税金额
    private long taxMoney;
    //开票金额
    private long invoicesMoney;
    //付款金额
    private long payMoney;
    //备注
    private String inbaRemark;
    //状态
    private Integer inbaState;
    //删除标记
    private Integer inbaDelflag;
   private String ingiName;
public Integer getInbadId() {
	return inbadId;
}
public void setInbadId(Integer inbadId) {
	this.inbadId = inbadId;
}
public Integer getInbaId() {
	return inbaId;
}
public void setInbaId(Integer inbaId) {
	this.inbaId = inbaId;
}
public Integer getIngiId() {
	return ingiId;
}
public void setIngiId(Integer ingiId) {
	this.ingiId = ingiId;
}
public Integer getMyCou() {
	return myCou;
}
public void setMyCou(Integer myCou) {
	this.myCou = myCou;
}
public long getMyPrice() {
	return myPrice;
}
public void setMyPrice(long myPrice) {
	this.myPrice = myPrice;
}
public long getMyMoney() {
	return myMoney;
}
public void setMyMoney(long myMoney) {
	this.myMoney = myMoney;
}
public long getTaxPrice() {
	return taxPrice;
}
public void setTaxPrice(long taxPrice) {
	this.taxPrice = taxPrice;
}
public long getTaxMoney() {
	return taxMoney;
}
public void setTaxMoney(long taxMoney) {
	this.taxMoney = taxMoney;
}
public long getInvoicesMoney() {
	return invoicesMoney;
}
public void setInvoicesMoney(long invoicesMoney) {
	this.invoicesMoney = invoicesMoney;
}
public long getPayMoney() {
	return payMoney;
}
public void setPayMoney(long payMoney) {
	this.payMoney = payMoney;
}
public String getInbaRemark() {
	return inbaRemark;
}
public void setInbaRemark(String inbaRemark) {
	this.inbaRemark = inbaRemark;
}
public Integer getInbaState() {
	return inbaState;
}
public void setInbaState(Integer inbaState) {
	this.inbaState = inbaState;
}
public Integer getInbaDelflag() {
	return inbaDelflag;
}
public void setInbaDelflag(Integer inbaDelflag) {
	this.inbaDelflag = inbaDelflag;
}
public String getIngiName() {
	return ingiName;
}
public void setIngiName(String ingiName) {
	this.ingiName = ingiName;
}
	
}