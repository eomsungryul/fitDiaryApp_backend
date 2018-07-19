package com.dwebss.fitdiary.backend.service;
import com.dwebss.fitdiary.backend.model.UserDiary;

import java.util.List;

import com.dwebss.fitdiary.backend.core.Service;


/**
 * Created by 엄성렬 on 2018/07/10.
 */
public interface UserDiaryService extends Service<UserDiary> {

	List<UserDiary> selectTodayExerciseCourse(UserDiary userDiary);

	List<UserDiary> selectDiary(UserDiary userDiary);

	Integer selectExerciseDay(Integer userId);

}
