package com.dwebss.fitdiary.backend.service.impl;

import com.dwebss.fitdiary.backend.dao.UserGymMapper;
import com.dwebss.fitdiary.backend.model.UserGym;
import com.dwebss.fitdiary.backend.service.UserGymService;
import com.dwebss.fitdiary.backend.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2018/07/10.
 */
@Service
@Transactional
public class UserGymServiceImpl extends AbstractService<UserGym> implements UserGymService {
    @Resource
    private UserGymMapper userGymMapper;

}
