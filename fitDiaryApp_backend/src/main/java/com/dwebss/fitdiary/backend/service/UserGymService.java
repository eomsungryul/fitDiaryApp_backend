package com.dwebss.fitdiary.backend.service;
import com.dwebss.fitdiary.backend.model.UserGym;
import com.dwebss.fitdiary.backend.core.Service;


/**
 * Created by 엄성렬 on 2018/07/10.
 */
public interface UserGymService extends Service<UserGym> {

	UserGym select(UserGym ug);

}
