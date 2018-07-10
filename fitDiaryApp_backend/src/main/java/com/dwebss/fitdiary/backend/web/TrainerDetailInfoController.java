package com.dwebss.fitdiary.backend.web;

import com.dwebss.fitdiary.backend.core.Result;
import com.dwebss.fitdiary.backend.core.ResultGenerator;
import com.dwebss.fitdiary.backend.model.TrainerDetailInfo;
import com.dwebss.fitdiary.backend.service.TrainerDetailInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by 엄성렬 on 2018/07/10.
*/
@RestController
@RequestMapping("/trainer/detail/info")
public class TrainerDetailInfoController {
    @Resource
    private TrainerDetailInfoService trainerDetailInfoService;

    @PostMapping
    public Result add(@RequestBody TrainerDetailInfo trainerDetailInfo) {
        trainerDetailInfoService.save(trainerDetailInfo);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        trainerDetailInfoService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody TrainerDetailInfo trainerDetailInfo) {
        trainerDetailInfoService.update(trainerDetailInfo);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        TrainerDetailInfo trainerDetailInfo = trainerDetailInfoService.findById(id);
        return ResultGenerator.genSuccessResult(trainerDetailInfo);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<TrainerDetailInfo> list = trainerDetailInfoService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
