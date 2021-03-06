package com.dwebss.fitdiary.backend.service.impl;

import com.dwebss.fitdiary.backend.dao.UserClassProgressMapper;
import com.dwebss.fitdiary.backend.model.UserClassProgress;
import com.dwebss.fitdiary.backend.service.UserClassProgressService;
import com.dwebss.fitdiary.backend.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2018/07/10.
 */
@Service
@Transactional
public class UserClassProgressServiceImpl extends AbstractService<UserClassProgress> implements UserClassProgressService {
    @Resource
    private UserClassProgressMapper userClassProgressMapper;

}
