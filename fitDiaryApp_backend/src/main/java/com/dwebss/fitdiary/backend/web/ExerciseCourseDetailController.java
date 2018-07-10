package com.dwebss.fitdiary.backend.web;

import com.dwebss.fitdiary.backend.core.Result;
import com.dwebss.fitdiary.backend.core.ResultGenerator;
import com.dwebss.fitdiary.backend.model.ExerciseCourseDetail;
import com.dwebss.fitdiary.backend.service.ExerciseCourseDetailService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by 엄성렬 on 2018/07/10.
*/
@RestController
@RequestMapping("/exercise/course/detail")
public class ExerciseCourseDetailController {
    @Resource
    private ExerciseCourseDetailService exerciseCourseDetailService;

    @PostMapping
    public Result add(@RequestBody ExerciseCourseDetail exerciseCourseDetail) {
        exerciseCourseDetailService.save(exerciseCourseDetail);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        exerciseCourseDetailService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody ExerciseCourseDetail exerciseCourseDetail) {
        exerciseCourseDetailService.update(exerciseCourseDetail);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        ExerciseCourseDetail exerciseCourseDetail = exerciseCourseDetailService.findById(id);
        return ResultGenerator.genSuccessResult(exerciseCourseDetail);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<ExerciseCourseDetail> list = exerciseCourseDetailService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
