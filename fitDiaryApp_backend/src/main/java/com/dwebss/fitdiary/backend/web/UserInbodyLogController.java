package com.dwebss.fitdiary.backend.web;

import com.dwebss.fitdiary.backend.core.Result;
import com.dwebss.fitdiary.backend.core.ResultGenerator;
import com.dwebss.fitdiary.backend.model.UserDiary;
import com.dwebss.fitdiary.backend.model.UserInbodyDetail;
import com.dwebss.fitdiary.backend.model.UserInbodyLog;
import com.dwebss.fitdiary.backend.service.UserInbodyDetailService;
import com.dwebss.fitdiary.backend.service.UserInbodyLogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
* Created by 엄성렬 on 2018/07/16.
*/
@RestController
@RequestMapping("/user/inbody")
public class UserInbodyLogController {
	
    @Resource
    private UserInbodyLogService userInbodyLogService;

    @Resource
    private UserInbodyDetailService userInbodyDetailService;

    @PostMapping
    public Result add(@RequestBody UserInbodyLog userInbodyLog) {
    	
    	userInbodyLogService.insertInbodyLog(userInbodyLog);
    	
    	for (Map<String, Integer> il : userInbodyLog.getList()) {
    		UserInbodyDetail inbodyDetailVO = new UserInbodyDetail();
    		inbodyDetailVO.setUserInbodyId(userInbodyLog.getUserInbodyId());
    		inbodyDetailVO.setInbodyCd(il.get("inbodyCd"));
    		inbodyDetailVO.setInbodyCdValue(il.get("inbodyCdValue"));
    		userInbodyDetailService.save(inbodyDetailVO);
    	}
        
        
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        userInbodyLogService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody UserInbodyLog userInbodyLog) {
        userInbodyLogService.update(userInbodyLog);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<UserInbodyLog> list = userInbodyLogService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @GetMapping("/{userId}/{date}")
    public Result selectInbodyLog(@PathVariable Integer userId ,
    		@PathVariable @DateTimeFormat(pattern = "yyyyMMdd") LocalDate date
    		) {
    	UserInbodyLog userInbodyLog = new UserInbodyLog();
    	userInbodyLog.setUserId(userId);
    	userInbodyLog.setUserInbodyLogInsertDt(java.sql.Date.valueOf(date));
    	List<UserInbodyLog> res = userInbodyLogService.selectInbodyLog(userInbodyLog);
    	
    	return ResultGenerator.genSuccessResult(res);
    }
    @GetMapping("/{userId}")
    public Result selectInbodyLog(@PathVariable Integer userId 
    		) {
    	UserInbodyLog userInbodyLog = new UserInbodyLog();
    	userInbodyLog.setUserId(userId);
    	List<UserInbodyLog> res = userInbodyLogService.selectInbodyLog(userInbodyLog);
    	
    	return ResultGenerator.genSuccessResult(res);
    }
}
