package com.dwebss.fitdiary.backend.service.impl;

import com.dwebss.fitdiary.backend.dao.GymClassMapper;
import com.dwebss.fitdiary.backend.model.GymClass;
import com.dwebss.fitdiary.backend.service.GymClassService;
import com.dwebss.fitdiary.backend.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2018/07/10.
 */
@Service
@Transactional
public class GymClassServiceImpl extends AbstractService<GymClass> implements GymClassService {
    @Resource
    private GymClassMapper gymClassMapper;

}
