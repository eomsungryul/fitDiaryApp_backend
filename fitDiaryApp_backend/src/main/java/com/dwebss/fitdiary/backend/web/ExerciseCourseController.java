package com.dwebss.fitdiary.backend.web;

import com.dwebss.fitdiary.backend.core.Result;
import com.dwebss.fitdiary.backend.core.ResultGenerator;
import com.dwebss.fitdiary.backend.model.ExerciseCourse;
import com.dwebss.fitdiary.backend.service.ExerciseCourseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by 엄성렬 on 2018/07/10.
*/
@RestController
@RequestMapping("/exercise/course")
public class ExerciseCourseController {
    @Resource
    private ExerciseCourseService exerciseCourseService;

    @PostMapping
    public Result add(@RequestBody ExerciseCourse exerciseCourse) {
        exerciseCourseService.save(exerciseCourse);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        exerciseCourseService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody ExerciseCourse exerciseCourse) {
        exerciseCourseService.update(exerciseCourse);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        ExerciseCourse exerciseCourse = exerciseCourseService.findById(id);
        return ResultGenerator.genSuccessResult(exerciseCourse);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<ExerciseCourse> list = exerciseCourseService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
