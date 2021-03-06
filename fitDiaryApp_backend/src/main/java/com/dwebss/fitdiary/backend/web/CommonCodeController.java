package com.dwebss.fitdiary.backend.web;

import java.util.List;

import javax.annotation.Resource;

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
import com.dwebss.fitdiary.backend.model.CommonCode;
import com.dwebss.fitdiary.backend.service.CommonCodeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
* Created by 엄성렬 on 2018/07/10.
*/
@RestController
@RequestMapping("/code")
public class CommonCodeController {
    @Resource
    private CommonCodeService commonCodeService;

    @PostMapping
    public Result add(@RequestBody CommonCode commonCode) {
        commonCodeService.save(commonCode);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        commonCodeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody CommonCode commonCode) {
        commonCodeService.update(commonCode);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{codeCategoryId}")
    public Result selectCodeCategory(@PathVariable Integer codeCategoryId) {
        List<CommonCode> list = commonCodeService.selectCodeCategory(codeCategoryId);
        return ResultGenerator.genSuccessResult(list);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<CommonCode> list = commonCodeService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
