package com.dwebss.fitdiary.backend.service.impl;

import com.dwebss.fitdiary.backend.dao.UserInbodyDetailMapper;
import com.dwebss.fitdiary.backend.model.UserInbodyDetail;
import com.dwebss.fitdiary.backend.service.UserInbodyDetailService;
import com.dwebss.fitdiary.backend.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2018/07/16.
 */
@Service
@Transactional
public class UserInbodyDetailServiceImpl extends AbstractService<UserInbodyDetail> implements UserInbodyDetailService {
    @Resource
    private UserInbodyDetailMapper userInbodyDetailMapper;

	@Override
	public List<UserInbodyDetail> selectInbodyDetail(Date dairyWriteD) {
		return userInbodyDetailMapper.selectInbodyDetail(dairyWriteD);
	}

	@Override
	public void updateDetail(UserInbodyDetail inbodyDetailVO) {
		userInbodyDetailMapper.updateDetail(inbodyDetailVO);
	}

	@Override
	public List<UserInbodyDetail> selectUserBodyStat(Integer userId) {
		return userInbodyDetailMapper.selectUserBodyStat(userId);
	}

	@Override
	public List<Map<String,Object>> selectUserBodyRank(Map<String, Object> param) {
		return userInbodyDetailMapper.selectUserBodyRank(param);
	}

	@Override
	public List<Map<String,Object>> selectUserBodyWeight(Map<String, Object> param) {
		return userInbodyDetailMapper.selectUserBodyWeight(param);
	}

}
