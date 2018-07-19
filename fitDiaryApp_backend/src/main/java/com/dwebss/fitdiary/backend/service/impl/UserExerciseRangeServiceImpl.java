package com.dwebss.fitdiary.backend.service.impl;

import com.dwebss.fitdiary.backend.dao.UserExerciseRangeMapper;
import com.dwebss.fitdiary.backend.model.UserExerciseRange;
import com.dwebss.fitdiary.backend.service.UserExerciseRangeService;
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
public class UserExerciseRangeServiceImpl extends AbstractService<UserExerciseRange> implements UserExerciseRangeService {
    @Resource
    private UserExerciseRangeMapper userExerciseRangeMapper;

	@Override
	public void delete(Integer userId) {
		userExerciseRangeMapper.deleteRange(userId);
	}

	@Override
	public List<UserExerciseRange> selectUserRange(int i) {
		return userExerciseRangeMapper.selectUserRange(i);
	}

}
