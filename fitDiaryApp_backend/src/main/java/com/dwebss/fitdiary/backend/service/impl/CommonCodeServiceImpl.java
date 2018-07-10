package com.dwebss.fitdiary.backend.service.impl;

import com.dwebss.fitdiary.backend.dao.CommonCodeMapper;
import com.dwebss.fitdiary.backend.model.CommonCode;
import com.dwebss.fitdiary.backend.service.CommonCodeService;
import com.dwebss.fitdiary.backend.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2018/07/10.
 */
@Service
@Transactional
public class CommonCodeServiceImpl extends AbstractService<CommonCode> implements CommonCodeService {
    @Resource
    private CommonCodeMapper commonCodeMapper;

}
