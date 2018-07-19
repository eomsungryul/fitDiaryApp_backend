package com.dwebss.fitdiary.backend.service.impl;

import com.dwebss.fitdiary.backend.dao.ExerciseCourseDetailMapper;
import com.dwebss.fitdiary.backend.model.ExerciseCourseDetail;
import com.dwebss.fitdiary.backend.service.ExerciseCourseDetailService;
import com.dwebss.fitdiary.backend.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2018/07/10.
 */
@Service
@Transactional
public class ExerciseCourseDetailServiceImpl extends AbstractService<ExerciseCourseDetail> implements ExerciseCourseDetailService {
    @Resource
    private ExerciseCourseDetailMapper exerciseCourseDetailMapper;

	@Override
	public void insertDetail(ExerciseCourseDetail exerciseCourseDetail) {
		exerciseCourseDetailMapper.insertDetail(exerciseCourseDetail);	
	}

	@Override
	public List<ExerciseCourseDetail> selectUserExerciseDetail(Integer userId) {
		return exerciseCourseDetailMapper.selectUserExerciseDetail(userId);
	}

}
