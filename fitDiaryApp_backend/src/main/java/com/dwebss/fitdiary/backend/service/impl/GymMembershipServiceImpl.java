package com.dwebss.fitdiary.backend.service.impl;

import com.dwebss.fitdiary.backend.dao.GymMembershipMapper;
import com.dwebss.fitdiary.backend.model.GymMembership;
import com.dwebss.fitdiary.backend.service.GymMembershipService;
import com.dwebss.fitdiary.backend.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2018/07/10.
 */
@Service
@Transactional
public class GymMembershipServiceImpl extends AbstractService<GymMembership> implements GymMembershipService {
    @Resource
    private GymMembershipMapper gymMembershipMapper;

}
