package com.eryong.domain;

import java.util.Date;
import java.util.List;

public class InBuyApply {
	//采购申请id
    private Integer inbaId;
    //采购申请编码
    private String inbaCode;
    //采购申请名称
    private String inbaName;
    //采购申请人id
    private Integer busiId;
    //采购申请人姓名
    private String busiName;
    //采购申请部门id
    private Integer busiDeptId;
    //采购类型id
    private Integer inbtId;
    //采购申请事由
    private String inbaReason;
    //采购申请时间
    private Date inbaDate;
    //备注
    private String inbaRemark;
    //完成状态
    private Integer inbaState;
	//审批意见
    private String approvalview;
	//状态
    private Integer state;
    //删除标记，0表示未删除，1表示已删除
    private Integer inbaDelflag;
    //操作人id
    private Integer optId;
    //业务发生时间
    private String inbaCurrdate;
    private List<InBuyApplyDetail> InBuyApplyDetail;
	public Integer getInbaId() {
		return inbaId;
	}
	public void setInbaId(Integer inbaId) {
		this.inbaId = inbaId;
	}
	public String getInbaCode() {
		return inbaCode;
	}
	public void setInbaCode(String inbaCode) {
		this.inbaCode = inbaCode;
	}
	public String getInbaName() {
		return inbaName;
	}
	public void setInbaName(String inbaName) {
		this.inbaName = inbaName;
	}
	public Integer getBusiId() {
		return busiId;
	}
	public void setBusiId(Integer busiId) {
		this.busiId = busiId;
	}
	public String getBusiName() {
		return busiName;
	}
	public void setBusiName(String busiName) {
		this.busiName = busiName;
	}
	public Integer getBusiDeptId() {
		return busiDeptId;
	}
	public void setBusiDeptId(Integer busiDeptId) {
		this.busiDeptId = busiDeptId;
	}
	public Integer getInbtId() {
		return inbtId;
	}
	public void setInbtId(Integer inbtId) {
		this.inbtId = inbtId;
	}
	public String getInbaReason() {
		return inbaReason;
	}
	public void setInbaReason(String inbaReason) {
		this.inbaReason = inbaReason;
	}
	public Date getInbaDate() {
		return inbaDate;
	}
	public void setInbaDate(Date inbaDate) {
		this.inbaDate = inbaDate;
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
	public String getApprovalview() {
		return approvalview;
	}
	public void setApprovalview(String approvalview) {
		this.approvalview = approvalview;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Integer getInbaDelflag() {
		return inbaDelflag;
	}
	public void setInbaDelflag(Integer inbaDelflag) {
		this.inbaDelflag = inbaDelflag;
	}
	public Integer getOptId() {
		return optId;
	}
	public void setOptId(Integer optId) {
		this.optId = optId;
	}
	public String getInbaCurrdate() {
		return inbaCurrdate;
	}
	public void setInbaCurrdate(String inbaCurrdate) {
		this.inbaCurrdate = inbaCurrdate;
	}
	public List<InBuyApplyDetail> getInBuyApplyDetail() {
		return InBuyApplyDetail;
	}
	public void setInBuyApplyDetail(List<InBuyApplyDetail> inBuyApplyDetail) {
		InBuyApplyDetail = inBuyApplyDetail;
	}
	
}