package com.dwebss.fitdiary.backend.service.impl;

import com.dwebss.fitdiary.backend.dao.ExerciseInfoMapper;
import com.dwebss.fitdiary.backend.model.ExerciseInfo;
import com.dwebss.fitdiary.backend.service.ExerciseInfoService;
import com.dwebss.fitdiary.backend.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2018/07/10.
 */
@Service
@Transactional
public class ExerciseInfoServiceImpl extends AbstractService<ExerciseInfo> implements ExerciseInfoService {
    @Resource
    private ExerciseInfoMapper exerciseInfoMapper;

	@Override
	public List<ExerciseInfo> selectExerciseInfo(Integer exerciseRangeCd) {
		return exerciseInfoMapper.selectExerciseInfo(exerciseRangeCd);
	}

	@Override
	public List<ExerciseInfo> selectUserExerciseInfo(Map<String, Object> param) {
		return exerciseInfoMapper.selectUserExerciseInfo(param);
	}

	@Override
	public List<ExerciseInfo> selectExerciseInfoList(ExerciseInfo vo) {
		return exerciseInfoMapper.selectExerciseInfoList(vo);
	}

}
