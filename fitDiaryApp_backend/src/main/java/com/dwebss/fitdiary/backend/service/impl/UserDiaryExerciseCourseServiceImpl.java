package com.dwebss.fitdiary.backend.service.impl;

import com.dwebss.fitdiary.backend.dao.UserDiaryExerciseCourseMapper;
import com.dwebss.fitdiary.backend.model.UserDiaryExerciseCourse;
import com.dwebss.fitdiary.backend.service.UserDiaryExerciseCourseService;
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
public class UserDiaryExerciseCourseServiceImpl extends AbstractService<UserDiaryExerciseCourse> implements UserDiaryExerciseCourseService {
    @Resource
    private UserDiaryExerciseCourseMapper userDiaryExerciseCourseMapper;

	@Override
	public List<UserDiaryExerciseCourse> selectExerciseCourse(Integer userDiaryId) {
		return userDiaryExerciseCourseMapper.selectExerciseCourse(userDiaryId);
	}

	@Override
	public List<UserDiaryExerciseCourse> selectUserExerciseRangeCnt(Integer userId) {
		return userDiaryExerciseCourseMapper.selectUserExerciseRangeCnt(userId);
	}

}
