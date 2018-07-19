package com.dwebss.fitdiary.backend.dao;

import com.dwebss.fitdiary.backend.core.Mapper;
import com.dwebss.fitdiary.backend.model.UserGym;

public interface UserGymMapper extends Mapper<UserGym> {

	UserGym selectGymID(UserGym ug);
	
	
}