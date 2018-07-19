package com.dwebss.fitdiary.backend.web;

import com.dwebss.fitdiary.backend.core.Result;
import com.dwebss.fitdiary.backend.core.ResultGenerator;
import com.dwebss.fitdiary.backend.model.ExerciseInfo;
import com.dwebss.fitdiary.backend.model.User;
import com.dwebss.fitdiary.backend.model.UserDiary;
import com.dwebss.fitdiary.backend.model.UserDiaryExerciseCourse;
import com.dwebss.fitdiary.backend.model.UserExerciseRange;
import com.dwebss.fitdiary.backend.model.UserGym;
import com.dwebss.fitdiary.backend.model.UserInbodyDetail;
import com.dwebss.fitdiary.backend.service.ExerciseInfoService;
import com.dwebss.fitdiary.backend.service.UserDiaryExerciseCourseService;
import com.dwebss.fitdiary.backend.service.UserDiaryService;
import com.dwebss.fitdiary.backend.service.UserExerciseRangeService;
import com.dwebss.fitdiary.backend.service.UserGymService;
import com.dwebss.fitdiary.backend.service.UserInbodyDetailService;
import com.dwebss.fitdiary.backend.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mysql.jdbc.IterateBlock;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import static org.mockito.Matchers.intThat;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
    
    @Resource
    private UserExerciseRangeService userExerciseRangeService;

    @Resource
    private ExerciseInfoService exerciseInfoService;
    
    @Resource
    private UserInbodyDetailService userInbodyDetailService;
    
    @Value("${exerciseCnt}") 
	String exerciseCnt;
    
    @Value("${dayCnt}")  
	String dayCnt;
    
    
    @Value("${bmiWeight}")  
    String bmiWeight;
    
    
    @Value("${muscleWeight}")  
    String muscleWeight;
    
    @Value("${fatWeight}")  
    String fatWeight;

    @Transactional(rollbackFor=Exception.class)
    @PostMapping
    public Result add(@RequestBody User user) {
        
    	
    	userService.save(user);
    	List<UserGym> userGym = user.getUserGymList();
    	
    	for (UserGym ug : userGym) {
    		ug.setUserId(user.getUserId());
			//insert
			userGymService.save(ug);
    	}

    	List<UserExerciseRange> userExerciseRange = user.getUserExerciseRangeList();
    	for (UserExerciseRange ug : userExerciseRange) {
    		ug.setUserId(user.getUserId());
			//insert
            userExerciseRangeService.save(ug);
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

    @Transactional(rollbackFor=Exception.class)
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

    	List<UserExerciseRange> userExerciseRange = user.getUserExerciseRangeList();
    	if(userExerciseRange.size()>0) {
    		userExerciseRangeService.delete(user.getUserId());
    		for (UserExerciseRange ug : userExerciseRange) {
    			ug.setUserId(user.getUserId());
    			//insert
    			userExerciseRangeService.save(ug);
    		}
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

    @GetMapping("/exercise_day/{userId}")
    public Result exerciseDay(@PathVariable Integer userId) {
    	
    	Integer res = userDiaryService.selectExerciseDay(userId);
    	
        return ResultGenerator.genSuccessResult(res);
    }
    
    
    //운동코스를 만드는 기능
    @GetMapping("/exercise_course/test")
    public Result exerciseCourseAdd(ExerciseInfo vo) {
    	
    	// 1. userID를 이용하여 사용자의 운동부위를 가져온다. 
        List<UserExerciseRange> res = userExerciseRangeService.selectUserRange(0);
        
        // 2. 무산소 운동을 가져온다. 
        vo.setCardioYn("Y");
        List<ExerciseInfo> exerList = exerciseInfoService.selectExerciseInfoList(vo);

        // 3. 유산소 운동을 가져온다. 
        vo.setCardioYn("N");
        List<ExerciseInfo> cardioList = exerciseInfoService.selectExerciseInfoList(vo);
        
        UserGym param = new UserGym();
        param.setGymId(0);
        param.setUserId(0);
        // 4. 사용자의 유산소 운동 비율을 가져온다. 
        UserGym userInfo = userGymService.select(param);
        int userCadioRatio = userInfo.getUserCardioRatio().intValue();
        
        // 5. 날짜값을 프로퍼티에서 가져온다.
        int day = Integer.parseInt( dayCnt);
        
        //6. 유산소 무산소 비율을 정한다.
        int allCnt = Integer.parseInt( exerciseCnt); 
        int exerset = Integer.parseInt( exerciseCnt); 
        int cardioSet = (allCnt*userCadioRatio)/100; //유산소 세트 
        exerset = allCnt-cardioSet;
        
        for (int i = 0; i < day; i++) {
        	//7.사용자 일일 다이어리에 추가한다.
        	UserDiary udVo = new UserDiary();
        	userDiaryService.save(udVo);
        	List<UserDiaryExerciseCourse> list = null;
        	
        	for(int j = 0; j < allCnt; j++) {
        		//8. 사용자 일일 다이어리 운동코스 정보를 vo에 담는다.
        		UserDiaryExerciseCourse udecVo = new UserDiaryExerciseCourse();
        		udecVo.setExerciseOrder(j+1);
        		
        		//9. 운동정보 아이디는 유산소 무산소 비율에 따라 유산소를 넣을지 무산소를 넣을지 결정한다.
        		if(j<=cardioSet) {
        			udecVo.setExerciseInfoId( cardioList.get( ((allCnt+i)+j+1) % cardioList.size() ).getExerciseInfoId() );
        		}else {
        			udecVo.setExerciseInfoId( exerList.get( ((allCnt+i)+j+1) % exerList.size() ).getExerciseInfoId() );
        		}
        		
        		//10. 사용자 일일 다이어리 운동코스 정보를 넣는다 
        		list.add(udecVo);
        	}
        	userDiaryExerciseCourseService.save(list);
        }
        
        return ResultGenerator.genSuccessResult(res);
    }
    
    

    @GetMapping("/body_stat/{userId}")
    public Result bodyStat(@PathVariable Integer userId) {
    	
    	int ww = Integer.parseInt( exerciseCnt);
    	System.out.println("test" +ww);
    	
    	List<UserInbodyDetail> res = userInbodyDetailService.selectUserBodyStat(userId);
    	
        return ResultGenerator.genSuccessResult(res);
    }
    

    	
    @GetMapping("/log/{userId}/{startDate}/{endDate}")
    public Result bodyStat(@PathVariable Integer userId, 
    		@PathVariable @DateTimeFormat(pattern = "yyyyMMdd") LocalDate startDate, 
    		@PathVariable @DateTimeFormat(pattern = "yyyyMMdd") LocalDate endDate) {

    	Map<String,Object> param = new HashMap<String, Object>();
    	
    	param.put("fatWeight", Double.parseDouble(fatWeight));
    	param.put("muscleWeight", Double.parseDouble(muscleWeight));
    	param.put("bmiWeight", Double.parseDouble(bmiWeight));

    	param.put("userId", userId);
    	param.put("startDate", java.sql.Date.valueOf(startDate));
    	param.put("endDate", java.sql.Date.valueOf(endDate));
    	
    	
    	Map<String,Object> res = new HashMap<String, Object>();
    	List<Map<String,Object>> bodyRank = userInbodyDetailService.selectUserBodyRank(param);
    	res.put("bodyRank", bodyRank);

    	List<Map<String,Object>> bodyWeight = userInbodyDetailService.selectUserBodyWeight(param);
    	res.put("bodyWeight", bodyWeight);
    	
    	//{ bodyRank: {scorePct=100.0, score=150.0, user_inbody_log_insert_dt=2018-07-19 04:42:54.0, user_id=0, muscle=40, fat=30, scoreRank=1.0, bmi=80}}
    	
    	return ResultGenerator.genSuccessResult(res);
    }
    
    
    
}
