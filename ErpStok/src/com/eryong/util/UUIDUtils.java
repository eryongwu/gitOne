package com.eryong.util;

import java.util.UUID;

/**@�ļ���: UUIDUtils.java
 * @�๦��˵��: 
 * @����: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @����: 2019��3��13������2:41:53
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: GuoHaiFeng</li> 
 * 	 <li>����: 2019��3��13������2:41:53</li> 
 *	 <li>����: </li>
 * </pre>
 */
public class UUIDUtils {
	
	public static String getUUID(){
		String uuid = UUID.randomUUID().toString().replace("-", "");
		return uuid;
	}


}
