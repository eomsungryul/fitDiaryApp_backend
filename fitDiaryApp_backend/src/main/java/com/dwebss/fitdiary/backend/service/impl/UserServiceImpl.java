package com.dwebss.fitdiary.backend.service.impl;

import com.dwebss.fitdiary.backend.dao.UserMapper;
import com.dwebss.fitdiary.backend.model.User;
import com.dwebss.fitdiary.backend.service.UserService;
import com.dwebss.fitdiary.backend.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2018/07/10.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

	@Override
	public User selectUser(User user) {
		return userMapper.selectUser(user);
	}

	@Override
	public void updateUser(User user) {
		userMapper.updateUser(user);
	}

}
