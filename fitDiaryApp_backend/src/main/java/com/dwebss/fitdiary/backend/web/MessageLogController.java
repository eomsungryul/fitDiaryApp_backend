package com.dwebss.fitdiary.backend.web;

import com.dwebss.fitdiary.backend.core.Result;
import com.dwebss.fitdiary.backend.core.ResultGenerator;
import com.dwebss.fitdiary.backend.model.MessageLog;
import com.dwebss.fitdiary.backend.service.MessageLogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by 엄성렬 on 2018/07/10.
*/
@RestController
@RequestMapping("/message/log")
public class MessageLogController {
    @Resource
    private MessageLogService messageLogService;

    @PostMapping
    public Result add(@RequestBody MessageLog messageLog) {
        messageLogService.save(messageLog);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        messageLogService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody MessageLog messageLog) {
        messageLogService.update(messageLog);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        MessageLog messageLog = messageLogService.findById(id);
        return ResultGenerator.genSuccessResult(messageLog);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<MessageLog> list = messageLogService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
