package com.dwebss.fitdiary.backend.service;
import com.dwebss.fitdiary.backend.model.UserInbodyDetail;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.dwebss.fitdiary.backend.core.Service;


/**
 * Created by 엄성렬 on 2018/07/16.
 */
public interface UserInbodyDetailService extends Service<UserInbodyDetail> {

	List<UserInbodyDetail> selectInbodyDetail(Date dairyWriteD);

	void updateDetail(UserInbodyDetail inbodyDetailVO);

	List<UserInbodyDetail> selectUserBodyStat(Integer userId);

	List<Map<String,Object>> selectUserBodyRank(Map<String, Object> param);

	List<Map<String,Object>> selectUserBodyWeight(Map<String, Object> param);

}
