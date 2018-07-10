package com.dwebss.fitdiary.backend.web;

import com.dwebss.fitdiary.backend.core.Result;
import com.dwebss.fitdiary.backend.core.ResultGenerator;
import com.dwebss.fitdiary.backend.model.GymMembership;
import com.dwebss.fitdiary.backend.service.GymMembershipService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by 엄성렬 on 2018/07/10.
*/
@RestController
@RequestMapping("/gym/membership")
public class GymMembershipController {
    @Resource
    private GymMembershipService gymMembershipService;

    @PostMapping
    public Result add(@RequestBody GymMembership gymMembership) {
        gymMembershipService.save(gymMembership);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        gymMembershipService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody GymMembership gymMembership) {
        gymMembershipService.update(gymMembership);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        GymMembership gymMembership = gymMembershipService.findById(id);
        return ResultGenerator.genSuccessResult(gymMembership);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<GymMembership> list = gymMembershipService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
