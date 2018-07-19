package com.dwebss.fitdiary.backend.dao;

import java.util.List;

import com.dwebss.fitdiary.backend.core.Mapper;
import com.dwebss.fitdiary.backend.model.UserExerciseRange;

public interface UserExerciseRangeMapper extends Mapper<UserExerciseRange> {

	void deleteRange(Integer userId);

	List<UserExerciseRange> selectUserRange(int i);
}