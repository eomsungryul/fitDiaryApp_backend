package com.dwebss.fitdiary.backend.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.dwebss.fitdiary.backend.core.Mapper;
import com.dwebss.fitdiary.backend.model.UserInbodyDetail;

public interface UserInbodyDetailMapper extends Mapper<UserInbodyDetail> {

    /**
     * 사용자 다이어리 조회 후 다이어리 등록 날짜를 이용하여 가져오는 인바디 상세정보
     */
	List<UserInbodyDetail> selectInbodyDetail(Date dairyWriteD);

	void updateDetail(UserInbodyDetail inbodyDetailVO);

	List<UserInbodyDetail> selectUserBodyStat(Integer userId);

	List<Map<String,Object>> selectUserBodyRank(Map<String, Object> param);

	List<Map<String,Object>> selectUserBodyWeight(Map<String, Object> param);
}