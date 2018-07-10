package com.dwebss.fitdiary.backend.service.impl;

import com.dwebss.fitdiary.backend.dao.ExerciseCourseMapper;
import com.dwebss.fitdiary.backend.model.ExerciseCourse;
import com.dwebss.fitdiary.backend.service.ExerciseCourseService;
import com.dwebss.fitdiary.backend.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2018/07/10.
 */
@Service
@Transactional
public class ExerciseCourseServiceImpl extends AbstractService<ExerciseCourse> implements ExerciseCourseService {
    @Resource
    private ExerciseCourseMapper exerciseCourseMapper;

}
