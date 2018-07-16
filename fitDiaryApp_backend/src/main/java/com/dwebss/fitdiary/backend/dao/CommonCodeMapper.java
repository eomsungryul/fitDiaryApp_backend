package com.dwebss.fitdiary.backend.dao;

import java.util.List;

import com.dwebss.fitdiary.backend.core.Mapper;
import com.dwebss.fitdiary.backend.model.CommonCode;

public interface CommonCodeMapper extends Mapper<CommonCode> {

	List<CommonCode> selectCodeCategory(Integer codeCategoryId);
}