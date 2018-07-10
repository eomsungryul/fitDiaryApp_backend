package com.dwebss.fitdiary.backend.service.impl;

import com.dwebss.fitdiary.backend.dao.UserClassContractMapper;
import com.dwebss.fitdiary.backend.model.UserClassContract;
import com.dwebss.fitdiary.backend.service.UserClassContractService;
import com.dwebss.fitdiary.backend.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2018/07/10.
 */
@Service
@Transactional
public class UserClassContractServiceImpl extends AbstractService<UserClassContract> implements UserClassContractService {
    @Resource
    private UserClassContractMapper userClassContractMapper;

}
