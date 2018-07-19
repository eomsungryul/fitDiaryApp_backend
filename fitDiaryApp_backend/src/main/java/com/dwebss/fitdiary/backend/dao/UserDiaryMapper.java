package com.dwebss.fitdiary.backend.dao;

import java.util.List;

import com.dwebss.fitdiary.backend.core.Mapper;
import com.dwebss.fitdiary.backend.model.UserDiary;

public interface UserDiaryMapper extends Mapper<UserDiary> {

	List<UserDiary> selectTodayExerciseCourse(UserDiary userDiary);

	List<UserDiary> selectDiary(UserDiary userDiary);

	Integer selectExerciseDay(Integer userId);

}