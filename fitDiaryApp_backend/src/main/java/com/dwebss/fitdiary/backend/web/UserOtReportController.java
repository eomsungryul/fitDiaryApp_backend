package com.dwebss.fitdiary.backend.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dwebss.fitdiary.backend.core.Result;
import com.dwebss.fitdiary.backend.core.ResultGenerator;
import com.dwebss.fitdiary.backend.model.UserOtReport;
import com.dwebss.fitdiary.backend.service.UserOtReportService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
* Created by 엄성렬 on 2018/07/16.
*/
@RestController
@RequestMapping("/user/ot")
public class UserOtReportController {
	
    @Resource
    private UserOtReportService userOtReportService;

    @PostMapping
    public Result add(@RequestBody UserOtReport userOtReport) {

		userOtReportService.save(userOtReport);
        
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        userOtReportService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody UserOtReport userOtReport) {
        userOtReportService.update(userOtReport);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{userId}/gym/{gymId}")
    public Result selectOt(@PathVariable Integer userId, @PathVariable Integer gymId) {
    	UserOtReport userOtReport = new UserOtReport();
    	userOtReport.setUserId(userId);
    	userOtReport.setGymId(gymId);
    	
    	List<UserOtReport> res = userOtReportService.selectOt(userOtReport);
        
        return ResultGenerator.genSuccessResult(res);
    }
    
    @GetMapping("/{userGymId}")
    public Result selectOtUserGymId(@PathVariable Integer userGymId) {
    	UserOtReport userOtReport = new UserOtReport();
    	userOtReport.setUserGymId(userGymId);
    	List<UserOtReport> res = userOtReportService.selectOt(userOtReport);
    	
    	return ResultGenerator.genSuccessResult(res);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<UserOtReport> list = userOtReportService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
    
    
    

}
