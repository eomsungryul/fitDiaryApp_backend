package com.dwebss.fitdiary.backend.service.impl;

import com.dwebss.fitdiary.backend.dao.UserOtReportMapper;
import com.dwebss.fitdiary.backend.model.UserOtReport;
import com.dwebss.fitdiary.backend.service.UserOtReportService;
import com.dwebss.fitdiary.backend.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2018/07/16.
 */
@Service
@Transactional
public class UserOtReportServiceImpl extends AbstractService<UserOtReport> implements UserOtReportService {
    @Resource
    private UserOtReportMapper userOtReportMapper;

	@Override
	public List<UserOtReport> selectOt(UserOtReport userOtReport) {
		return userOtReportMapper.selectOt(userOtReport);
	}

}
