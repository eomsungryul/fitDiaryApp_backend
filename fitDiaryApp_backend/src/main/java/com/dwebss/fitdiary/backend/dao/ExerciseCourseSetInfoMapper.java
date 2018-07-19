package com.dwebss.fitdiary.backend.dao;

import java.util.List;

import com.dwebss.fitdiary.backend.core.Mapper;
import com.dwebss.fitdiary.backend.model.ExerciseCourseSetInfo;

public interface ExerciseCourseSetInfoMapper extends Mapper<ExerciseCourseSetInfo> {

	void deleteSetInfo(Integer exerciseCourseDetailId);

	List<ExerciseCourseSetInfo> selectUserSetInfo(Integer detailId);
}