package com.dwebss.fitdiary.backend.dao;

import java.util.List;

import com.dwebss.fitdiary.backend.core.Mapper;
import com.dwebss.fitdiary.backend.model.UserOtReport;

public interface UserOtReportMapper extends Mapper<UserOtReport> {

	List<UserOtReport> selectOt(UserOtReport userOtReport);
}