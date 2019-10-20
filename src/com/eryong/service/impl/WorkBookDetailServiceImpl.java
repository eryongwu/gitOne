/**@文件名: WorkBookDetailService.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月23日下午3:14:43
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月23日下午3:14:43</li> 
 *	 <li>内容: </li>
 * </pre>
 */
package com.eryong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eryong.dao.WorkBookDetailDao;
import com.eryong.domain.WorkBookDetail;
import com.eryong.service.WorkBookDetailService;

/**@文件名: WorkBookDetailService.java
 * @类功能说明: 
 * @作者: Wueryong
 * @Email: 738841484@qq.com
 * @日期: 2019年6月23日下午3:14:43
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: Wueryong</li> 
 * 	 <li>日期: 2019年6月23日下午3:14:43</li> 
 *	 <li>内容: </li>
 * </pre>
 */
/**
 * @author Lenovo
 *
 */
@Service
public class WorkBookDetailServiceImpl implements WorkBookDetailService {

	@Autowired
	private WorkBookDetailDao workBookDetailDao;
	@Override
	public WorkBookDetail getWorkBookDetailByWBId(Integer wBId) {
		WorkBookDetail workBookDetailList =  workBookDetailDao.getWorkBookDetailByWBId(wBId);
		return workBookDetailList;
	}

	
}

