package com.dwebss.fitdiary.backend.service.impl;

import com.dwebss.fitdiary.backend.dao.ConsultingInfoMapper;
import com.dwebss.fitdiary.backend.model.ConsultingInfo;
import com.dwebss.fitdiary.backend.service.ConsultingInfoService;
import com.dwebss.fitdiary.backend.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2018/07/10.
 */
@Service
@Transactional
public class ConsultingInfoServiceImpl extends AbstractService<ConsultingInfo> implements ConsultingInfoService {
    @Resource
    private ConsultingInfoMapper consultingInfoMapper;

}
