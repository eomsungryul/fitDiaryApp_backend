package com.dwebss.fitdiary.backend.dao;

import com.dwebss.fitdiary.backend.core.Mapper;
import com.dwebss.fitdiary.backend.model.User;

public interface UserMapper extends Mapper<User> {

	User selectUser(User user);
}