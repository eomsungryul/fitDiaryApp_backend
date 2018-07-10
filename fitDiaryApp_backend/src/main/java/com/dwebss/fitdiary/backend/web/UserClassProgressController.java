package com.dwebss.fitdiary.backend.web;

import com.dwebss.fitdiary.backend.core.Result;
import com.dwebss.fitdiary.backend.core.ResultGenerator;
import com.dwebss.fitdiary.backend.model.UserClassProgress;
import com.dwebss.fitdiary.backend.service.UserClassProgressService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by 엄성렬 on 2018/07/10.
*/
@RestController
@RequestMapping("/user/class/progress")
public class UserClassProgressController {
    @Resource
    private UserClassProgressService userClassProgressService;

    @PostMapping
    public Result add(@RequestBody UserClassProgress userClassProgress) {
        userClassProgressService.save(userClassProgress);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        userClassProgressService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody UserClassProgress userClassProgress) {
        userClassProgressService.update(userClassProgress);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        UserClassProgress userClassProgress = userClassProgressService.findById(id);
        return ResultGenerator.genSuccessResult(userClassProgress);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<UserClassProgress> list = userClassProgressService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
