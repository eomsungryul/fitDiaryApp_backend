package com.dwebss.fitdiary.backend.service.impl;

import com.dwebss.fitdiary.backend.dao.CommonCodeCategoryMapper;
import com.dwebss.fitdiary.backend.model.CommonCodeCategory;
import com.dwebss.fitdiary.backend.service.CommonCodeCategoryService;
import com.dwebss.fitdiary.backend.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2018/07/16.
 */
@Service
@Transactional
public class CommonCodeCategoryServiceImpl extends AbstractService<CommonCodeCategory> implements CommonCodeCategoryService {
    @Resource
    private CommonCodeCategoryMapper commonCodeCategoryMapper;

}
