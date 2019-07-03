package com.eryong.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.eryong.util.DateUtil;
import com.eryong.util.RandomNumber;
import com.eryong.dao.InBuyApplyDao;
import com.eryong.dao.InBuyApplyDetailDao;
import com.eryong.domain.InBuyApply;
import com.eryong.domain.InBuyApplyDetail;
import com.eryong.domain.UserInfo;
import com.eryong.service.InBuyApplService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**@文件名: InBuyApplServiceImpl.java
 * @类功能说明: 
 * @作者: 张龙飞
 * @Email: 1063614536@qq.com
 * @日期: 2019年6月26日下午2:20:34
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: 张龙飞</li> 
 * 	 <li>日期: 2019年6月26日下午2:20:34</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class InBuyApplServiceImpl implements InBuyApplService {
@Autowired
private InBuyApplyDao inBuyApplyDao;
@Autowired
private InBuyApplyDetailDao inBuyApplyDetailDao;
/**
 * 查找所有申请
 */
	@Override
	public JSONArray findAllInBuyApply(Map<String, Object> map) {
		List<InBuyApply> inaList=inBuyApplyDao.findAllInBuyApply(map);
		JSONArray jsonArray=new JSONArray();
		for(int i=0;i<inaList.size();i++){
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("inbaId", inaList.get(i).getInbaId());
			jsonObject.put("inbaCode", inaList.get(i).getInbaCode());
			jsonObject.put("inbaName", inaList.get(i).getInbaName());
			jsonObject.put("busiId", inaList.get(i).getBusiId());
			jsonObject.put("busiName", inaList.get(i).getBusiName());
			jsonObject.put("busiDeptId", inaList.get(i).getBusiDeptId());
			jsonObject.put("inbtId", inaList.get(i).getInbtId());
			jsonObject.put("inbaReason", inaList.get(i).getInbaReason());
			jsonObject.put("inbaDate", inaList.get(i).getInbaDate());
			jsonObject.put("inbaRemark", inaList.get(i).getInbaRemark());
			jsonObject.put("inbaState", inaList.get(i).getInbaState());
			jsonObject.put("approvalview", inaList.get(i).getApprovalview());
			jsonObject.put("state", inaList.get(i).getState());
			jsonObject.put("inbaDelflag", inaList.get(i).getInbaDelflag());
			jsonObject.put("optId", inaList.get(i).getOptId());
			jsonObject.put("inbaCurrdate", inaList.get(i).getInbaCurrdate());
			List<InBuyApplyDetail> ibadList=inaList.get(i).getInBuyApplyDetail();
			JSONArray jsonArray2=new JSONArray();
			for(int j=0;j<ibadList.size();j++){
				JSONObject jsonObject2=new JSONObject();
				jsonObject2.put("inbadId", ibadList.get(j).getInbadId());
				jsonObject2.put("inbaId", ibadList.get(j).getInbaId());
				jsonObject2.put("ingiId", ibadList.get(j).getIngiId());
				jsonObject2.put("myCou", ibadList.get(j).getMyCou());
				jsonObject2.put("myPrice", ibadList.get(j).getMyPrice());
				jsonObject2.put("myMoney", ibadList.get(j).getMyMoney());
				jsonObject2.put("taxPrice", ibadList.get(j).getTaxPrice());
				jsonObject2.put("taxMoney", ibadList.get(j).getTaxMoney());
				jsonObject2.put("invoicesMoney", ibadList.get(j).getInvoicesMoney());
				jsonObject2.put("payMoney", ibadList.get(j).getPayMoney());
				jsonObject2.put("inbaRemark", ibadList.get(j).getInbaRemark());
				jsonObject2.put("inbaState", ibadList.get(j).getInbaState());
				jsonObject2.put("inbaDelflag", ibadList.get(j).getInbaDelflag());
				jsonObject2.put("ingiName", ibadList.get(j).getIngiName());
				jsonArray2.add(jsonObject2);
			}
			jsonObject.put("inBuyApplyDetail", jsonArray2);
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
/**
 * 查找所有申请总数
 */
	@Override
	public int findinBuyApplyCount(Map<String, Object> map) {
		
		return inBuyApplyDao.findInBuyApplyCount(map);
	}
/**
 * 添加申请
 */
	@Override
	public int addInBuyApply(InBuyApply inBuyApply, UserInfo sessionUserInfo) {
		inBuyApply.setInbaCurrdate(DateUtil.formatDate(new Date(), "yyyy-MM-dd hh:mm:ss"));
		inBuyApply.setInbaDelflag(0);
		inBuyApply.setInbaState(0);
		inBuyApply.setOptId(sessionUserInfo.getUserId());
		inBuyApply.setInbaCode(RandomNumber.randomnumbers());
		inBuyApply.setBusiId(sessionUserInfo.getUserId());
		inBuyApply.setBusiName(sessionUserInfo.getUserName());
		inBuyApply.setState(0);
		int result=inBuyApplyDao.addInBuyApply(inBuyApply);
		int maxibaId=inBuyApplyDao.findInBuyApplyMaxId();
		List<InBuyApplyDetail> ibaList=inBuyApply.getInBuyApplyDetail();
		for(int i=0;i<ibaList.size();i++){
			InBuyApplyDetail inBuyApplyDetail=ibaList.get(i);
			inBuyApplyDetail.setInbaDelflag(0);
			inBuyApplyDetail.setInbaId(maxibaId);
			inBuyApplyDetail.setInbaState(1);
			inBuyApplyDetail.setPayMoney(inBuyApplyDetail.getMyCou()*inBuyApplyDetail.getMyPrice());
			inBuyApplyDetailDao.addWorkBookDetail(inBuyApplyDetail);
		}
		return result;
	}
/**
 * 修改申请
 */
	@Override
	public int updateInBuyApply(InBuyApply inBuyApply, UserInfo sessionUserInfo) {
		int result=inBuyApplyDao.updateInBuyApply(inBuyApply);
		List<InBuyApplyDetail> oldData=inBuyApplyDetailDao.findAllinBuyApplyDetailByInbaId(inBuyApply.getInbaId());
		List<InBuyApplyDetail> newData=inBuyApply.getInBuyApplyDetail();
		int inbaId=inBuyApply.getInbaId();
		if(oldData!=null){
			for(InBuyApplyDetail oldObject:oldData){
				boolean isDelete=true;
				if(newData!=null){
					for(InBuyApplyDetail newObject:newData){
						if(newObject.getInbadId()!=null&&newObject.getInbadId().equals(oldObject.getInbadId())){
							isDelete=false;
						}
					}
				}
				if(isDelete){
					inBuyApplyDetailDao.deleteInBuyApplyDetail(oldObject.getInbadId());
				}
			}
		}
		
		if(newData!=null){
			for(InBuyApplyDetail newObject:newData){
				if(newObject.getInbadId()==null){
					newObject.setInbaDelflag(0);
					newObject.setInbaState(0);;
					newObject.setInbaId(inbaId);
					inBuyApplyDetailDao.addWorkBookDetail(newObject);
				}else{
					inBuyApplyDetailDao.updateWorkBookDetail(newObject);
				}
			}
		}
		return result;
	}
/**
 * 删除申请
 */
	@Override
	public int deleteInBuyApply(Integer inbaId) {
		inBuyApplyDetailDao.deleteInBuyApplyDetailByInbaId(inbaId);
		int result=inBuyApplyDao.deleteInBuyApply(inbaId);
		return result;
	}
/**
 * 提交申请
 */
	@Override
	public int SubmitInBuyApply(Integer inbaId) {
		int result=inBuyApplyDao.SubmitInBuyApply(inbaId);
		return result;
	}
/**
 * 申请审核
 */
	@Override
	public JSONArray findInBuyApply(Map<String, Object> map) {
		List<InBuyApply> inaList=inBuyApplyDao.findInBuyApply(map);
		JSONArray jsonArray=new JSONArray();
		for(int i=0;i<inaList.size();i++){
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("inbaId", inaList.get(i).getInbaId());
			jsonObject.put("inbaCode", inaList.get(i).getInbaCode());
			jsonObject.put("inbaName", inaList.get(i).getInbaName());
			jsonObject.put("busiId", inaList.get(i).getBusiId());
			jsonObject.put("busiName", inaList.get(i).getBusiName());
			jsonObject.put("busiDeptId", inaList.get(i).getBusiDeptId());
			jsonObject.put("inbtId", inaList.get(i).getInbtId());
			jsonObject.put("inbaReason", inaList.get(i).getInbaReason());
			jsonObject.put("inbaDate", inaList.get(i).getInbaDate());
			jsonObject.put("inbaRemark", inaList.get(i).getInbaRemark());
			jsonObject.put("inbaState", inaList.get(i).getInbaState());
			jsonObject.put("approvalview", inaList.get(i).getApprovalview());
			jsonObject.put("state", inaList.get(i).getState());
			jsonObject.put("inbaDelflag", inaList.get(i).getInbaDelflag());
			jsonObject.put("optId", inaList.get(i).getOptId());
			jsonObject.put("inbaCurrdate", inaList.get(i).getInbaCurrdate());
			List<InBuyApplyDetail> ibadList=inaList.get(i).getInBuyApplyDetail();
			JSONArray jsonArray2=new JSONArray();
			for(int j=0;j<ibadList.size();j++){
				JSONObject jsonObject2=new JSONObject();
				jsonObject2.put("inbadId", ibadList.get(j).getInbadId());
				jsonObject2.put("inbaId", ibadList.get(j).getInbaId());
				jsonObject2.put("ingiId", ibadList.get(j).getIngiId());
				jsonObject2.put("myCou", ibadList.get(j).getMyCou());
				jsonObject2.put("myPrice", ibadList.get(j).getMyPrice());
				jsonObject2.put("myMoney", ibadList.get(j).getMyMoney());
				jsonObject2.put("taxPrice", ibadList.get(j).getTaxPrice());
				jsonObject2.put("taxMoney", ibadList.get(j).getTaxMoney());
				jsonObject2.put("invoicesMoney", ibadList.get(j).getInvoicesMoney());
				jsonObject2.put("payMoney", ibadList.get(j).getPayMoney());
				jsonObject2.put("inbaRemark", ibadList.get(j).getInbaRemark());
				jsonObject2.put("inbaState", ibadList.get(j).getInbaState());
				jsonObject2.put("inbaDelflag", ibadList.get(j).getInbaDelflag());
				jsonObject2.put("ingiName", ibadList.get(j).getIngiName());
				jsonArray2.add(jsonObject2);
			}
			jsonObject.put("inBuyApplyDetail", jsonArray2);
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
/**
 * 申请统计
 */
	@Override
	public JSONArray findInBuyApplys(Map<String, Object> map) {
		List<InBuyApply> inaList=inBuyApplyDao.findInBuyApply(map);
		JSONArray jsonArray=new JSONArray();
		for(int i=0;i<inaList.size();i++){
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("inbaId", inaList.get(i).getInbaId());
			jsonObject.put("inbaCode", inaList.get(i).getInbaCode());
			jsonObject.put("inbaName", inaList.get(i).getInbaName());
			jsonObject.put("busiId", inaList.get(i).getBusiId());
			jsonObject.put("busiName", inaList.get(i).getBusiName());
			jsonObject.put("busiDeptId", inaList.get(i).getBusiDeptId());
			jsonObject.put("inbtId", inaList.get(i).getInbtId());
			jsonObject.put("inbaReason", inaList.get(i).getInbaReason());
			jsonObject.put("inbaDate", inaList.get(i).getInbaDate());
			jsonObject.put("inbaRemark", inaList.get(i).getInbaRemark());
			jsonObject.put("inbaState", inaList.get(i).getInbaState());
			jsonObject.put("approvalview", inaList.get(i).getApprovalview());
			jsonObject.put("state", inaList.get(i).getState());
			jsonObject.put("inbaDelflag", inaList.get(i).getInbaDelflag());
			jsonObject.put("optId", inaList.get(i).getOptId());
			jsonObject.put("inbaCurrdate", inaList.get(i).getInbaCurrdate());
			List<InBuyApplyDetail> ibadList=inaList.get(i).getInBuyApplyDetail();
			JSONArray jsonArray2=new JSONArray();
			for(int j=0;j<ibadList.size();j++){
				JSONObject jsonObject2=new JSONObject();
				jsonObject2.put("inbadId", ibadList.get(j).getInbadId());
				jsonObject2.put("inbaId", ibadList.get(j).getInbaId());
				jsonObject2.put("ingiId", ibadList.get(j).getIngiId());
				jsonObject2.put("myCou", ibadList.get(j).getMyCou());
				jsonObject2.put("myPrice", ibadList.get(j).getMyPrice());
				jsonObject2.put("myMoney", ibadList.get(j).getMyMoney());
				jsonObject2.put("taxPrice", ibadList.get(j).getTaxPrice());
				jsonObject2.put("taxMoney", ibadList.get(j).getTaxMoney());
				jsonObject2.put("invoicesMoney", ibadList.get(j).getInvoicesMoney());
				jsonObject2.put("payMoney", ibadList.get(j).getPayMoney());
				jsonObject2.put("inbaRemark", ibadList.get(j).getInbaRemark());
				jsonObject2.put("inbaState", ibadList.get(j).getInbaState());
				jsonObject2.put("inbaDelflag", ibadList.get(j).getInbaDelflag());
				jsonObject2.put("ingiName", ibadList.get(j).getIngiName());
				jsonArray2.add(jsonObject2);
			}
			jsonObject.put("inBuyApplyDetail", jsonArray2);
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
	/**
	 * 查找统计总数
	 */
	@Override
	public int findInBuyApplyCounts(Map<String, Object> map) {
		
		return inBuyApplyDao.findInBuyApplyCounts(map);
	}
/**
 * 审核通过
 */
	@Override
	public int passInBuyApply(Integer inbaId) {
		inBuyApplyDetailDao.passInBuyApplyDetail(inbaId);
		int result=inBuyApplyDao.passInBuyApply(inbaId);
		return result;
	}
/**
 * 驳回申请
 */
	@Override
	public int rejectInBuyApply(InBuyApply inBuyApply) {
		
		inBuyApplyDetailDao.rejectInBuyApplyDetailByInbaId(inBuyApply.getInbaId());
		int result=inBuyApplyDao.rejectInBuyApply(inBuyApply);
		return result;
	}
/**
 * 申请名唯一验证
 */
	@Override
	public int findinbaNameIsExist(String inbaName) {
		
		return inBuyApplyDao.findinbaNameIsExist(inbaName);
	}

}
