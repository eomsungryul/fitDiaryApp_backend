package com.dwebss.fitdiary.backend.web;

import com.dwebss.fitdiary.backend.core.Result;
import com.dwebss.fitdiary.backend.core.ResultGenerator;
import com.dwebss.fitdiary.backend.model.UserInbodyDetail;
import com.dwebss.fitdiary.backend.service.UserInbodyDetailService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
* Created by 엄성렬 on 2018/07/16.
*/
@RestController
@RequestMapping("/user/inbody/detail")
public class UserInbodyDetailController {
    @Resource
    private UserInbodyDetailService userInbodyDetailService;

    @PostMapping
    public Result add(@RequestBody UserInbodyDetail userInbodyDetail) {
        userInbodyDetailService.save(userInbodyDetail);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        userInbodyDetailService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody UserInbodyDetail userInbodyDetail) {
    	
     	for (Map<String, Integer> il : userInbodyDetail.getList()) {
    		UserInbodyDetail inbodyDetailVO = new UserInbodyDetail();
    		inbodyDetailVO.setUserInbodyId(userInbodyDetail.getUserInbodyId());
    		inbodyDetailVO.setInbodyCd(il.get("inbodyCd"));
    		inbodyDetailVO.setInbodyCdValue(il.get("inbodyCdValue"));
    		userInbodyDetailService.updateDetail(inbodyDetailVO);
    	}
        
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        UserInbodyDetail userInbodyDetail = userInbodyDetailService.findById(id);
        return ResultGenerator.genSuccessResult(userInbodyDetail);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<UserInbodyDetail> list = userInbodyDetailService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
