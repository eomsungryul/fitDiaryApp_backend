package com.dwebss.fitdiary.backend.dao;

import java.util.List;

import com.dwebss.fitdiary.backend.core.Mapper;
import com.dwebss.fitdiary.backend.model.ExerciseInfo;

public interface ExerciseInfoMapper extends Mapper<ExerciseInfo> {

	List<ExerciseInfo> selectExerciseInfo(Integer exerciseRangeCd);
}