package com.dwebss.fitdiary.backend.service.impl;

import com.dwebss.fitdiary.backend.dao.MessageLogMapper;
import com.dwebss.fitdiary.backend.model.MessageLog;
import com.dwebss.fitdiary.backend.service.MessageLogService;
import com.dwebss.fitdiary.backend.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2018/07/10.
 */
@Service
@Transactional
public class MessageLogServiceImpl extends AbstractService<MessageLog> implements MessageLogService {
    @Resource
    private MessageLogMapper messageLogMapper;

}
