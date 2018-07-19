package com.dwebss.fitdiary.backend.web;

import com.dwebss.fitdiary.backend.core.Result;
import com.dwebss.fitdiary.backend.core.ResultGenerator;
import com.dwebss.fitdiary.backend.model.ExerciseCourseSetInfo;
import com.dwebss.fitdiary.backend.service.ExerciseCourseSetInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by 엄성렬 on 2018/07/17.
*/
@RestController
@RequestMapping("/exercise/course/set/info")
public class ExerciseCourseSetInfoController {
    @Resource
    private ExerciseCourseSetInfoService exerciseCourseSetInfoService;

    @PostMapping
    public Result add(@RequestBody ExerciseCourseSetInfo exerciseCourseSetInfo) {
        exerciseCourseSetInfoService.save(exerciseCourseSetInfo);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        exerciseCourseSetInfoService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody ExerciseCourseSetInfo exerciseCourseSetInfo) {
        exerciseCourseSetInfoService.update(exerciseCourseSetInfo);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        ExerciseCourseSetInfo exerciseCourseSetInfo = exerciseCourseSetInfoService.findById(id);
        return ResultGenerator.genSuccessResult(exerciseCourseSetInfo);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<ExerciseCourseSetInfo> list = exerciseCourseSetInfoService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
