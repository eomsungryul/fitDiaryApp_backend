package com.dwebss.fitdiary.backend.service.impl;

import com.dwebss.fitdiary.backend.dao.TrainerDetailInfoMapper;
import com.dwebss.fitdiary.backend.model.TrainerDetailInfo;
import com.dwebss.fitdiary.backend.service.TrainerDetailInfoService;
import com.dwebss.fitdiary.backend.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2018/07/10.
 */
@Service
@Transactional
public class TrainerDetailInfoServiceImpl extends AbstractService<TrainerDetailInfo> implements TrainerDetailInfoService {
    @Resource
    private TrainerDetailInfoMapper trainerDetailInfoMapper;

}
