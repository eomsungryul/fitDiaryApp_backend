package com.dwebss.fitdiary.backend.service;
import com.dwebss.fitdiary.backend.model.UserInbodyLog;

import java.util.List;

import com.dwebss.fitdiary.backend.core.Service;


/**
 * Created by 엄성렬 on 2018/07/16.
 */
public interface UserInbodyLogService extends Service<UserInbodyLog> {

	List<UserInbodyLog> selectInbodyLog(UserInbodyLog userInbodyLog);

	void insertInbodyLog(UserInbodyLog userInbodyLog);

}
