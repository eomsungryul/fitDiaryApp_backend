package com.dwebss.fitdiary.backend.service.impl;

import com.dwebss.fitdiary.backend.dao.UserClassReportMapper;
import com.dwebss.fitdiary.backend.model.UserClassReport;
import com.dwebss.fitdiary.backend.service.UserClassReportService;
import com.dwebss.fitdiary.backend.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2018/07/10.
 */
@Service
@Transactional
public class UserClassReportServiceImpl extends AbstractService<UserClassReport> implements UserClassReportService {
    @Resource
    private UserClassReportMapper userClassReportMapper;

}
