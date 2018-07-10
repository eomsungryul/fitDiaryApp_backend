package com.dwebss.fitdiary.backend.service.impl;

import com.dwebss.fitdiary.backend.dao.ExerciseInfoMapper;
import com.dwebss.fitdiary.backend.model.ExerciseInfo;
import com.dwebss.fitdiary.backend.service.ExerciseInfoService;
import com.dwebss.fitdiary.backend.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2018/07/10.
 */
@Service
@Transactional
public class ExerciseInfoServiceImpl extends AbstractService<ExerciseInfo> implements ExerciseInfoService {
    @Resource
    private ExerciseInfoMapper exerciseInfoMapper;

}
