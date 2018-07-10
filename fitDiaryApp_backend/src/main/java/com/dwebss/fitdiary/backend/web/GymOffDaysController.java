package com.dwebss.fitdiary.backend.web;

import com.dwebss.fitdiary.backend.core.Result;
import com.dwebss.fitdiary.backend.core.ResultGenerator;
import com.dwebss.fitdiary.backend.model.GymOffDays;
import com.dwebss.fitdiary.backend.service.GymOffDaysService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by 엄성렬 on 2018/07/10.
*/
@RestController
@RequestMapping("/gym/off/days")
public class GymOffDaysController {
    @Resource
    private GymOffDaysService gymOffDaysService;

    @PostMapping
    public Result add(@RequestBody GymOffDays gymOffDays) {
        gymOffDaysService.save(gymOffDays);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        gymOffDaysService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody GymOffDays gymOffDays) {
        gymOffDaysService.update(gymOffDays);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        GymOffDays gymOffDays = gymOffDaysService.findById(id);
        return ResultGenerator.genSuccessResult(gymOffDays);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<GymOffDays> list = gymOffDaysService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
