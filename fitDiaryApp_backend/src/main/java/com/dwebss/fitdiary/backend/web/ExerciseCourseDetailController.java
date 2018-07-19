package com.dwebss.fitdiary.backend.web;

import java.time.LocalDate;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.transaction.annotation.Transactional;
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
import com.dwebss.fitdiary.backend.model.ExerciseCourse;
import com.dwebss.fitdiary.backend.model.ExerciseCourseDetail;
import com.dwebss.fitdiary.backend.model.ExerciseCourseSetInfo;
import com.dwebss.fitdiary.backend.model.UserDiary;
import com.dwebss.fitdiary.backend.model.UserExerciseRange;
import com.dwebss.fitdiary.backend.service.ExerciseCourseDetailService;
import com.dwebss.fitdiary.backend.service.ExerciseCourseSetInfoService;
import com.dwebss.fitdiary.backend.service.UserDiaryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
* Created by 엄성렬 on 2018/07/10.
*/
@RestController
@RequestMapping("/exercise_course")
public class ExerciseCourseDetailController {
	
    @Resource
    private ExerciseCourseDetailService exerciseCourseDetailService;

    @Resource
    private ExerciseCourseSetInfoService exerciseCourseSetInfoService;

    @Transactional(rollbackFor=Exception.class)
    @PostMapping("/user")
    public Result add(@RequestBody ExerciseCourseDetail exerciseCourseDetail) {

    	exerciseCourseDetailService.insertDetail(exerciseCourseDetail);
    	List <ExerciseCourseSetInfo> list = exerciseCourseDetail.getExerciseCourseSetInfo();
    	
    	for(ExerciseCourseSetInfo infoVo :  list) {
    		infoVo.setExerciseCourseDetailId(exerciseCourseDetail.getExerciseCourseDetailId());
    		exerciseCourseSetInfoService.save(infoVo);
    	}
   
        return ResultGenerator.genSuccessResult();
    }

    @Transactional(rollbackFor=Exception.class)
    @DeleteMapping("/{exerciseCourseDetailId}")
    public Result delete(@PathVariable Integer exerciseCourseDetailId) {
    	ExerciseCourseDetail exerciseCourseDetail = new ExerciseCourseDetail();
    	exerciseCourseDetail.setExerciseCourseDetailId(exerciseCourseDetailId);
		exerciseCourseSetInfoService.deleteSetInfo(exerciseCourseDetail.getExerciseCourseDetailId());
        exerciseCourseDetailService.deleteById(exerciseCourseDetailId);
        return ResultGenerator.genSuccessResult();
    }

    @Transactional(rollbackFor=Exception.class)
    @PutMapping("/detail/{exerciseCourseDetailId}")
    public Result update(@RequestBody ExerciseCourseDetail exerciseCourseDetail, @PathVariable Integer exerciseCourseDetailId) {
    	exerciseCourseDetail.setExerciseCourseDetailId(exerciseCourseDetailId);
        exerciseCourseDetailService.update(exerciseCourseDetail);

    	List <ExerciseCourseSetInfo> list = exerciseCourseDetail.getExerciseCourseSetInfo();
    	if(list.size()>0) {
    		exerciseCourseSetInfoService.deleteSetInfo(exerciseCourseDetail.getExerciseCourseDetailId());
        	for(ExerciseCourseSetInfo infoVo :  list) {
        		infoVo.setExerciseCourseDetailId(exerciseCourseDetail.getExerciseCourseDetailId());
        		exerciseCourseSetInfoService.save(infoVo);
        	}
    	}
        
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
    
    


    @GetMapping("/user/{userId}")
    public Result exerciseCourse(@PathVariable Integer userId) {

    	List<ExerciseCourseDetail> res = exerciseCourseDetailService.selectUserExerciseDetail(userId);

    	for(ExerciseCourseDetail vo :  res) {
    		Integer detailId = vo.getExerciseCourseDetailId();
    		vo.setExerciseCourseSetInfo(exerciseCourseSetInfoService.selectUserSetInfo(detailId));
    	}
        
        
        return ResultGenerator.genSuccessResult(res);
    }
}
