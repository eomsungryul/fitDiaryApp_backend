package com.dwebss.fitdiary.backend.web;

import com.dwebss.fitdiary.backend.core.Result;
import com.dwebss.fitdiary.backend.core.ResultGenerator;
import com.dwebss.fitdiary.backend.model.UserDiary;
import com.dwebss.fitdiary.backend.service.UserDiaryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import java.time.LocalDate;
import java.util.List;

/**
* Created by 엄성렬 on 2018/07/10.
*/
@RestController
@RequestMapping("/user/diary")
public class UserDiaryController {
    @Resource
    private UserDiaryService userDiaryService;

    @PostMapping
    public Result add(@RequestBody UserDiary userDiary) {
        userDiaryService.save(userDiary);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        userDiaryService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody UserDiary userDiary) {
        userDiaryService.update(userDiary);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        UserDiary userDiary = userDiaryService.findById(id);
        return ResultGenerator.genSuccessResult(userDiary);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<UserDiary> list = userDiaryService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
    
    
    @GetMapping("/{userId}/{startDate}/{endDate}")
    public Result selectDiary(@PathVariable Integer userId ,
    		@PathVariable @DateTimeFormat(pattern = "yyyyMMdd") LocalDate startDate,
    		@PathVariable @DateTimeFormat(pattern = "yyyyMMdd") LocalDate endDate
    		) {
    	
    	UserDiary userDiary = new UserDiary();
        userDiary.setUserId(userId);
        userDiary.setStartDate(java.sql.Date.valueOf(startDate));
        userDiary.setEndDate(java.sql.Date.valueOf(endDate));
        List<UserDiary> res = userDiaryService.selectDiary(userDiary);
        
        return ResultGenerator.genSuccessResult(res);
    }
}
