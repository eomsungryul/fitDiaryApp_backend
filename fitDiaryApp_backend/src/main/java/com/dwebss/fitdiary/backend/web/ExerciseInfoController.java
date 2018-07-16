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
import com.dwebss.fitdiary.backend.model.ExerciseInfo;
import com.dwebss.fitdiary.backend.service.ExerciseInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
* Created by 엄성렬 on 2018/07/10.
*/
@RestController
@RequestMapping("/exercise_info")
public class ExerciseInfoController {
    @Resource
    private ExerciseInfoService exerciseInfoService;

    @PostMapping
    public Result add(@RequestBody ExerciseInfo exerciseInfo) {
        exerciseInfoService.save(exerciseInfo);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        exerciseInfoService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody ExerciseInfo exerciseInfo) {
        exerciseInfoService.update(exerciseInfo);
        return ResultGenerator.genSuccessResult();
    }

//    @GetMapping("/{id}")
//    public Result detail(@PathVariable Integer id) {
//        ExerciseInfo exerciseInfo = exerciseInfoService.findById(id);
//        return ResultGenerator.genSuccessResult(exerciseInfo);
//    }
//    

    @GetMapping("/{exerciseRangeCd}")
    public Result selectCodeCategory(@PathVariable Integer exerciseRangeCd) {
        List<ExerciseInfo> list = exerciseInfoService.selectExerciseInfo(exerciseRangeCd);
        return ResultGenerator.genSuccessResult(list);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<ExerciseInfo> list = exerciseInfoService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
