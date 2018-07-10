package com.dwebss.fitdiary.backend.service.impl;

import com.dwebss.fitdiary.backend.dao.UserRolesMapper;
import com.dwebss.fitdiary.backend.model.UserRoles;
import com.dwebss.fitdiary.backend.service.UserRolesService;
import com.dwebss.fitdiary.backend.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2018/07/10.
 */
@Service
@Transactional
public class UserRolesServiceImpl extends AbstractService<UserRoles> implements UserRolesService {
    @Resource
    private UserRolesMapper userRolesMapper;

}
