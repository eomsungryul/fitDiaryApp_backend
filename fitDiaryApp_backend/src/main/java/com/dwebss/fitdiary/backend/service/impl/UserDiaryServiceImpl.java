package com.dwebss.fitdiary.backend.service.impl;

import com.dwebss.fitdiary.backend.dao.UserDiaryMapper;
import com.dwebss.fitdiary.backend.model.UserDiary;
import com.dwebss.fitdiary.backend.service.UserDiaryService;
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
public class UserDiaryServiceImpl extends AbstractService<UserDiary> implements UserDiaryService {
    @Resource
    private UserDiaryMapper userDiaryMapper;

	@Override
	public List<UserDiary> selectTodayExerciseCourse(UserDiary userDiary) {
		return userDiaryMapper.selectTodayExerciseCourse(userDiary);
	}

	@Override
	public List<UserDiary> selectDiary(UserDiary userDiary) {
		return userDiaryMapper.selectDiary(userDiary);
	}

	@Override
	public Integer selectExerciseDay(Integer userId) {
		return userDiaryMapper.selectExerciseDay(userId);
	}

}
