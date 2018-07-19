package com.dwebss.fitdiary.backend.service;
import com.dwebss.fitdiary.backend.model.ExerciseInfo;

import java.util.List;
import java.util.Map;

import com.dwebss.fitdiary.backend.core.Service;


/**
 * Created by 엄성렬 on 2018/07/10.
 */
public interface ExerciseInfoService extends Service<ExerciseInfo> {

	List<ExerciseInfo> selectExerciseInfo(Integer exerciseRangeCd);
	
	List<ExerciseInfo> selectExerciseInfoList(ExerciseInfo exerciseRangeCd);

	List<ExerciseInfo> selectUserExerciseInfo(Map<String, Object> param);

}
