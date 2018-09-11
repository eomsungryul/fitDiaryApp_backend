package com.dwebss.fitdiary.backend.service;
import com.dwebss.fitdiary.backend.model.User;
import com.dwebss.fitdiary.backend.core.Service;


/**
 * Created by 엄성렬 on 2018/07/10.
 */
public interface UserService extends Service<User> {

	User selectUser(User user);

	void updateUser(User user);

}
