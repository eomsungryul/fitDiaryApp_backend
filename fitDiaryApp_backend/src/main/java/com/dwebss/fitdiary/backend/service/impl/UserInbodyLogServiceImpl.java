package com.dwebss.fitdiary.backend.service.impl;

import com.dwebss.fitdiary.backend.dao.UserInbodyLogMapper;
import com.dwebss.fitdiary.backend.model.UserInbodyLog;
import com.dwebss.fitdiary.backend.service.UserInbodyLogService;
import com.dwebss.fitdiary.backend.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2018/07/16.
 */
@Service
@Transactional
public class UserInbodyLogServiceImpl extends AbstractService<UserInbodyLog> implements UserInbodyLogService {
    @Resource
    private UserInbodyLogMapper userInbodyLogMapper;

	@Override
	public List<UserInbodyLog> selectInbodyLog(UserInbodyLog userInbodyLog) {
		return userInbodyLogMapper.selectInbodyLog(userInbodyLog);
	}

	@Override
	public void insertInbodyLog(UserInbodyLog userInbodyLog) {
		userInbodyLogMapper.insertInbodyLog(userInbodyLog);
	}

}
