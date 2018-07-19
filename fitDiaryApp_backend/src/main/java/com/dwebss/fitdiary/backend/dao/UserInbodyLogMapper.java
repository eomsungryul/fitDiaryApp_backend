package com.dwebss.fitdiary.backend.dao;

import java.util.List;

import com.dwebss.fitdiary.backend.core.Mapper;
import com.dwebss.fitdiary.backend.model.UserInbodyLog;

public interface UserInbodyLogMapper extends Mapper<UserInbodyLog> {

	List<UserInbodyLog> selectInbodyLog(UserInbodyLog userInbodyLog);

//	UserInbodyLog insertInbodyLog(UserInbodyLog userInbodyLog);
	void insertInbodyLog(UserInbodyLog userInbodyLog);
}