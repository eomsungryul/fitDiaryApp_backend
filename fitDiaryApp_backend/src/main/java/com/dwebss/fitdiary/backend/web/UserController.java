package com.dwebss.fitdiary.backend.web;

import com.dwebss.fitdiary.backend.core.Result;
import com.dwebss.fitdiary.backend.core.ResultGenerator;
import com.dwebss.fitdiary.backend.model.User;
import com.dwebss.fitdiary.backend.model.UserDiary;
import com.dwebss.fitdiary.backend.model.UserDiaryExerciseCourse;
import com.dwebss.fitdiary.backend.model.UserGym;
import com.dwebss.fitdiary.backend.service.UserDiaryExerciseCourseService;
import com.dwebss.fitdiary.backend.service.UserDiaryService;
import com.dwebss.fitdiary.backend.service.UserGymService;
import com.dwebss.fitdiary.backend.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

/**
* Created by 엄성렬 on 2018/07/10.
*/
@RestController
@RequestMapping("/user")
public class UserController {
	
    @Resource
    private UserService userService;

    @Resource
    private UserGymService userGymService;

    @Resource
    private UserDiaryService userDiaryService;
    
    @Resource
    private UserDiaryExerciseCourseService userDiaryExerciseCourseService;
    


    @PostMapping
    public Result add(@RequestBody User user) {
        
    	
    	userService.save(user);
    	List<UserGym> userGym = user.getUserGymList();
    	
    	for (UserGym ug : userGym) {
    		ug.setUserId(user.getUserId());
			//insert
			userGymService.save(ug);
    	}
    	
    	
//    	for (UserGym ug : userGym) {
//    		ug.setUserId(user.getUserId());
//    		UserGym res = userGymService.select(ug);
//    		if(res==null) {
//    			//insert
////    			userGymService.save(ug);
//    			System.out.println("in");
//    		}else {
//    			//update
////    			userGymService.update(ug);
//    			System.out.println("up");
//    		}
//    	}
    	
    	
    	
        return ResultGenerator.genSuccessResult(user);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        userService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/{id}")
    public Result update(@RequestBody User user, @PathVariable Integer id) {
    	user.setUserId(id);
        userService.update(user);
        
    	List<UserGym> userGym = user.getUserGymList();
    	for (UserGym ug : userGym) {
    		ug.setUserId(user.getUserId());
    		
			//update
			userGymService.update(ug);
    	}
        return ResultGenerator.genSuccessResult(user);
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        User user = userService.findById(id);
        return ResultGenerator.genSuccessResult(user);
    }
    
    @GetMapping("/email/{userEmail:.+}")
    public Result detail(@PathVariable String userEmail) {
    	User user = new User();
    	user.setUserEmail(userEmail);
    	User res = userService.selectUser(user);
    	return ResultGenerator.genSuccessResult(res);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<User> list = userService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
    

    @GetMapping("/exercise_course/{userId}/{dairyWriteD}")
    public Result exerciseCourse(@PathVariable Integer userId, @PathVariable @DateTimeFormat(pattern = "yyyyMMdd") LocalDate dairyWriteD) {
        UserDiary userDiary = new UserDiary();
        userDiary.setUserId(userId);
        userDiary.setDairyWriteD(java.sql.Date.valueOf(dairyWriteD));
        List<UserDiary> res = userDiaryService.selectTodayExerciseCourse(userDiary);
    	
    	
    	//TODO 3-3.백엔드서버에서 추천 운동코스 생성
    	//운동 코스가 없고 조회 날짜가 오늘인 경우에 운동코스 생성한다.
//    	if(res==null&& dairyWriteD.equals(obj)) {
//    		
//    	}
        return ResultGenerator.genSuccessResult(res);
    }

    @PutMapping("/exercise_course/{userDiaryExerciseInfoId}")
    public Result exerciseCourseUpdate(@RequestBody UserDiaryExerciseCourse userDiaryExerciseCourse, @PathVariable Integer userDiaryExerciseInfoId) {
    	userDiaryExerciseCourse.setUserDiaryExerciseInfoId(userDiaryExerciseInfoId);
		userDiaryExerciseCourseService.update(userDiaryExerciseCourse);
        return ResultGenerator.genSuccessResult();
    }
    
}
