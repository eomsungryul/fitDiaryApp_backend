package com.dwebss.fitdiary.backend.service;
import com.dwebss.fitdiary.backend.model.ExerciseCourseDetail;

import java.util.List;

import com.dwebss.fitdiary.backend.core.Service;


/**
 * Created by 엄성렬 on 2018/07/10.
 */
public interface ExerciseCourseDetailService extends Service<ExerciseCourseDetail> {

	void insertDetail(ExerciseCourseDetail exerciseCourseDetail);

	List<ExerciseCourseDetail> selectUserExerciseDetail(Integer userId);

}
