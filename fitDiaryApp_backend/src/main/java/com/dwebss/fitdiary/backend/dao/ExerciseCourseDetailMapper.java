package com.dwebss.fitdiary.backend.dao;

import java.util.List;

import com.dwebss.fitdiary.backend.core.Mapper;
import com.dwebss.fitdiary.backend.model.ExerciseCourseDetail;

public interface ExerciseCourseDetailMapper extends Mapper<ExerciseCourseDetail> {

	void insertDetail(ExerciseCourseDetail exerciseCourseDetail);

	List<ExerciseCourseDetail> selectUserExerciseDetail(Integer userId);
}