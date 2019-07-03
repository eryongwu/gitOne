package com.eryong.service;

import java.util.Map;

import com.eryong.domain.InSupplierInfo;
import com.eryong.domain.UserInfo;

import net.sf.json.JSONArray;

/**
 * @�ļ���: InSupplierInfoService.java
 * @�๦��˵��:
 * @����: QISHAOFAN
 * @Email: 1743152247@qq.com
 * @����: 2019��6��26������11:41:58
 * @�޸�˵��:<br> <pre>
 * 	 <li>����: QISHAOFAN</li> 
 * 	 <li>����: 2019��6��26������11:41:58</li> 
 *  <li>����: </li>
 * </pre>
 */
public interface InSupplierInfoService {

	public JSONArray findAllInSuppliers(Map<String, Object> map);

	public int findAllInSuppliersCount(Map<String, Object> map);

	 public   int  addInSupplierInfo (InSupplierInfo inSupplierInfo,UserInfo  sessionInSupplierInfo );
	 
	 public   int   updateInSupplierInfo(InSupplierInfo inSupplierInfo);
	 
	 public  int    deleteInSupplierInfo(String  str);
	 
	 public  JSONArray    getComboBox();
	 
}
