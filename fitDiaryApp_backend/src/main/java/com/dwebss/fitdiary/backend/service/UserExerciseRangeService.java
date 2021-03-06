package com.dwebss.fitdiary.backend.service;
import com.dwebss.fitdiary.backend.model.UserExerciseRange;

import java.util.List;

import com.dwebss.fitdiary.backend.core.Service;


/**
 * Created by 엄성렬 on 2018/07/10.
 */
public interface UserExerciseRangeService extends Service<UserExerciseRange> {

	void delete(Integer userId);

	List<UserExerciseRange> selectUserRange(int i);

}
