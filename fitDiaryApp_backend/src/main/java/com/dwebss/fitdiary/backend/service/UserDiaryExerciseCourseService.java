package com.dwebss.fitdiary.backend.service;
import com.dwebss.fitdiary.backend.model.UserDiaryExerciseCourse;

import java.util.List;

import com.dwebss.fitdiary.backend.core.Service;


/**
 * Created by 엄성렬 on 2018/07/10.
 */
public interface UserDiaryExerciseCourseService extends Service<UserDiaryExerciseCourse> {

	List<UserDiaryExerciseCourse> selectExerciseCourse(Integer userDiaryId);

}
