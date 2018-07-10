package com.dwebss.fitdiary.backend.service.impl;

import com.dwebss.fitdiary.backend.dao.GymMapper;
import com.dwebss.fitdiary.backend.model.Gym;
import com.dwebss.fitdiary.backend.service.GymService;
import com.dwebss.fitdiary.backend.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2018/07/10.
 */
@Service
@Transactional
public class GymServiceImpl extends AbstractService<Gym> implements GymService {
    @Resource
    private GymMapper gymMapper;

}
