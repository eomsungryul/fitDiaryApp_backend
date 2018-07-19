package com.dwebss.fitdiary.backend.dao;

import java.util.List;
import java.util.Map;

import com.dwebss.fitdiary.backend.core.Mapper;
import com.dwebss.fitdiary.backend.model.ExerciseInfo;

public interface ExerciseInfoMapper extends Mapper<ExerciseInfo> {

	List<ExerciseInfo> selectExerciseInfo(Integer exerciseRangeCd);

	List<ExerciseInfo> selectUserExerciseInfo(Map<String, Object> param);

	List<ExerciseInfo> selectExerciseInfoList(ExerciseInfo vo);
}