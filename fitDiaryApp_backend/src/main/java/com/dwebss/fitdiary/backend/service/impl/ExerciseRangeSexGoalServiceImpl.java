package com.dwebss.fitdiary.backend.service.impl;

import com.dwebss.fitdiary.backend.dao.ExerciseRangeSexGoalMapper;
import com.dwebss.fitdiary.backend.model.ExerciseRangeSexGoal;
import com.dwebss.fitdiary.backend.service.ExerciseRangeSexGoalService;
import com.dwebss.fitdiary.backend.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2018/07/10.
 */
@Service
@Transactional
public class ExerciseRangeSexGoalServiceImpl extends AbstractService<ExerciseRangeSexGoal> implements ExerciseRangeSexGoalService {
    @Resource
    private ExerciseRangeSexGoalMapper exerciseRangeSexGoalMapper;

}
