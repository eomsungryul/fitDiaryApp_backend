package com.dwebss.fitdiary.backend.service.impl;

import com.dwebss.fitdiary.backend.dao.ClassTrainerMapper;
import com.dwebss.fitdiary.backend.model.ClassTrainer;
import com.dwebss.fitdiary.backend.service.ClassTrainerService;
import com.dwebss.fitdiary.backend.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2018/07/10.
 */
@Service
@Transactional
public class ClassTrainerServiceImpl extends AbstractService<ClassTrainer> implements ClassTrainerService {
    @Resource
    private ClassTrainerMapper classTrainerMapper;

}
