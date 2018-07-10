package com.dwebss.fitdiary.backend.service.impl;

import com.dwebss.fitdiary.backend.dao.GymOffDaysMapper;
import com.dwebss.fitdiary.backend.model.GymOffDays;
import com.dwebss.fitdiary.backend.service.GymOffDaysService;
import com.dwebss.fitdiary.backend.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2018/07/10.
 */
@Service
@Transactional
public class GymOffDaysServiceImpl extends AbstractService<GymOffDays> implements GymOffDaysService {
    @Resource
    private GymOffDaysMapper gymOffDaysMapper;

}
