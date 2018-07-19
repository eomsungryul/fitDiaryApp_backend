package com.dwebss.fitdiary.backend.service;
import com.dwebss.fitdiary.backend.model.ExerciseCourseSetInfo;

import java.util.List;

import com.dwebss.fitdiary.backend.core.Service;


/**
 * Created by 엄성렬 on 2018/07/17.
 */
public interface ExerciseCourseSetInfoService extends Service<ExerciseCourseSetInfo> {

	void deleteSetInfo(Integer exerciseCourseDetailId);

	List<ExerciseCourseSetInfo> selectUserSetInfo(Integer detailId);
}
