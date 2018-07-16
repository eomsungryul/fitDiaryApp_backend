package com.dwebss.fitdiary.backend.service;
import com.dwebss.fitdiary.backend.model.CommonCode;

import java.util.List;

import com.dwebss.fitdiary.backend.core.Service;


/**
 * Created by 엄성렬 on 2018/07/16.
 */
public interface CommonCodeService extends Service<CommonCode> {

	List<CommonCode> selectCodeCategory(Integer codeCategoryId);

}
