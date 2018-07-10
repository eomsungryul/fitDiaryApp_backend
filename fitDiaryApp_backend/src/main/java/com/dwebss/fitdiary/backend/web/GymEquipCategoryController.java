package com.dwebss.fitdiary.backend.web;

import com.dwebss.fitdiary.backend.core.Result;
import com.dwebss.fitdiary.backend.core.ResultGenerator;
import com.dwebss.fitdiary.backend.model.GymEquipCategory;
import com.dwebss.fitdiary.backend.service.GymEquipCategoryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by 엄성렬 on 2018/07/10.
*/
@RestController
@RequestMapping("/gym/equip/category")
public class GymEquipCategoryController {
    @Resource
    private GymEquipCategoryService gymEquipCategoryService;

    @PostMapping
    public Result add(@RequestBody GymEquipCategory gymEquipCategory) {
        gymEquipCategoryService.save(gymEquipCategory);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        gymEquipCategoryService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody GymEquipCategory gymEquipCategory) {
        gymEquipCategoryService.update(gymEquipCategory);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        GymEquipCategory gymEquipCategory = gymEquipCategoryService.findById(id);
        return ResultGenerator.genSuccessResult(gymEquipCategory);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<GymEquipCategory> list = gymEquipCategoryService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
