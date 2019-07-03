package com.eryong.dao;

import java.util.List;
import java.util.Map;

import com.eryong.domain.InSupplierInfo;

/**
 * @�ļ���: InSupplierInfo.java
 * @�๦��˵��: ��Ӧ�̹���Dao
 * @����: QISHAOFAN
 * @Email: 1743152247@qq.com
 * @����: 2019��6��26������10:30:02
 * @�޸�˵��:<br> <pre>
 * 	 <li>����: QISHAOFAN</li> 
 * 	 <li>����: 2019��6��26������10:30:02</li> 
 *  <li>����: </li>
 * </pre>
 */
public interface InSupplierInfoDao {

	public List<InSupplierInfo> findAllInSuppliers(Map<String, Object> map);

	public int findAllInSuppliersCount(Map<String, Object> map);
	
	public  int  addInSupplierInfo(InSupplierInfo inSupplierInfo);
	
	public int updateInSupplierInfo(InSupplierInfo inSupplierInfo);

	public  int  deleteInSupplierInfo(Integer insiId);

	public List<InSupplierInfo> getComboBox();
	
	

}
