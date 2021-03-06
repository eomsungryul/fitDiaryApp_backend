package com.dwebss.fitdiary.backend.service.impl;

import com.dwebss.fitdiary.backend.dao.UserMembershipsMapper;
import com.dwebss.fitdiary.backend.model.UserMemberships;
import com.dwebss.fitdiary.backend.service.UserMembershipsService;
import com.dwebss.fitdiary.backend.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2018/07/10.
 */
@Service
@Transactional
public class UserMembershipsServiceImpl extends AbstractService<UserMemberships> implements UserMembershipsService {
    @Resource
    private UserMembershipsMapper userMembershipsMapper;

}
