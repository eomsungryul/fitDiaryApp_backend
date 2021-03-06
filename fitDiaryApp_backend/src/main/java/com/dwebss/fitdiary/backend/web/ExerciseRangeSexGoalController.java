package com.dwebss.fitdiary.backend.web;

import com.dwebss.fitdiary.backend.core.Result;
import com.dwebss.fitdiary.backend.core.ResultGenerator;
import com.dwebss.fitdiary.backend.model.ExerciseRangeSexGoal;
import com.dwebss.fitdiary.backend.service.ExerciseRangeSexGoalService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by 엄성렬 on 2018/07/10.
*/
@RestController
@RequestMapping("/exercise/range/sex/goal")
public class ExerciseRangeSexGoalController {
    @Resource
    private ExerciseRangeSexGoalService exerciseRangeSexGoalService;

    @PostMapping
    public Result add(@RequestBody ExerciseRangeSexGoal exerciseRangeSexGoal) {
        exerciseRangeSexGoalService.save(exerciseRangeSexGoal);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        exerciseRangeSexGoalService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody ExerciseRangeSexGoal exerciseRangeSexGoal) {
        exerciseRangeSexGoalService.update(exerciseRangeSexGoal);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        ExerciseRangeSexGoal exerciseRangeSexGoal = exerciseRangeSexGoalService.findById(id);
        return ResultGenerator.genSuccessResult(exerciseRangeSexGoal);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<ExerciseRangeSexGoal> list = exerciseRangeSexGoalService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
