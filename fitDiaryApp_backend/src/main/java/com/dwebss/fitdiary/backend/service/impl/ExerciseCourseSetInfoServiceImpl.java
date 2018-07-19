package com.dwebss.fitdiary.backend.service.impl;

import com.dwebss.fitdiary.backend.dao.ExerciseCourseSetInfoMapper;
import com.dwebss.fitdiary.backend.model.ExerciseCourseSetInfo;
import com.dwebss.fitdiary.backend.service.ExerciseCourseSetInfoService;
import com.dwebss.fitdiary.backend.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2018/07/17.
 */
@Service
@Transactional
public class ExerciseCourseSetInfoServiceImpl extends AbstractService<ExerciseCourseSetInfo> implements ExerciseCourseSetInfoService {
	
    @Resource
    private ExerciseCourseSetInfoMapper exerciseCourseSetInfoMapper;

	@Override
	public void deleteSetInfo(Integer exerciseCourseDetailId) {
		exerciseCourseSetInfoMapper.deleteSetInfo(exerciseCourseDetailId);
	}
	
	@Override
	public List<ExerciseCourseSetInfo> selectUserSetInfo(Integer detailId) {
		return exerciseCourseSetInfoMapper.selectUserSetInfo(detailId);
	}

}
