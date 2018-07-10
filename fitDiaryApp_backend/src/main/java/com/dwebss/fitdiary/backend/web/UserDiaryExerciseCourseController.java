package com.dwebss.fitdiary.backend.web;

import com.dwebss.fitdiary.backend.core.Result;
import com.dwebss.fitdiary.backend.core.ResultGenerator;
import com.dwebss.fitdiary.backend.model.UserDiaryExerciseCourse;
import com.dwebss.fitdiary.backend.service.UserDiaryExerciseCourseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by 엄성렬 on 2018/07/10.
*/
@RestController
@RequestMapping("/user/diary/exercise/course")
public class UserDiaryExerciseCourseController {
    @Resource
    private UserDiaryExerciseCourseService userDiaryExerciseCourseService;

    @PostMapping
    public Result add(@RequestBody UserDiaryExerciseCourse userDiaryExerciseCourse) {
        userDiaryExerciseCourseService.save(userDiaryExerciseCourse);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        userDiaryExerciseCourseService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody UserDiaryExerciseCourse userDiaryExerciseCourse) {
        userDiaryExerciseCourseService.update(userDiaryExerciseCourse);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        UserDiaryExerciseCourse userDiaryExerciseCourse = userDiaryExerciseCourseService.findById(id);
        return ResultGenerator.genSuccessResult(userDiaryExerciseCourse);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<UserDiaryExerciseCourse> list = userDiaryExerciseCourseService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
