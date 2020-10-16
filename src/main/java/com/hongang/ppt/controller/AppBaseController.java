package com.hongang.ppt.controller;

import com.hongang.ppt.common.IsInvalidDto;
import com.hongang.ppt.common.Result;
import com.hongang.ppt.common.vo.*;
import com.hongang.ppt.service.PlanCustomServiceImpl;
import com.hongang.ppt.common.vo.*;
import com.hongang.ppt.service.AppBaseServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiOperationSort;
import io.swagger.annotations.ApiSort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("base")
@ApiSort(2)
@Api(value = "base", tags = "内购接口", description = "内购接口")
public class AppBaseController {

    @Autowired
    private AppBaseServiceImpl appBaseService;

    @Autowired
    private PlanCustomServiceImpl planCustomService;


    @ApiOperation(value = "广告是否打开", response = IsInvalidDto.class,position = 1)
    @PostMapping(value = "/isOpen")
    public Result isOpen(@Valid @RequestBody IsInvalidVo isInvalidVo) {
        return appBaseService.isOpen(isInvalidVo);
    }


    @ApiOperation(value = "配置文案信息",position = 3)
    @PostMapping(value = "/savePlanInfo")
    public Result savePlanInfo(@Valid @RequestBody List<AppPlanVo> planVoList, @RequestParam(value = "version",required = true) String version) {
        return appBaseService.savePlanInfo(planVoList,version);
    }

    @ApiOperation(value = "查询文案信息",position = 4)
    @PostMapping(value = "/selectPlanInfo")
    public Result selectPlanInfo(@Valid @RequestBody VersionVo versionVo) {
        return appBaseService.selectPlanInfo(versionVo);
    }

    @ApiOperation(value = "内网支付成功生成订单",position = 2)
    @PostMapping(value = "/verification")
    public Result verification(@Valid @RequestBody AppOrderVo orderVo) {
        return appBaseService.verification(orderVo);
    }

    @ApiOperation(value = "配置订制文案",position = 5)
    @PostMapping(value = "/savePlanCustom")
    public Result savePlanCustom(@Valid @RequestBody List<PlanCustomVo> planCustomVoList, @RequestParam(value = "version",required = true)String version) {
        return planCustomService.savePlanCustom(planCustomVoList,version);
    }

    @ApiOperation(value = "查询订制文案",position = 6)
    @PostMapping(value = "/selectPlanCustom")
    public Result selectPlanCustom(@Valid @RequestBody VersionVo versionVo) {
        return planCustomService.selectPlanCustom(versionVo);
    }
}
