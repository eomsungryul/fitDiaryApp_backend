package com.dwebss.fitdiary.backend.dao;

import java.util.List;

import com.dwebss.fitdiary.backend.core.Mapper;
import com.dwebss.fitdiary.backend.model.UserDiaryExerciseCourse;

public interface UserDiaryExerciseCourseMapper extends Mapper<UserDiaryExerciseCourse> {

	List<UserDiaryExerciseCourse> selectExerciseCourse(Integer userDiaryId);

	List<UserDiaryExerciseCourse> selectUserExerciseRangeCnt(Integer userId);
}